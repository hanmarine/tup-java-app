
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        password_label = new javax.swing.JLabel();
        studentid_label = new javax.swing.JLabel();
        jstudentid = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        blogin = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 568));
        getContentPane().setLayout(null);

        password_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        password_label.setText("Password:");
        getContentPane().add(password_label);
        password_label.setBounds(40, 310, 90, 16);

        studentid_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        studentid_label.setText("Student ID:");
        getContentPane().add(studentid_label);
        studentid_label.setBounds(40, 240, 90, 16);

        jstudentid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jstudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstudentidActionPerformed(evt);
            }
        });
        getContentPane().add(jstudentid);
        jstudentid.setBounds(40, 260, 240, 22);

        jpassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(jpassword);
        jpassword.setBounds(40, 330, 240, 22);

        blogin.setBackground(new java.awt.Color(204, 0, 0));
        blogin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        blogin.setForeground(new java.awt.Color(255, 255, 255));
        blogin.setText("Log In");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        getContentPane().add(blogin);
        blogin.setBounds(90, 390, 120, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcome.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 320, 568);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jstudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstudentidActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        String studentId = jstudentid.getText();
        String password = jpassword.getText();

        if (studentId.equals("")) {
          JOptionPane.showMessageDialog(null, "Please enter your student ID.","Alert",JOptionPane.WARNING_MESSAGE);
        } else if (password.equals("")) {
          JOptionPane.showMessageDialog(null, "Please enter your password.","Alert",JOptionPane.WARNING_MESSAGE);
        } else {
          if (!studentId.matches("TUPM-[0-9]{2}-[0-9]{4}$")) {
            JOptionPane.showMessageDialog(null, "Invalid Student ID.","Alert",JOptionPane.WARNING_MESSAGE);
            return; 
          }
          if (!password.equals("Student12345")) {
            JOptionPane.showMessageDialog(null, "Invalid Password.","Alert",JOptionPane.WARNING_MESSAGE);
            return; 
          }

        Main f=new Main();
        f.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_bloginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton blogin;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jstudentid;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel studentid_label;
    // End of variables declaration//GEN-END:variables
}
