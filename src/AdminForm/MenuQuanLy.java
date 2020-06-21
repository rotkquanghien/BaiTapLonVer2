/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminForm;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author nvta1
 */
public class MenuQuanLy extends javax.swing.JFrame {

    /**
     * Creates new form MainQuanLy
     */
    public MenuQuanLy() {
        initComponents();
    }
        class jPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(255,255,255);
            Color color2 = new Color(200,255,255);
            GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jPanelGradient();
        btnQuanLyTour = new javax.swing.JButton();
        btnQuanlykhuyenmai = new javax.swing.JButton();
        btnThongke = new javax.swing.JButton();
        btnThat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnQuanLyUser = new javax.swing.JButton();
        btnQuanLyDD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Quản Lý");

        btnQuanLyTour.setBackground(new java.awt.Color(0, 153, 153));
        btnQuanLyTour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyTour.setText("Quản lý tour");
        btnQuanLyTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyTourActionPerformed(evt);
            }
        });

        btnQuanlykhuyenmai.setBackground(new java.awt.Color(0, 153, 153));
        btnQuanlykhuyenmai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanlykhuyenmai.setText("Quản lý khuyến mại");
        btnQuanlykhuyenmai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanlykhuyenmaiActionPerformed(evt);
            }
        });

        btnThongke.setBackground(new java.awt.Color(0, 153, 153));
        btnThongke.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongke.setText("Thống kê");
        btnThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongkeActionPerformed(evt);
            }
        });

        btnThat.setBackground(new java.awt.Color(0, 153, 153));
        btnThat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThat.setText("Thoát");
        btnThat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu Quản Lý");
        jLabel1.setToolTipText("");

        btnQuanLyUser.setBackground(new java.awt.Color(204, 255, 255));
        btnQuanLyUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyUser.setText("Quản lý user");
        btnQuanLyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyUserActionPerformed(evt);
            }
        });

        btnQuanLyDD.setBackground(new java.awt.Color(0, 153, 153));
        btnQuanLyDD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyDD.setText("Quản lý địa điểm");
        btnQuanLyDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyDDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnQuanlykhuyenmai)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnThongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuanLyUser, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuanLyDD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQuanLyTour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(btnThat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyDD)
                    .addComponent(btnQuanLyUser))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnQuanLyTour))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addComponent(btnQuanlykhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnThat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(747, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanLyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyUserActionPerformed
        // TODO add your handling code here:
        QuanLyUser a = new QuanLyUser();
        a.show();
        this.dispose();
    }//GEN-LAST:event_btnQuanLyUserActionPerformed

    private void btnQuanLyDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyDDActionPerformed
        // TODO add your handling code here:
        QuanLyDiaDiem a = new QuanLyDiaDiem();
        a.show();
        this.dispose();
    }//GEN-LAST:event_btnQuanLyDDActionPerformed

    private void btnQuanLyTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyTourActionPerformed
        // TODO add your handling code here:
        QuanLyTour a = new QuanLyTour();
        a.show();
        this.dispose();
    }//GEN-LAST:event_btnQuanLyTourActionPerformed

    private void btnQuanlykhuyenmaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanlykhuyenmaiActionPerformed
        // TODO add your handling code here:
        QuanLyKhuyenMai a = new QuanLyKhuyenMai();
        a.show();
        this.dispose();
    }//GEN-LAST:event_btnQuanlykhuyenmaiActionPerformed

    private void btnThatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThatActionPerformed

    private void btnThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongkeActionPerformed
        // TODO add your handling code here:
        QuanLyVe ve = new QuanLyVe();
        ve.show();
        this.dispose();
    }//GEN-LAST:event_btnThongkeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuanLyDD;
    private javax.swing.JButton btnQuanLyTour;
    private javax.swing.JButton btnQuanLyUser;
    private javax.swing.JButton btnQuanlykhuyenmai;
    private javax.swing.JButton btnThat;
    private javax.swing.JButton btnThongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
