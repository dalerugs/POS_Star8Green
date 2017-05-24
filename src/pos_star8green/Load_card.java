/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_star8green;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Dale
 */
public class Load_card extends javax.swing.JPanel {

    /**
     * Creates new form Load_card
     */
    public Load_card() {
        initComponents();
        reciept_panel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        button_200 = new javax.swing.JButton();
        button_1000 = new javax.swing.JButton();
        button_100 = new javax.swing.JButton();
        button_500 = new javax.swing.JButton();
        otherAmount_textField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        recievedCash_textField = new javax.swing.JTextField();
        ok_button = new javax.swing.JButton();
        reciept_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        recievedCash_label = new javax.swing.JLabel();
        change_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        cancel_button = new javax.swing.JButton();
        confirm_button = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(983, 578));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 90, 43));
        jLabel1.setText("LOAD CARD");

        button_200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_200.PNG"))); // NOI18N
        button_200.setBorder(null);
        button_200.setBorderPainted(false);
        button_200.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_200_click.png"))); // NOI18N
        button_200.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_200_hover.PNG"))); // NOI18N
        button_200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_200ActionPerformed(evt);
            }
        });

        button_1000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_1000.PNG"))); // NOI18N
        button_1000.setBorder(null);
        button_1000.setBorderPainted(false);
        button_1000.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_1000_click.png"))); // NOI18N
        button_1000.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_1000_hover.png"))); // NOI18N
        button_1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_1000ActionPerformed(evt);
            }
        });

        button_100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_100.PNG"))); // NOI18N
        button_100.setBorder(null);
        button_100.setBorderPainted(false);
        button_100.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_100_click.png"))); // NOI18N
        button_100.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_100_hover.PNG"))); // NOI18N
        button_100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_100ActionPerformed(evt);
            }
        });

        button_500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_500.PNG"))); // NOI18N
        button_500.setBorder(null);
        button_500.setBorderPainted(false);
        button_500.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_500_click.png"))); // NOI18N
        button_500.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_500_hover.png"))); // NOI18N
        button_500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_500ActionPerformed(evt);
            }
        });

        otherAmount_textField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        otherAmount_textField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 52, 52));
        jLabel3.setText("Other Amount:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 52, 52));
        jLabel4.setText("Recieved Cash:");
        jLabel4.setToolTipText("");

        recievedCash_textField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        recievedCash_textField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        ok_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_ok_button.PNG"))); // NOI18N
        ok_button.setBorder(null);
        ok_button.setBorderPainted(false);
        ok_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_ok_button_click.PNG"))); // NOI18N
        ok_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_ok_button_hover.PNG"))); // NOI18N
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        reciept_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 52, 52));
        jLabel5.setText("Total:");

        recievedCash_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        recievedCash_label.setForeground(new java.awt.Color(52, 52, 52));
        recievedCash_label.setText("100.00");

        change_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        change_label.setForeground(new java.awt.Color(52, 52, 52));
        change_label.setText("30.00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(52, 52, 52));
        jLabel8.setText("Recieved Cash:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(52, 52, 52));
        jLabel9.setText("Change:");

        total_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        total_label.setForeground(new java.awt.Color(52, 52, 52));
        total_label.setText("70.00");

        cancel_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_cancel_button.PNG"))); // NOI18N
        cancel_button.setBorder(null);
        cancel_button.setBorderPainted(false);
        cancel_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_cancel_button_click.PNG"))); // NOI18N
        cancel_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_cancel_button_hover.PNG"))); // NOI18N
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        confirm_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_confirml_button.PNG"))); // NOI18N
        confirm_button.setBorder(null);
        confirm_button.setBorderPainted(false);
        confirm_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_confirml_button_click.PNG"))); // NOI18N
        confirm_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single_journey_confirml_button_hover.PNG"))); // NOI18N
        confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reciept_panelLayout = new javax.swing.GroupLayout(reciept_panel);
        reciept_panel.setLayout(reciept_panelLayout);
        reciept_panelLayout.setHorizontalGroup(
            reciept_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reciept_panelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(reciept_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reciept_panelLayout.createSequentialGroup()
                        .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reciept_panelLayout.createSequentialGroup()
                        .addGroup(reciept_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(reciept_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total_label)
                            .addComponent(recievedCash_label)
                            .addComponent(change_label))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        reciept_panelLayout.setVerticalGroup(
            reciept_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reciept_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(reciept_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reciept_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reciept_panelLayout.createSequentialGroup()
                        .addComponent(total_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recievedCash_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(reciept_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_200, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_1000, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_500, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_100, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(196, 196, 196)
                                        .addComponent(ok_button))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recievedCash_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherAmount_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reciept_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(button_1000, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_200, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(button_500, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_100, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otherAmount_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(recievedCash_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ok_button)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(reciept_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        boolean isError=false;
        float recieved_cash=0;
        float amount=0;
        if(recievedCash_textField.getText().isEmpty() || otherAmount_textField.getText().isEmpty()){
            isError=true;
            JOptionPane.showMessageDialog(this, "Please enter all fields.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                if(Float.parseFloat(otherAmount_textField.getText())>Float.parseFloat(recievedCash_textField.getText())){
                    isError=true;
                    JOptionPane.showMessageDialog(this, "Insufficient Cash.","Error",JOptionPane.ERROR_MESSAGE);
                }
                amount=Float.parseFloat(otherAmount_textField.getText());
                recieved_cash = Float.parseFloat(recievedCash_textField.getText());
            }catch(NumberFormatException e){
                isError=true;
                JOptionPane.showMessageDialog(this, "Please enter cash value only.","Error",JOptionPane.ERROR_MESSAGE);
                otherAmount_textField.setText("");
                recievedCash_textField.setText("");
            }
        }

        if(!isError){
            float change=recieved_cash-amount;
            total_label.setText(""+amount);
            recievedCash_label.setText(""+recieved_cash);
            change_label.setText(""+change);
            
            button_1000.setEnabled(false);
            button_500.setEnabled(false);
            button_200.setEnabled(false);
            button_100.setEnabled(false);
            otherAmount_textField.setEnabled(false);
            recievedCash_textField.setEnabled(false);
            ok_button.setEnabled(false);
            reciept_panel.setVisible(true);
            
        }
    }//GEN-LAST:event_ok_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        reciept_panel.setVisible(false);
        button_1000.setEnabled(true);
        button_500.setEnabled(true);
        button_200.setEnabled(true);
        button_100.setEnabled(true);
        otherAmount_textField.setEnabled(true);
        recievedCash_textField.setEnabled(true);
        ok_button.setEnabled(true);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_buttonActionPerformed
        reciept_panel.setVisible(false);
        otherAmount_textField.setText("");
        recievedCash_textField.setText("");
        otherAmount_textField.setEnabled(true);
        ok_button.setEnabled(true);
        button_1000.setEnabled(true);
        button_500.setEnabled(true);
        button_200.setEnabled(true);
        button_100.setEnabled(true);
    }//GEN-LAST:event_confirm_buttonActionPerformed

    private void button_1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_1000ActionPerformed
        otherAmount_textField.setText("1000");
    }//GEN-LAST:event_button_1000ActionPerformed

    private void button_500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_500ActionPerformed
        otherAmount_textField.setText("500");
    }//GEN-LAST:event_button_500ActionPerformed

    private void button_200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_200ActionPerformed
        otherAmount_textField.setText("200");
    }//GEN-LAST:event_button_200ActionPerformed

    private void button_100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_100ActionPerformed
        otherAmount_textField.setText("100");
    }//GEN-LAST:event_button_100ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_100;
    private javax.swing.JButton button_1000;
    private javax.swing.JButton button_200;
    private javax.swing.JButton button_500;
    private javax.swing.JButton cancel_button;
    private javax.swing.JLabel change_label;
    private javax.swing.JButton confirm_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton ok_button;
    private javax.swing.JTextField otherAmount_textField;
    private javax.swing.JPanel reciept_panel;
    private javax.swing.JLabel recievedCash_label;
    private javax.swing.JTextField recievedCash_textField;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
