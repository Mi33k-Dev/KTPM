/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class tam_tru extends javax.swing.JFrame {

    final String header[] = {"ID người tạm trú","Họ và tên","Ngày đến","Thời gian tạm trú (Ngày)", "Lý do"};
    final DefaultTableModel tb = new DefaultTableModel(header,0);
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    public tam_tru() {
        initComponents();
        loadBang();
    }
    private void loadBang() {
        
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "select * from tam_tru";
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = (ResultSetMetaData) rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while (rs.next()){
                row = new Vector();
                for(int i = 1; i <= number; i++)
                    row.addElement(rs.getString(i));
                tb.addRow(row);
                dgvTT.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            
        }
    }
    private void xoatrang(){
        txtId.setText("");
        txtTen.setText("");
        txtNgay.setText("");
        txtTg.setText("");
        txtLydo.setText("");
        loadBang();
        txtId.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNgay = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvTT = new javax.swing.JTable();
        txtTg = new javax.swing.JTextField();
        txtLydo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnYc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHK = new javax.swing.JButton();
        btnNK = new javax.swing.JButton();
        btnTT = new javax.swing.JButton();
        btnTV = new javax.swing.JButton();
        txtTen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dgvTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID người tạm trú", "Họ và Tên", "Ngày đến", "Thời gian tạm trú (Ngày)", "Lý do"
            }
        ));
        dgvTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvTTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvTT);

        jLabel2.setText("Họ và Tên:");

        jLabel3.setText("Ngày đến:");

        jLabel4.setText("Thời gian tạm trú:");

        jLabel5.setText("Lý do:");

        btnYc.setText("Gửi yêu cầu");
        btnYc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYcActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Tạm Trú");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        btnHK.setText("Quản lý Hộ Khẩu");
        btnHK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHKActionPerformed(evt);
            }
        });

        btnNK.setText("Thêm Nhân Khẩu");
        btnNK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNKActionPerformed(evt);
            }
        });

        btnTT.setBackground(new java.awt.Color(62, 97, 137));
        btnTT.setForeground(new java.awt.Color(255, 0, 0));
        btnTT.setText("Tạm Trú");
        btnTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTActionPerformed(evt);
            }
        });

        btnTV.setText("Tạm Vắng");
        btnTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNK, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnHK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        jLabel6.setText("Id Tạm trú");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLydo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnYc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTg)
                            .addComponent(txtTen))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(btnYc))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHKActionPerformed
       ho_khau hkForm = new ho_khau();  // Thay hk_form bằng tên lớp form thực tế
        hkForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHKActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void btnYcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYcActionPerformed
        conn = cn.getConnection();
    try {
        if (txtId.getText().equals("") || txtTen.getText().equals("") || txtNgay.getText().equals("") || txtTg.getText().equals("")|| txtLydo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ thông tin");
        } else {
            StringBuffer sb = new StringBuffer();

            // Kiểm tra xem 'ten_chu_ho' đã tồn tại chưa
            String sql_check = "SELECT id_tam_tru FROM tam_tru WHERE id_tam_tru = '" + txtId.getText() + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_check);

            if (rs.next()) {
                sb.append("Tên đã tồn tại\n");
            }

            // Kiểm tra nếu có lỗi (vd: tên đã tồn tại)
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString());
            } else {
                // Câu lệnh chèn vào bảng 'ho_khau' với các cột 'id', 'ten_chu_ho', 'so_nhan_khau', 'dia_chi'
                String sql = "INSERT INTO tam_tru(id_tam_tru, ho_ten, ngay_den, thoi_gian_tam_tru,ly_do) "
                           + "VALUES ('" + txtId.getText() + "', '" + txtTen.getText() + "', '" + txtNgay.getText() + "', '" + txtTg.getText() + "', '" + txtLydo.getText() + "')";

                st = conn.createStatement();
                int kq = st.executeUpdate(sql); // Thực hiện lệnh chèn

                if (kq > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm mới thành công");
                    xoatrang(); // Xóa trắng các trường nhập liệu sau khi thêm thành công
                }       
            }

            // Đóng kết nối và tài nguyên
            rs.close();
            st.close();
            conn.close();
        }
    } catch (Exception e) {
        e.printStackTrace(); // In ra chi tiết lỗi để dễ dàng kiểm tra
    }
    }//GEN-LAST:event_btnYcActionPerformed

    private void dgvTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvTTMouseClicked
        int x = dgvTT.getSelectedRow();
        if(x>=0){
            
            txtTen.setText(dgvTT.getValueAt(x, 1)+ "");
            txtNgay.setText(dgvTT.getValueAt(x, 2)+ "");
            txtTg.setText(dgvTT.getValueAt(x, 3)+ "");
            txtLydo.setText(dgvTT.getValueAt(x, 4)+ "");
            txtId.setText(dgvTT.getValueAt(x, 0)+ "");
            txtId.setEnabled(false);
        }
    }//GEN-LAST:event_dgvTTMouseClicked

    private void btnNKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNKActionPerformed
       nhan_khau nhanKhauForm = new nhan_khau();
        // Hiển thị form nhan_khau
        nhanKhauForm.setVisible(true);
        // Ẩn form hiện tại (ho_khau)
        this.setVisible(false);
    }//GEN-LAST:event_btnNKActionPerformed

    private void btnTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTTActionPerformed

    private void btnTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVActionPerformed
        tam_vang ttForm = new tam_vang();  // Thay tt_form bằng tên lớp form thực tế
        ttForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTVActionPerformed

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
            java.util.logging.Logger.getLogger(tam_tru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tam_tru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tam_tru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tam_tru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tam_tru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHK;
    private javax.swing.JButton btnNK;
    private javax.swing.JButton btnTT;
    private javax.swing.JButton btnTV;
    private javax.swing.JButton btnYc;
    private javax.swing.JTable dgvTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLydo;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTg;
    // End of variables declaration//GEN-END:variables
}
