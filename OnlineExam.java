/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineexam;

import java.awt.Point;

/**
 *
 * @author Nagendra
 */
public class OnlineExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {

        }
        MainFrame f = new MainFrame();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
