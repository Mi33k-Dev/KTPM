/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author truon
 */
public class NhanKhau {
    private int idNhanKhau;
    private String hoTen;
    private String ngaySinh;
    private String noiSinh;
    private String danToc;
    private String quanHeChuHo;
    private String ngheNghiep;
    private String soCccd;
    private int idHoGiaDinh;

    // Constructor không có idNhanKhau vì nó tự động tăng trong cơ sở dữ liệu
    public NhanKhau(String hoTen, String ngaySinh, String noiSinh, String danToc, String quanHeChuHo, String ngheNghiep, String soCccd, int idHoGiaDinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.danToc = danToc;
        this.quanHeChuHo = quanHeChuHo;
        this.ngheNghiep = ngheNghiep;
        this.soCccd = soCccd;
        this.idHoGiaDinh = idHoGiaDinh;
    }

    // Getters and Setters
    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getQuanHeChuHo() {
        return quanHeChuHo;
    }

    public void setQuanHeChuHo(String quanHeChuHo) {
        this.quanHeChuHo = quanHeChuHo;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getSoCccd() {
        return soCccd;
    }

    public void setSoCccd(String soCccd) {
        this.soCccd = soCccd;
    }

    public int getIdHoGiaDinh() {
        return idHoGiaDinh;
    }

    public void setIdHoGiaDinh(int idHoGiaDinh) {
        this.idHoGiaDinh = idHoGiaDinh;
    }

    // Phương thức toString để in thông tin chi tiết của nhân khẩu
    @Override
    public String toString() {
        return "NhanKhau{" +
                "idNhanKhau=" + idNhanKhau +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", noiSinh='" + noiSinh + '\'' +
                ", danToc='" + danToc + '\'' +
                ", quanHeChuHo='" + quanHeChuHo + '\'' +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", soCccd='" + soCccd + '\'' +
                ", idHoGiaDinh=" + idHoGiaDinh +
                '}';
    }
}

