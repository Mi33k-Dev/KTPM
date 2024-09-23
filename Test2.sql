create database test2;
use test2;
CREATE TABLE ho_khau (
    id_ho_gia_dinh INT PRIMARY KEY AUTO_INCREMENT,
    ten_chu_ho VARCHAR(100),
    so_nhan_khau INT,
    dia_chi VARCHAR(255)
);
CREATE TABLE nhan_khau (
    id_nhan_khau INT PRIMARY KEY AUTO_INCREMENT,
    ho_ten VARCHAR(100),
    ngay_sinh DATE,
    noi_sinh VARCHAR(100),
    dan_toc VARCHAR(50),
    quan_he_chu_ho VARCHAR(50),
    nghe_nghiep VARCHAR(100),
    so_cccd VARCHAR(12),
    id_ho_gia_dinh INT,
    FOREIGN KEY (id_ho_gia_dinh) REFERENCES ho_khau(id_ho_gia_dinh) ON DELETE CASCADE
);
CREATE TABLE tam_tru (
    id_tam_tru INT PRIMARY KEY AUTO_INCREMENT,
    ho_ten VARCHAR(100),
    ngay_den DATE,
    thoi_gian_tam_tru INT,
    ly_do VARCHAR(255)
);
CREATE TABLE tam_vang (
    id_tam_vang INT PRIMARY KEY AUTO_INCREMENT,
    ho_ten VARCHAR(100),
    ngay_di DATE,
    noi_den VARCHAR(255),
    ghi_chu VARCHAR(255)
);
INSERT INTO ho_khau (ten_chu_ho, so_nhan_khau, dia_chi)
VALUES 
('Nguyễn Văn A', 4, '123 Đường Láng, Hà Nội'),
('Trần Thị B', 3, '456 Cầu Giấy, Hà Nội'),
('Phạm Văn C', 5, '789 Đống Đa, Hà Nội');
INSERT INTO nhan_khau (ho_ten, ngay_sinh, noi_sinh, dan_toc, quan_he_chu_ho, nghe_nghiep, so_cccd, id_ho_gia_dinh)
VALUES 
('Nguyễn Văn A', '1970-05-10', 'Hà Nội', 'Kinh', 'Chủ hộ', 'Kỹ sư', '001122334455', 1),
('Nguyễn Thị X', '1975-08-20', 'Hà Nội', 'Kinh', 'Vợ', 'Giáo viên', '001122334456', 1),
('Nguyễn Văn Y', '2000-09-15', 'Hà Nội', 'Kinh', 'Con', 'Sinh viên', '001122334457', 1),
('Trần Thị B', '1980-12-01', 'Hà Nội', 'Kinh', 'Chủ hộ', 'Bác sĩ', '001122334458', 2),
('Phạm Văn C', '1965-03-18', 'Hà Nội', 'Kinh', 'Chủ hộ', 'Doanh nhân', '001122334459', 3);
INSERT INTO tam_tru (ho_ten, ngay_den, thoi_gian_tam_tru, ly_do)
VALUES 
('Lê Thị D', '2024-01-01', 30, 'Công tác ngắn hạn'),
('Nguyễn Văn E', '2024-02-10', 90, 'Thăm người thân'),
('Trần Văn F', '2024-03-15', 60, 'Học tập');
INSERT INTO tam_vang (ho_ten, ngay_di, noi_den, ghi_chu)
VALUES 
('Nguyễn Thị G', '2024-06-01', 'Hải Phòng', 'Công tác dài hạn'),
('Trần Văn H', '2024-07-15', 'Hồ Chí Minh', 'Chuyển công tác'),
('Lê Thị I', '2024-08-20', 'Đà Nẵng', 'Thăm gia đình');

select * from nhan_khau;