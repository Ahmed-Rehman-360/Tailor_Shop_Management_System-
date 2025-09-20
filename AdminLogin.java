import Classes.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.JFrame;
public class AdminLogin extends javax.swing.JFrame {
    public AdminLogin() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        passWord = new javax.swing.JPasswordField();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("USERNAME");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 120, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 120, 40));

        signin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.png"))); // NOI18N
        signin.setText("Sign in");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        getContentPane().add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 210, 30));
        getContentPane().add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 210, 30));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 30, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        String username=userName.getText();
        String password=passWord.getText();
        try{
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Admin where username='"+username+"' and password='"+password+"'");
            if(rs.next()){
                //JOptionPane.showMessageDialog(null,"Username and password matched.");
                setVisible(false);
                new Dashboard().setVisible(true);
                con.close();
            }
            else{
                JOptionPane.showMessageDialog(null,"Username or password not correct");
                userName.setText("");
                passWord.setText("");
            }
       }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
         }
        
    }//GEN-LAST:event_signinActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null,"Do you want to close application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JButton signin;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
