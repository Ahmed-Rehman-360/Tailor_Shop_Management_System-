import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_addEmployee = new javax.swing.JButton();
        btn_viewCustomer = new javax.swing.JButton();
        btn_addMeasurements = new javax.swing.JButton();
        btn_viewMeasurements = new javax.swing.JButton();
        btn_bookOrder = new javax.swing.JButton();
        btn_viewEmployee = new javax.swing.JButton();
        btn_updateMeasurements = new javax.swing.JButton();
        btn_deleteCustomer = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        btn_addCustomer = new javax.swing.JButton();
        btn_viewOrders = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_addEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addEmployee.setText("Add Employee");
        btn_addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 260, 50));

        btn_viewCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_viewCustomer.setText("View Customer");
        btn_viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_viewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 263, 50));

        btn_addMeasurements.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addMeasurements.setText("Add Measurements");
        btn_addMeasurements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addMeasurementsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addMeasurements, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 263, 50));

        btn_viewMeasurements.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_viewMeasurements.setText("View Measurements");
        btn_viewMeasurements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewMeasurementsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_viewMeasurements, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 263, 50));

        btn_bookOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_bookOrder.setText("Book Order");
        btn_bookOrder.setMaximumSize(new java.awt.Dimension(139, 31));
        btn_bookOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bookOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 260, 50));

        btn_viewEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_viewEmployee.setText("View Employee");
        btn_viewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_viewEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 260, 50));

        btn_updateMeasurements.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_updateMeasurements.setText("Update Measurements");
        btn_updateMeasurements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateMeasurementsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_updateMeasurements, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 260, 50));

        btn_deleteCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deleteCustomer.setText("Delete Customer");
        btn_deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_deleteCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 260, 50));

        logOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 144, 46));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("DashBoard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 11, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 30, 30));

        btn_addCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addCustomer.setText("Add Customer");
        btn_addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 260, 50));

        btn_viewOrders.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_viewOrders.setText("View Orders");
        btn_viewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewOrdersActionPerformed(evt);
            }
        });
        getContentPane().add(btn_viewOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 260, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateMeasurementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateMeasurementsActionPerformed
        setVisible(false);
        new UpdateMeasurements().setVisible(true);
    }//GEN-LAST:event_btn_updateMeasurementsActionPerformed

    private void btn_deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCustomerActionPerformed
        setVisible(false);
        new DeleteCustomer().setVisible(true);
    }//GEN-LAST:event_btn_deleteCustomerActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null,"Do you want to close application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void btn_addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addEmployeeActionPerformed
        setVisible(false);
        new AddEmployee().setVisible(true);
    }//GEN-LAST:event_btn_addEmployeeActionPerformed

    private void btn_addMeasurementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addMeasurementsActionPerformed
        setVisible(false);
        new AddMeasurements().setVisible(true);
    }//GEN-LAST:event_btn_addMeasurementsActionPerformed

    private void btn_viewMeasurementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewMeasurementsActionPerformed
        setVisible(false);
        new ViewMeasurements().setVisible(true);
    }//GEN-LAST:event_btn_viewMeasurementsActionPerformed

    private void btn_viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewCustomerActionPerformed
        setVisible(false);
        new ViewCustomer().setVisible(true);
    }//GEN-LAST:event_btn_viewCustomerActionPerformed

    private void btn_bookOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookOrderActionPerformed
        setVisible(false);
        new BookOrder().setVisible(true);
    }//GEN-LAST:event_btn_bookOrderActionPerformed

    private void btn_viewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewEmployeeActionPerformed
        setVisible(false);
        new ViewEmployee().setVisible(true);
    }//GEN-LAST:event_btn_viewEmployeeActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        int a;
        a = JOptionPane.showConfirmDialog(null,"Do you want to log out","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
             setVisible(false);
             new AdminLogin().setVisible(true);
        }
           
    }//GEN-LAST:event_logOutActionPerformed

    private void btn_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
        setVisible(false);
        new AddCustomer().setVisible(true);
    }//GEN-LAST:event_btn_addCustomerActionPerformed

    private void btn_viewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewOrdersActionPerformed
        setVisible(false);
        new ViewOrders().setVisible(true);
    }//GEN-LAST:event_btn_viewOrdersActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCustomer;
    private javax.swing.JButton btn_addEmployee;
    private javax.swing.JButton btn_addMeasurements;
    private javax.swing.JButton btn_bookOrder;
    private javax.swing.JButton btn_deleteCustomer;
    private javax.swing.JButton btn_updateMeasurements;
    private javax.swing.JButton btn_viewCustomer;
    private javax.swing.JButton btn_viewEmployee;
    private javax.swing.JButton btn_viewMeasurements;
    private javax.swing.JButton btn_viewOrders;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
