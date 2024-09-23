/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    // Thông tin kết nối tới MySQL
    private final String url = "jdbc:mysql://localhost:3306/Test2"; // Thay bằng cơ sở dữ liệu của bạn
    private final String user = "root"; // Thay bằng username của bạn
    private final String pass = "2k4truong"; // Thay bằng mật khẩu của bạn

    public Connection getConnection() {
        Connection conn = null;
        try {
            // Đăng ký driver MySQL (nếu cần)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Kết nối tới cơ sở dữ liệu
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // In ra lỗi nếu có
        }
        return conn;
    }
}
