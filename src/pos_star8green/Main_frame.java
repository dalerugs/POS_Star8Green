/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_star8green;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Patrick Dale
 */
public class Main_frame extends javax.swing.JFrame  {
    
    /**
     * Creates new form main_frame
     */
    public Main_frame() {
        initComponents();
        initialize();
    }
    
    
    private void initialize(){
        
        this.setIconImage(new ImageIcon(this.getClass().getResource("/Images/star8green_icon.png")).getImage());
        
//        Make the frame fullscreen
        Toolkit tk = Toolkit.getDefaultToolkit();
        int Xsize=(int)tk.getScreenSize().getWidth();
        int Ysize=(int)tk.getScreenSize().getHeight();
        this.setSize(Xsize,Ysize);
        
//        Set background color to white
        this.getContentPane().setBackground(Color.WHITE);
        
//        Start System Time
        LocalDateTime now = LocalDateTime.now();
        sysTime_label.setText(dtf.format(now));
        system_time.start();
        
//        Resize Header Image
        Image image = new ImageIcon(this.getClass().getResource("/Images/main_frame_header.PNG")).getImage().getScaledInstance(header_label.getWidth(), header_label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon header = new ImageIcon(image);
        header_label.setIcon(header);
        
//        Set Panels
        main_panel.setLayout(layout);
        main_panel.add(NCD_error);
        main_panel.add(IC_error);
        main_panel.add(SJ_panel);
        main_panel.add(LC_panel);
        NCD_error.setVisible(true);
        IC_error.setVisible(false);
        SJ_panel.setVisible(false);
        LC_panel.setVisible(false);
    }
    
//    Deselect All Buttons
    private void deselect_button(){
        singleJourney_button.setSelected(false);
        load_button.setSelected(false);
        registerCard_button.setSelected(false);
        cardDetails_button.setSelected(false);
        button3.setSelected(false);
        button4.setSelected(false);
        button5.setSelected(false);
    }
    
    private void hide_panels(){
        SJ_panel.setVisible(false);
        LC_panel.setVisible(false);
        NCD_error.setVisible(false);
        IC_error.setVisible(false);
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        sysTime_label1 = new javax.swing.JLabel();
        sysTime_label2 = new javax.swing.JLabel();
        sysTime_label = new javax.swing.JLabel();
        header_label = new javax.swing.JLabel();
        singleJourney_button = new javax.swing.JButton();
        main_panel = new javax.swing.JPanel();
        logout_button = new javax.swing.JButton();
        registerCard_button = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        cardDetails_button = new javax.swing.JButton();
        load_button = new javax.swing.JButton();

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Star 8 Green");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        sysTime_label1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sysTime_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sysTime_label1.setText("Some Text Here");
        sysTime_label1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sysTime_label2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sysTime_label2.setText("F1 - Single Journey | \nF2 - Load | \nF3 - Button1 | \nF4 - Button2 | \nF5 - Button3 | \nF6 - Button4 | \nF7 - Button5 | \nF8 - Logout");
        sysTime_label2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sysTime_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sysTime_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sysTime_label.setText("System Time");
        sysTime_label.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        header_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main_frame_header.PNG"))); // NOI18N
        header_label.setPreferredSize(new java.awt.Dimension(1000, 137));
        header_label.setRequestFocusEnabled(false);

        singleJourney_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/singleJourney_button.png"))); // NOI18N
        singleJourney_button.setBorder(null);
        singleJourney_button.setBorderPainted(false);
        singleJourney_button.setContentAreaFilled(false);
        singleJourney_button.setFocusPainted(false);
        singleJourney_button.setFocusable(false);
        singleJourney_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/singleJourney_button_click.png"))); // NOI18N
        singleJourney_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/singleJourney_button_hover.png"))); // NOI18N
        singleJourney_button.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/singleJourney_button_selected.png"))); // NOI18N
        singleJourney_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleJourney_buttonActionPerformed(evt);
            }
        });
        singleJourney_button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                singleJourney_buttonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout_button.PNG"))); // NOI18N
        logout_button.setBorder(null);
        logout_button.setBorderPainted(false);
        logout_button.setContentAreaFilled(false);
        logout_button.setFocusPainted(false);
        logout_button.setFocusable(false);
        logout_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout_button_click.PNG"))); // NOI18N
        logout_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout_button_hover.png"))); // NOI18N
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        registerCard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registerCard_button.png"))); // NOI18N
        registerCard_button.setBorder(null);
        registerCard_button.setBorderPainted(false);
        registerCard_button.setContentAreaFilled(false);
        registerCard_button.setFocusPainted(false);
        registerCard_button.setFocusable(false);
        registerCard_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registerCard_button_click.png"))); // NOI18N
        registerCard_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registerCard_button_hover.png"))); // NOI18N
        registerCard_button.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registerCard_button_selected.png"))); // NOI18N
        registerCard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCard_buttonActionPerformed(evt);
            }
        });

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button.png"))); // NOI18N
        button3.setBorder(null);
        button3.setBorderPainted(false);
        button3.setContentAreaFilled(false);
        button3.setFocusPainted(false);
        button3.setFocusable(false);
        button3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_click.png"))); // NOI18N
        button3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_hover.png"))); // NOI18N
        button3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_selected.png"))); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button.png"))); // NOI18N
        button5.setBorder(null);
        button5.setBorderPainted(false);
        button5.setContentAreaFilled(false);
        button5.setFocusPainted(false);
        button5.setFocusable(false);
        button5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_click.png"))); // NOI18N
        button5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_hover.png"))); // NOI18N
        button5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_selected.png"))); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button.png"))); // NOI18N
        button4.setBorder(null);
        button4.setBorderPainted(false);
        button4.setContentAreaFilled(false);
        button4.setFocusPainted(false);
        button4.setFocusable(false);
        button4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_click.png"))); // NOI18N
        button4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_hover.png"))); // NOI18N
        button4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_selected.png"))); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        cardDetails_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cardDetails_button.png"))); // NOI18N
        cardDetails_button.setBorder(null);
        cardDetails_button.setBorderPainted(false);
        cardDetails_button.setContentAreaFilled(false);
        cardDetails_button.setFocusPainted(false);
        cardDetails_button.setFocusable(false);
        cardDetails_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cardDetails_button_click.png"))); // NOI18N
        cardDetails_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cardDetails_button_hover.png"))); // NOI18N
        cardDetails_button.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cardDetails_button_selected.png"))); // NOI18N
        cardDetails_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardDetails_buttonActionPerformed(evt);
            }
        });

        load_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/load_button.png"))); // NOI18N
        load_button.setBorder(null);
        load_button.setBorderPainted(false);
        load_button.setContentAreaFilled(false);
        load_button.setFocusPainted(false);
        load_button.setFocusable(false);
        load_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/load_button_click.png"))); // NOI18N
        load_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/load_button_hover.png"))); // NOI18N
        load_button.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/load_button_selected.png"))); // NOI18N
        load_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header_label, javax.swing.GroupLayout.DEFAULT_SIZE, 1368, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sysTime_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sysTime_label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sysTime_label, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(singleJourney_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerCard_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(load_button, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardDetails_button, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(header_label, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(singleJourney_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerCard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(load_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardDetails_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(main_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sysTime_label2)
                    .addComponent(sysTime_label)
                    .addComponent(sysTime_label1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        deselect_button();
        button4.setSelected(true);
    }//GEN-LAST:event_button4ActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        deselect_button();
        int confirm=JOptionPane.showConfirmDialog(this,"Are you sure you want to logout?","Warning",JOptionPane.WARNING_MESSAGE);
        if(confirm==JOptionPane.YES_OPTION){
            this.dispose();
            new Login_frame().setVisible(true);
        }
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void singleJourney_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleJourney_buttonActionPerformed
        deselect_button();
        singleJourney_button.setSelected(true);
        hide_panels();
        SJ_panel.setVisible(true);
        
    }//GEN-LAST:event_singleJourney_buttonActionPerformed

    private void singleJourney_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_singleJourney_buttonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_singleJourney_buttonKeyPressed

//    Buttons Hotkeys
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_F1){
               singleJourney_button.doClick();
           }
        if(evt.getKeyCode()==KeyEvent.VK_F2){
               load_button.doClick();
           }
        if(evt.getKeyCode()==KeyEvent.VK_F3){
               registerCard_button.doClick();
           }
        if(evt.getKeyCode()==KeyEvent.VK_F4){
               cardDetails_button.doClick();
           }
        if(evt.getKeyCode()==KeyEvent.VK_F5){
               button3.doClick();
           }
        if(evt.getKeyCode()==KeyEvent.VK_F6){
               button4.doClick();
           }
        if(evt.getKeyCode()==KeyEvent.VK_F7){
               button5.doClick();
           }
        if(evt.getKeyCode()==KeyEvent.VK_F8){
               logout_button.doClick();
           }
    }//GEN-LAST:event_formKeyPressed

    private void load_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_buttonActionPerformed
        deselect_button();
        load_button.setSelected(true);
        hide_panels();
        LC_panel.setVisible(true);
    }//GEN-LAST:event_load_buttonActionPerformed

    private void registerCard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCard_buttonActionPerformed
        deselect_button();
        registerCard_button.setSelected(true);
    }//GEN-LAST:event_registerCard_buttonActionPerformed

    private void cardDetails_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardDetails_buttonActionPerformed
        deselect_button();
        cardDetails_button.setSelected(true);
    }//GEN-LAST:event_cardDetails_buttonActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        deselect_button();
        button3.setSelected(true);
    }//GEN-LAST:event_button3ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        deselect_button();
        button5.setSelected(true);
    }//GEN-LAST:event_button5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_frame().setVisible(true);
            }
        });
    }
    
    private final Timer system_time = new Timer(1000,new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e) {
        LocalDateTime now = LocalDateTime.now();
        sysTime_label.setText(dtf.format(now));
    }
    });

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton cardDetails_button;
    private javax.swing.JLabel header_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JButton load_button;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel main_panel;
    private javax.swing.JButton registerCard_button;
    private javax.swing.JButton singleJourney_button;
    private javax.swing.JLabel sysTime_label;
    private javax.swing.JLabel sysTime_label1;
    private javax.swing.JLabel sysTime_label2;
    // End of variables declaration//GEN-END:variables
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM d, u | H:mm:ss a");
    GridBagLayout layout = new GridBagLayout();
    No_card_detected NCD_error = new No_card_detected();
    Invalid_card IC_error = new Invalid_card();
    Single_journey SJ_panel = new Single_journey();
    Load_card LC_panel = new Load_card();
    
}



