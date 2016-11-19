package skripsinurida;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author nury
 */
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        TFuser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        TFpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        jLabel2.setBounds(70, 130, 80, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.setActionCommand("");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        cancel.setBounds(210, 200, 80, 30);
        jDesktopPane1.add(cancel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TFuser.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        TFuser.setBounds(170, 90, 160, 30);
        jDesktopPane1.add(TFuser, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setText("LOGIN");
        jLabel3.setBounds(150, 20, 80, 40);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        jLabel1.setBounds(70, 90, 80, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ok.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        ok.setBounds(110, 200, 80, 30);
        jDesktopPane1.add(ok, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TFpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpassActionPerformed(evt);
            }
        });
        TFpass.setBounds(170, 130, 160, 30);
        jDesktopPane1.add(TFpass, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try {
            KoneksiDB con = new KoneksiDB();
            Statement statement = (Statement) con.getKoneksi().createStatement();
            ResultSet result = statement.executeQuery("select * from tblogin where username = '" + TFuser.getText() + "'");
            if (result.next()) {
                if (TFpass.getText().equals(result.getString("password"))) {
                    new KelolaApp().show();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password Salah!");
                    TFpass.setText("");
                    TFuser.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Username tidak ditemukan!");
                TFuser.setText("");
                TFpass.setText("");
                TFuser.requestFocus();
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "Gagal!");
        }
    }//GEN-LAST:event_okActionPerformed

    private void TFpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpassActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TFpass;
    private javax.swing.JTextField TFuser;
    private javax.swing.JButton cancel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables

}
