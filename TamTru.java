/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author truon
 */
public class TamTru {
    private int idTamTru;
    private String hoTen;
    private String ngayDen;
    private int thoiGianTamTru;
    private String lyDo;

    // Constructor không có idTamTru vì nó tự động tăng trong cơ sở dữ liệu
    public TamTru(String hoTen, String ngayDen, int thoiGianTamTru, String lyDo) {
        this.hoTen = hoTen;
        this.ngayDen = ngayDen;
        this.thoiGianTamTru = thoiGianTamTru;
        this.lyDo = lyDo;
    }

    // Getters and Setters
    public int getIdTamTru() {
        return idTamTru;
    }

    public void setIdTamTru(int idTamTru) {
        this.idTamTru = idTamTru;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }

    public int getThoiGianTamTru() {
        return thoiGianTamTru;
    }

    public void setThoiGianTamTru(int thoiGianTamTru) {
        this.thoiGianTamTru = thoiGianTamTru;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    // Phương thức toString để in thông tin chi tiết của tạm trú
    @Override
    public String toString() {
        return "TamTru{" +
                "idTamTru=" + idTamTru +
                ", hoTen='" + hoTen + '\'' +
                ", ngayDen='" + ngayDen + '\'' +
                ", thoiGianTamTru=" + thoiGianTamTru +
                ", lyDo='" + lyDo + '\'' +
                '}';
    }
}

