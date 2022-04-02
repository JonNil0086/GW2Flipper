package gw2flipper;

import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/* GUI
 * -----------------------------------------------------------------------------
 * Creates the mainframe with a panel.
 * -----------------------------------------------------------------------------
 * Notes:       None
 * -----------------------------------------------------------------------------
 * TODO:        None
 * -----------------------------------------------------------------------------
 * Author:      Jonas Nilsson
 * Date:        22-04-01
 * Version:     1.0
 */
public class GUI {
    
    private final JFrame mainFrame = new JFrame();
    
    /* GUI
     * --------------------------------------------------
     * Constructor used for initialization.
     * --------------------------------------------------
     * Input:   (title): Title of the frame
     *          (dimension): Dimensions of the frame
     * Output:  The profit made
     * --------------------------------------------------
     */
    public GUI(String title, Dimension dimension) {
        mainFrame.setTitle(title);
        mainFrame.setSize(dimension);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.add(new MainPanel());
        mainFrame.setResizable(false);
    }
    
    // Set the frame visible
    public void show() {
        mainFrame.setVisible(true);
    }   
}