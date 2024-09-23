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
public class nhan_khau extends javax.swing.JFrame {

    final String header[] = {"ID nhân khẩu","Họ và tên","Ngày sinh","Nơi sinh", "Dân tộc", "Quan hệ cH", "Nghề nghiệp", "Số CCCD"};
    final DefaultTableModel tb = new DefaultTableModel(header,0);
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    public nhan_khau() {
        initComponents();
        loadBang();
    }
    private void loadBang() {
        
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "select * from nhan_khau";
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
                dgvNK.setModel(tb);
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
        txtNs.setText("");
        txtDt.setText("");
        txtNoiS.setText("");
        txtNN.setText("");
        txtQh.setText("");
        txtCCCD.setText("");
        loadBang();
        txtId.setEnabled(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNs = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvNK = new javax.swing.JTable();
        txtNoiS = new javax.swing.JTextField();
        txtNN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHK = new javax.swing.JButton();
        btnNK = new javax.swing.JButton();
        btnTT = new javax.swing.JButton();
        btnTV = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQh = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dgvNK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID nhân khẩu", "Họ và Tên", "Ngày sinh", "Nơi sinh", "Dân tộc", "Quan hệ cH", "Nghề nghiệp", "Số CCCD"
            }
        ));
        dgvNK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvNKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvNK);

        jLabel2.setText("Họ và Tên:");

        jLabel3.setText("Ngày sinh:");

        jLabel4.setText("Nơi sinh:");

        jLabel5.setText("Nghề nghiệp:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Thêm nhân khẩu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnNK.setBackground(new java.awt.Color(62, 97, 137));
        btnNK.setForeground(new java.awt.Color(255, 0, 0));
        btnNK.setText("Thêm Nhân Khẩu");

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

        btnXoa.setText("Xóa");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        jLabel6.setText("Dân tộc:");

        jLabel7.setText("Số CCCD:");

        jLabel8.setText("Quan hệ chủ hộ:");

        jLabel9.setText("Id nhân khẩu:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3))
                                .addGap(18, 25, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNoiS)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNs, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTen)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThem)
                                        .addGap(71, 71, 71)
                                        .addComponent(btnSua)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXoa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txtNN))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtQh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNoiS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(txtQh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa))
                        .addGap(25, 25, 25)))
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

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        conn = cn.getConnection();
    try {
        if (txtId.getText().equals("") ||txtTen.getText().equals("") || txtNs.getText().equals("") || txtNoiS.getText().equals("") || txtDt.getText().equals("") || txtNN.getText().equals("") || txtQh.getText().equals("") || txtCCCD.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ thông tin");
        } else {
            StringBuffer sb = new StringBuffer();

            // Kiểm tra xem 'ten_chu_ho' đã tồn tại chưa
            String sql_check = "SELECT ho_ten FROM nhan_khau WHERE ho_ten = '" + txtTen.getText() + "'";
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
                String sql = "INSERT INTO nhan_khau(id_nhan_khau, ho_ten, ngay_sinh, noi_sinh, dan_toc, quan_he_chu_ho, nghe_nghiep, so_cccd) "
                           + "VALUES ('" + txtId.getText() + "','" + txtTen.getText() + "', '" + txtNs.getText() + "','" + txtNoiS.getText() + "', '" + txtDt.getText() + "',  '" + txtNN.getText() + "', '" + txtQh.getText() + "', '" + txtCCCD.getText() + "')";

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
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        conn = cn.getConnection();
        try {
            if (txtId.getText().equals("") ||txtTen.getText().equals("") || txtNs.getText().equals("") || txtNoiS.getText().equals("") || txtDt.getText().equals("") || txtNN.getText().equals("") || txtQh.getText().equals("") || txtCCCD.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ thông tin");
            } else {
                Statement st = conn.createStatement();
                String sql = "UPDATE nhan_khau SET ho_ten ='" +txtTen.getText()+ "', ngay_sinh ='" +txtNs.getText()+ "', noi_sinh ='" +txtNoiS.getText()+ "', dan_toc ='" +txtDt.getText()+ "', quan_he_chu_ho ='" +txtQh.getText()+ "', nghe_nghiep ='" +txtNN.getText()+ "', so_cccd ='" +txtCCCD.getText()+ "' where id_nhan_khau ='" +txtId.getText()+ "'";
                st = conn.createStatement();
                int kq = st.executeUpdate(sql); // Thực hiện lệnh chèn
                if (kq > 0) {
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    xoatrang(); // Xóa trắng các trường nhập liệu sau khi thêm thành công
                }   
                st.close();     
            }
            // Đóng kết nối và tài nguyên
                
                conn.close();
                
                
        }catch (Exception e) {
             e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void dgvNKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvNKMouseClicked
        int x = dgvNK.getSelectedRow();
        if(x>=0){
            txtId.setText(dgvNK.getValueAt(x, 0)+ "");
            txtTen.setText(dgvNK.getValueAt(x, 1)+ "");
            txtNs.setText(dgvNK.getValueAt(x, 2)+ "");
            txtNoiS.setText(dgvNK.getValueAt(x, 3)+ "");
            txtDt.setText(dgvNK.getValueAt(x, 4)+ "");
            txtQh.setText(dgvNK.getValueAt(x, 5)+ "");
            txtNN.setText(dgvNK.getValueAt(x, 6)+ "");
            txtCCCD.setText(dgvNK.getValueAt(x, 7)+ "");
            txtId.setEnabled(false);
        }
    }//GEN-LAST:event_dgvNKMouseClicked

    private void btnTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTActionPerformed
       tam_tru ttForm = new tam_tru();  // Thay tt_form bằng tên lớp form thực tế
        ttForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTTActionPerformed

    private void btnTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVActionPerformed
        tam_vang tvForm = new tam_vang();  // Thay tv_form bằng tên lớp form thực tế
        tvForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTVActionPerformed

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
            java.util.logging.Logger.getLogger(nhan_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhan_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhan_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhan_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nhan_khau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHK;
    private javax.swing.JButton btnNK;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTT;
    private javax.swing.JButton btnTV;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTable dgvNK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDt;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNN;
    private javax.swing.JTextField txtNoiS;
    private javax.swing.JTextField txtNs;
    private javax.swing.JTextField txtQh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
