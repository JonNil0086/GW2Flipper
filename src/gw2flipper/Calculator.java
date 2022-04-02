package gw2flipper;

/* Calculator
 * -----------------------------------------------------------------------------
 * Contains methods for calculating fees and listings.
 * -----------------------------------------------------------------------------
 * Notes:       None
 * -----------------------------------------------------------------------------
 * TODO:        None
 * -----------------------------------------------------------------------------
 * Author:      Jonas Nilsson
 * Date:        22-04-01
 * Version:     1.0
 */
public class Calculator {
    // Fixed values in the game
    private final double listingFee = 0.05;
    private final double exchangeFee = 0.10;

    /* calculateProfit
     * --------------------------------------------------
     * Calculates the profit depending on buy and sell
     * price.
     * --------------------------------------------------
     * Input:   (buyPrice): The price to buy the item
     *          (sellPrice): The price to sell the item
     * Output:  The profit made
     * --------------------------------------------------
     */
    public int calculateProfit(double buyPrice, double sellPrice) {
        int listingCost = calculateListingFee(sellPrice);
        int exchangeCost = calculateTradingPostCut(sellPrice);
        double profit = (sellPrice - buyPrice) - (listingCost + exchangeCost);
        return (int)Math.round(profit);
    }
    
    /* calculateListingFee
     * --------------------------------------------------
     * Calculates the listing fee.
     * --------------------------------------------------
     * Input:   (sellPrice): The price to sell the item
     * Output:  The listing fee
     * --------------------------------------------------
     */
    public int calculateListingFee(double sellPrice) {
        if(sellPrice == 0) {
            return 0;
        }
        double listingCost = sellPrice * listingFee;
        if(listingCost < 1.0) {
            listingCost = 1.0;
        } else {
           listingCost = Math.round(listingCost);
        }
        return (int)listingCost;
    }
    
    /* calculateTradingPostCut
     * --------------------------------------------------
     * Calculates the trading post cut.
     * --------------------------------------------------
     * Input:   (sellPrice): The price to sell the item
     * Output:  The trading post cut
     * --------------------------------------------------
     */
    public int calculateTradingPostCut(double sellPrice){
        if(sellPrice == 0) {
            return 0;
        }
        double exchangeCost = sellPrice * exchangeFee;
        if(exchangeCost < 1.0) {
            exchangeCost = 1.0;
        } else {
            exchangeCost = Math.round(exchangeCost);
        }
        return (int)exchangeCost;
    }
    
    /* calculateBreakEven
     * --------------------------------------------------
     * Calculates the break even sell price
     * --------------------------------------------------
     * Input:   (buyPrice): The price to buy the item
     * Output:  The break even number
     * --------------------------------------------------
     */
    public int calculateBreakEven(double buyPrice) {
        if(buyPrice == 0) {
            return 0;
        }       
        double sellPrice = buyPrice;
        int tempListingFee;
        int tempExchangeFee;
        do {
            sellPrice += 1;
            tempListingFee = calculateListingFee(sellPrice);
            tempExchangeFee = calculateTradingPostCut(sellPrice);
        } while (sellPrice - tempListingFee - tempExchangeFee != buyPrice);      
        return (int)sellPrice;
    } 
}