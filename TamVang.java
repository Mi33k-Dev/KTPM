/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author truon
 */
public class TamVang {
    private int idTamVang;
    private String hoTen;
    private String ngayDi;
    private String noiDen;
    private String ghiChu;

    // Constructor không có idTamVang vì nó tự động tăng trong cơ sở dữ liệu
    public TamVang(String hoTen, String ngayDi, String noiDen, String ghiChu) {
        this.hoTen = hoTen;
        this.ngayDi = ngayDi;
        this.noiDen = noiDen;
        this.ghiChu = ghiChu;
    }

    // Getters and Setters
    public int getIdTamVang() {
        return idTamVang;
    }

    public void setIdTamVang(int idTamVang) {
        this.idTamVang = idTamVang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    // Phương thức toString để in thông tin chi tiết của tạm vắng
    @Override
    public String toString() {
        return "TamVang{" +
                "idTamVang=" + idTamVang +
                ", hoTen='" + hoTen + '\'' +
                ", ngayDi='" + ngayDi + '\'' +
                ", noiDen='" + noiDen + '\'' +
                ", ghiChu='" + ghiChu + '\'' +
                '}';
    }
}

