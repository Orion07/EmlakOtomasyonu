/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import database.*;
import functions.EmlakException;
import functions.Database;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Orion
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    Database db = null;
    public frmLogin() 
    {
        initComponents();
        setLocationRelativeTo(null);
        db = new Database();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(406, 285));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1463355931_Next.png"))); // NOI18N
        jButton1.setText("Giriş");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setText("Şifre :");

        jTextField1.setText("admin");

        jPasswordField1.setText("admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Giriş", jPanel1);

        jPanel2.setRequestFocusEnabled(false);

        jLabel5.setText("Kullanıcı Adı :");

        jLabel6.setText("Şifre :");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1463356084_Add.png"))); // NOI18N
        jButton4.setText("Kayıt ol");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField5)
                    .addComponent(jPasswordField2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kayıt Ol", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Users user = new Users.UserBuilder().id(jTextField1.getText()).password(jPasswordField1.getText()).build();
        Users u = (Users)db.get(user.getId(), Users.class);
        if(u!=null)
        {
            if(u.getId().equals(user.getId()) && u.getPassword().equals(user.getPassword()))
            {
                JOptionPane.showMessageDialog(null, "Başarıyla giriş yaptınız.");
                frmEstate estate = new frmEstate();
                estate.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Giriş Başarısız");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Giriş Başarısız #2");
        }
//        frmEstate estate = new frmEstate();
//        estate.setVisible(true);
//        dispose();
//        Users user = new Users.UserBuilder().id("admin1").password("admin").build();
//        db.add(user);
//        db.delete("admin1",Users.class);
//        Users a = (Users)db.get("admin", Users.class);
//        System.out.println(a.getUid());
//        System.out.println(a.getId());
//        System.out.println(a.getPassword());
//        a.setPassword("admintest");
//        db.update(a);
//        List l = db.getList("from Users");
//        System.out.println("Liste Boyut : " + l.size());
//        Iterator it = l.iterator();
//        while(it.hasNext())
//        {
//            Users u = (Users)it.next();
//            System.out.println(u.getUid());
//            System.out.println(u.getId());
//            System.out.println(u.getPassword());
//        }
        
        //user.executeHQLQuery("from Apartmentsandoffices");

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTextField5.getText().length() >= 4 && jPasswordField2.getText().length() >= 4)
        {
            Users user = new Users.UserBuilder().id(jTextField5.getText()).password(jPasswordField2.getText()).build();
            String id = db.add(user);
            if(id.equals(jTextField5.getText()))
            {
                JOptionPane.showMessageDialog(null, "Kayıt Başarılı Lütfen Giriş Yapınız.");
            }else{
                JOptionPane.showMessageDialog(null, "Kayıt Başarısız Lütfen Tekrar Deneyiniz.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Kullanıcı adı veya Şifre uygun formatta değil.");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
