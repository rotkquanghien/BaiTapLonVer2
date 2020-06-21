/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminForm;

import Dao.ThongKe;
import Dao.Ve;
import controller.DAOThongKe;
import controller.DAOve;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validate.Validator;

/**
 *
 * @author nvta1
 */
public class QuanLyVe extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyVe
     */
    private final String[] header = {"STT", "Mã Tour", "Mã Khách Hàng", "Ngày KH", "Thời Lượng", "Giá", "Số Người", "Khuyến Mại"};
    private ArrayList<ThongKe> items = new ArrayList<>();
    private int selectedIndex;
    private DefaultTableModel model;

    public QuanLyVe() {
        initComponents();
        model = (DefaultTableModel) tbQuanLyVe.getModel();
        model.setColumnIdentifiers(header);
        items = new DAOThongKe().getListVe();
        showTable(items);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuanLyVe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnThoai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tbMa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbTongKhach = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbTongTien = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Vé");

        tbQuanLyVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbQuanLyVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuanLyVeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbQuanLyVe);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("THỐNG KÊ");

        btnThoai.setText("Thoát");
        btnThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoaiActionPerformed(evt);
            }
        });

        tbMa.setText("Nhập Mã Tour");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Tổng Khách");

        lbTongKhach.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTongKhach.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Tổng Tiền");

        lbTongTien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTongTien.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("VNĐ");

        jButton1.setText("Thống Kê");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Làm Mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbMa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lbTongKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbMa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(lbTongKhach)
                        .addComponent(jLabel5)
                        .addComponent(lbTongTien)
                        .addComponent(jLabel7)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbQuanLyVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLyVeMouseClicked
        // TODO add your handling code here:
//        int rơw = tbQuanLyVe.getSelectedRow();
//        txtIDve.setText(model.getValueAt(rơw, 1).toString());
//        txtMaUser.setText(model.getValueAt(rơw, 2).toString());
//        txtMaTour.setText(model.getValueAt(rơw, 3).toString());
//        txtTenVe.setText(model.getValueAt(rơw, 4).toString());
    }//GEN-LAST:event_tbQuanLyVeMouseClicked

    private void btnThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoaiActionPerformed
        // TODO add your handling code here:
        MenuQuanLy a = new MenuQuanLy();
        a.show();
        this.dispose();
    }//GEN-LAST:event_btnThoaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<ThongKe> itemss = new ArrayList<>();
        itemss = new DAOThongKe().getList(tbMa.getText().trim().toUpperCase());
        showTable(itemss);
        int tongKhach = 0;
        int tongTien = 0;
        for (ThongKe item : itemss) {
            tongKhach += Integer.parseInt(item.getSoNguoi());
            tongTien  += Double.parseDouble(item.getGia()) * Integer.parseInt(item.getSoNguoi()) * Integer.parseInt(item.getKhuyenmai()) / 100;
        }
        
        lbTongKhach.setText(tongKhach + "");
        lbTongTien.setText(tongTien + "");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        showTable(items);
        tbMa.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyVe().setVisible(true);
            }
        });
    }

    // hien thi danh sach
    public void showTable(ArrayList<ThongKe> items) {
        model.setRowCount(0);
        for (ThongKe item : items) {
            model.addRow(new Object[]{
                model.getRowCount() + 1, item.getMaTour(), item.getIDUSER(), item.getNgayKH(), item.getThoiLuong(), item.getGia(), item.getSoNguoi(), item.getKhuyenmai()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTongKhach;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JTextField tbMa;
    private javax.swing.JTable tbQuanLyVe;
    // End of variables declaration//GEN-END:variables
}
