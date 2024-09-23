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



/**
 *
 * @author truon
 */
public class ho_khau extends javax.swing.JFrame {
    final String header[] = {"ID hộ khẩu","Tên chủ hộ","Số nhân khẩu","Địa chỉ"};
    final DefaultTableModel tb = new DefaultTableModel(header,0);
    
    ConnectDB cn = new ConnectDB();
    Connection conn;

    public ho_khau() {
        initComponents();
        loadBang();
    }

    private void loadBang() {
        
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "select * from ho_khau";
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
                dgvHK.setModel(tb);
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
        txtSonk.setText("");
        txtdc.setText("");
        loadBang();
        txtId.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHK = new javax.swing.JButton();
        btnNK = new javax.swing.JButton();
        btnTT = new javax.swing.JButton();
        btnTV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvHK = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTen = new javax.swing.JTextField();
        txtSonk = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quản lý hộ khẩu");

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

        btnHK.setBackground(new java.awt.Color(62, 97, 137));
        btnHK.setForeground(new java.awt.Color(255, 0, 0));
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

        dgvHK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID hộ khẩu", "Tên chủ hộ", "Số nhân khẩu", "Địa chỉ"
            }
        ));
        dgvHK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvHKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvHK);

        jLabel2.setText("Tên chủ hộ:");

        jLabel3.setText("Số nhân khẩu:");

        jLabel4.setText("Địa chỉ:");

        jLabel5.setText("ID gia đình:");

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

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnThem)
                                                .addGap(77, 77, 77)
                                                .addComponent(btnSua)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                                .addComponent(btnXoa))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtdc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtSonk, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtSonk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnThem)
                                    .addComponent(btnSua)
                                    .addComponent(btnXoa))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHKActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         conn = cn.getConnection();
    try {
        // Sửa cú pháp của câu lệnh SQL để đúng chuẩn
        String sql = "DELETE FROM ho_khau WHERE id_ho_gia_dinh = '" + txtId.getText() + "'";
        Statement st = conn.createStatement();

        // Hiển thị hộp thoại xác nhận xóa
        int chk = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ!", "Thông báo!", JOptionPane.YES_NO_OPTION);

        if (chk == JOptionPane.YES_OPTION) {
            st.executeUpdate(sql);
            xoatrang(); // Hàm xóa nội dung các trường (nếu có)
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        }
        
    } catch (Exception e) {
        e.printStackTrace(); // In lỗi ra console để dễ dàng debug
        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi xóa!");
    }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        conn = cn.getConnection();
    try {
        if (txtId.getText().equals("") || txtTen.getText().equals("") || txtSonk.getText().equals("") || txtdc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ thông tin");
        } else {
            StringBuffer sb = new StringBuffer();

            // Kiểm tra xem 'ten_chu_ho' đã tồn tại chưa
            String sql_check = "SELECT id_ho_gia_dinh FROM ho_khau WHERE id_ho_gia_dinh = '" + txtId.getText() + "'";
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
                String sql = "INSERT INTO ho_khau(id_ho_gia_dinh, ten_chu_ho, so_nhan_khau, dia_chi) "
                           + "VALUES ('" + txtId.getText() + "', '" + txtTen.getText() + "', '" + txtSonk.getText() + "', '" + txtdc.getText() + "')";

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

    private void dgvHKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvHKMouseClicked
        int x = dgvHK.getSelectedRow();
        if(x>=0){
            
            txtTen.setText(dgvHK.getValueAt(x, 1)+ "");
            txtSonk.setText(dgvHK.getValueAt(x, 2)+ "");
            txtdc.setText(dgvHK.getValueAt(x, 3)+ "");
            txtId.setText(dgvHK.getValueAt(x, 0)+ "");
            txtId.setEnabled(false);
        }
    }//GEN-LAST:event_dgvHKMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        conn = cn.getConnection();
        try {
            if (txtTen.getText().equals("") || txtSonk.getText().equals("") || txtdc.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ thông tin");
            } else {
                Statement st = conn.createStatement();
                String sql = "UPDATE ho_khau SET ten_chu_ho ='" +txtTen.getText()+ "', so_nhan_khau ='" +txtSonk.getText()+ "', dia_chi ='" +txtdc.getText()+ "' where id_ho_gia_dinh ='" +txtId.getText()+ "'";
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

    private void btnNKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNKActionPerformed
        nhan_khau nhanKhauForm = new nhan_khau();
        // Hiển thị form nhan_khau
        nhanKhauForm.setVisible(true);
        // Ẩn form hiện tại (ho_khau)
        this.setVisible(false);
    }//GEN-LAST:event_btnNKActionPerformed

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
            java.util.logging.Logger.getLogger(ho_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ho_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ho_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ho_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ho_khau().setVisible(true);
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
    private javax.swing.JTable dgvHK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSonk;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtdc;
    // End of variables declaration//GEN-END:variables
}
