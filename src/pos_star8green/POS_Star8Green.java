/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_star8green;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Patrick Dale
 */
public class POS_Star8Green {

    /**
     * @param args the command line arguments
     */
    static Splash_screen ss = new Splash_screen();
    public static void main(String[] args) {
        ss.setVisible(true);
        splash.start();
    }
    
    static int time=10;
    public static Timer splash = new Timer(1000,new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e) {
        time--;
        if (time<=0){
            splash.stop();
            ss.dispose();
            new Login_frame().setVisible(true);
            
        }
    }
    });
    
}
