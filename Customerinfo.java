
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohsy
 */
public class Customerinfo extends javax.swing.JFrame {

    /**
     * Creates new form Customerinfo
     */
    public Customerinfo() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2_Delete = new javax.swing.JButton();
        jButton3_Update = new javax.swing.JButton();
        jButton4_Back = new javax.swing.JButton();
        jTextField1_phone = new javax.swing.JTextField();
        jTextField2_email = new javax.swing.JTextField();
        jTextField4_Name = new javax.swing.JTextField();
        jTextField3_CusID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_address = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1_Cus_info = new javax.swing.JTable();
        jButton2_Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("E-Pharmacy Management System");

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel2.setText("Customer Information");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Customer ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Phone");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Address");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2_Delete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2_Delete.setText("Delete");
        jButton2_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_DeleteActionPerformed(evt);
            }
        });

        jButton3_Update.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3_Update.setText("Update");
        jButton3_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_UpdateActionPerformed(evt);
            }
        });

        jButton4_Back.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4_Back.setText("Back");
        jButton4_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4_BackMouseClicked(evt);
            }
        });
        jButton4_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_BackActionPerformed(evt);
            }
        });

        jTextField3_CusID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3_CusIDMouseClicked(evt);
            }
        });

        jTextArea1_address.setColumns(20);
        jTextArea1_address.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_address);

        jTable1_Cus_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cus_ID", "Name", "Phone", "Email", "Address"
            }
        ));
        jTable1_Cus_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_Cus_infoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1_Cus_info);

        jButton2_Reset.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2_Reset.setText("Reset");
        jButton2_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2_Delete)
                                .addGap(60, 60, 60)
                                .addComponent(jButton3_Update))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3_CusID)
                                        .addComponent(jTextField4_Name)
                                        .addComponent(jTextField1_phone)
                                        .addComponent(jTextField2_email)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jButton2_Reset)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4_Back)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3_CusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField2_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_Delete)
                    .addComponent(jButton1)
                    .addComponent(jButton3_Update)
                    .addComponent(jButton2_Reset))
                .addGap(25, 25, 25)
                .addComponent(jButton4_Back)
                .addGap(433, 433, 433))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_BackActionPerformed
            
    }//GEN-LAST:event_jButton4_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
      //IMessage.setText(" ");
         int total = 0;
      int vat = 0;
      int sum = 0;
     
       DefaultTableModel model = (DefaultTableModel) jTable1_Cus_info.getModel();
     // if(vatStatusCheck.isSelected()){
      //     vat = 10;
     // }
        if(!jTextField3_CusID.getText().trim().equals("")){
            model.addRow(new Object[] {jTextField3_CusID.getText(),jTextField4_Name.getText(),jTextField1_phone.getText(),jTextField2_email.getText(),jTextArea1_address.getText(),vat});
        }
        else{
            //IMessage.setText("The product Name Should not be left blank");
        }

              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3_CusIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3_CusIDMouseClicked
           
    }//GEN-LAST:event_jTextField3_CusIDMouseClicked

    private void jButton4_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_BackMouseClicked
        MedicineMenu rgf = new MedicineMenu();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        this .dispose();
    }//GEN-LAST:event_jButton4_BackMouseClicked

    private void jTable1_Cus_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_Cus_infoMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1_Cus_info.getModel();
        jTextField3_CusID.setText(model.getValueAt(jTable1_Cus_info.getSelectedRow(),0).toString());
        jTextField4_Name.setText(model.getValueAt(jTable1_Cus_info.getSelectedRow(),1).toString());
        jTextField1_phone.setText(model.getValueAt(jTable1_Cus_info.getSelectedRow(),2).toString());
        jTextField2_email.setText(model.getValueAt(jTable1_Cus_info.getSelectedRow(),3).toString());
        jTextArea1_address.setText(model.getValueAt(jTable1_Cus_info.getSelectedRow(),4).toString());
    }//GEN-LAST:event_jTable1_Cus_infoMouseClicked

    private void jButton2_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_DeleteActionPerformed

         DefaultTableModel model = (DefaultTableModel) jTable1_Cus_info.getModel();
        if(jTable1_Cus_info.getSelectedRow() == -1){
            if(jTable1_Cus_info.getRowCount() == 0){
                //IMessage.setText("Table is Empty.");
            }
            else
            {
              //  IMessage.setText("You must Selected a Product.");
            }
        }
        else
        {
            model.removeRow(jTable1_Cus_info.getSelectedRow());
        }    
    }//GEN-LAST:event_jButton2_DeleteActionPerformed

    private void jButton3_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_UpdateActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1_Cus_info.getModel();
        if(jTable1_Cus_info.getSelectedRow() == -1){
            if(jTable1_Cus_info.getRowCount() == 0){
                //IMessage.setText("Table is Empty.");
            }
            else
            {
                //IMessage.setText("You must Selected a Product.");
            }
        }
        else
        {
            model.setValueAt(jTextField3_CusID.getText(), jTable1_Cus_info.getSelectedRow(), 0);
            model.setValueAt(jTextField4_Name.getText(), jTable1_Cus_info.getSelectedRow(), 1);
            model.setValueAt(jTextField1_phone.getText(), jTable1_Cus_info.getSelectedRow(), 2);
            model.setValueAt(jTextField2_email.getText(), jTable1_Cus_info.getSelectedRow(), 3);
            model.setValueAt(jTextArea1_address.getText(), jTable1_Cus_info.getSelectedRow(), 4);
        }    
     
    }//GEN-LAST:event_jButton3_UpdateActionPerformed

    private void jButton2_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_ResetActionPerformed
        jTextField3_CusID.setText(null);
        jTextField4_Name.setText(null);
        jTextField1_phone.setText(null);
        jTextField2_email.setText(null);
        jTextArea1_address.setText(null);
    }//GEN-LAST:event_jButton2_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(Customerinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customerinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customerinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customerinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customerinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2_Delete;
    private javax.swing.JButton jButton2_Reset;
    private javax.swing.JButton jButton3_Update;
    private javax.swing.JButton jButton4_Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1_Cus_info;
    private javax.swing.JTextArea jTextArea1_address;
    private javax.swing.JTextField jTextField1_phone;
    private javax.swing.JTextField jTextField2_email;
    private javax.swing.JTextField jTextField3_CusID;
    private javax.swing.JTextField jTextField4_Name;
    // End of variables declaration//GEN-END:variables
}
