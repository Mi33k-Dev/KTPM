/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author truon
 */

public class HoKhau {
    private int idHoGiaDinh;
    private String tenChuHo;
    private int soNhanKhau;
    private String diaChi;

    // Constructor
    public HoKhau(String tenChuHo, int soNhanKhau, String diaChi) {
        this.tenChuHo = tenChuHo;
        this.soNhanKhau = soNhanKhau;
        this.diaChi = diaChi;
    }

    // Getters and Setters
    public int getIdHoGiaDinh() {
        return idHoGiaDinh;
    }

    public void setIdHoGiaDinh(int idHoGiaDinh) {
        this.idHoGiaDinh = idHoGiaDinh;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public int getSoNhanKhau() {
        return soNhanKhau;
    }

    public void setSoNhanKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}


