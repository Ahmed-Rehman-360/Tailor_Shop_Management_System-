import Classes.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class AddCustomer extends javax.swing.JFrame {
    String gender;
    public AddCustomer() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_phoneNumber = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        rBtn_male = new javax.swing.JRadioButton();
        rBtn_female = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_age = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));
        getContentPane().add(txt_phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 230, 30));
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 230, 30));

        buttonGroup1.add(rBtn_male);
        rBtn_male.setText("Male");
        getContentPane().add(rBtn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, -1));

        buttonGroup1.add(rBtn_female);
        rBtn_female.setText("Female");
        getContentPane().add(rBtn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, 130, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        txt_age.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String customerName=txt_name.getText();
        String customerPhoneNumber=txt_phoneNumber.getText();
        String customerAddress=txt_address.getText();
        int customerAge=(Integer)txt_age.getValue();
        if(rBtn_male.isSelected()){
            gender="Male";
        }
        if(rBtn_female.isSelected()){
            gender="Female";
        }
        if(customerName.equals(""))
            JOptionPane.showMessageDialog(null, "Name can't be left empty");
        else if(customerPhoneNumber.equals("")||customerPhoneNumber.length()!=11)
            JOptionPane.showMessageDialog(null, "Please enter valid mobile number without dash");
        else if(!(rBtn_male.isSelected()||rBtn_female.isSelected()))
            JOptionPane.showMessageDialog(null, "Gender is not specified");
        else if(customerAddress.equals(""))
            JOptionPane.showMessageDialog(null, "Please enter address field");
        else if(customerAge==0)
            JOptionPane.showMessageDialog(null, "Please enter valid age");
        else{
            try{
            Connection con=ConnectionProvider.getcon();
            PreparedStatement ps=con.prepareStatement("insert into CustomerDetails (customerName,customerPhoneNumber,customerAddress,customerGender,customerAge) values (?,?,?,?,?)");
            ps.setString(1,customerName);
            ps.setString(2,customerPhoneNumber);
            ps.setString(3,customerAddress);
            ps.setString(4,gender);
            ps.setInt(5,customerAge);
            ps.executeUpdate();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select customerID from  CustomerDetails where customerPhoneNumber='"+customerPhoneNumber+"'");
                if(rs.next()){
                    int customerID = rs.getInt("customerID");
                    JOptionPane.showMessageDialog(null,"Customer added successfully.Customer id is: "+customerID);
                    setVisible(false);
                    new Dashboard().setVisible(true);
                }
                con.close();
            }
            catch (Exception e) {
                  JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rBtn_female;
    private javax.swing.JRadioButton rBtn_male;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txt_address;
    private javax.swing.JSpinner txt_age;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phoneNumber;
    // End of variables declaration//GEN-END:variables
}
