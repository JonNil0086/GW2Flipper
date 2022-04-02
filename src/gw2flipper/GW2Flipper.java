package gw2flipper;

import java.awt.Dimension;

/* GW2Flipper
 * -----------------------------------------------------------------------------
 * A small calculator that can be used for calculating GW2 buy / sell cuts.
 * -----------------------------------------------------------------------------
 * Notes:       - coin1.png free to use from:
 *                  https://opengameart.org/users/austinjeong
 * -----------------------------------------------------------------------------
 * TODO:        None
 * -----------------------------------------------------------------------------
 * Author:      Jonas Nilsson
 * Date:        22-04-01
 * Version:     1.0
 */
public class GW2Flipper {
    public static void main(String[] args) {       
        GUI gui = new GUI("GW2 Flipper", new Dimension(490, 390));
        gui.show();
    }
}