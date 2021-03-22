/*
Created		3/22/2021
Modified		3/22/2021
Project		
Model			
Company		
Author		
Version		
Database		MS SQL 2005 
*/

create database CUAHANGNUOCHOA
go
use CUAHANGNUOCHOA
go

Create table [BAIVIETNUOCHOA]
(
	[MaBV] Integer Identity NOT NULL,
	[AnhMinhHoa] Image NOT NULL,
	[ThongTinCoBanNuocHoa] Text NOT NULL,
Primary Key ([MaBV])
) 
go

Create table [MUIHUONG]
(
	[MaMH] Integer Identity NOT NULL,
	[TenMH] Nvarchar(20) NOT NULL,
	[MoTa] Text NOT NULL,
	[AnhMinhHoa] Image NOT NULL,
	[MaNhom] Integer NOT NULL,
Primary Key ([MaMH])
) 
go

Create table [NUOCHOA]
(
	[MaNH] Integer Identity NOT NULL,
	[MaSoHang] Integer NOT NULL,
	[AnhNH] Image NOT NULL,
	[TenNH] Nvarchar(20) NOT NULL,
	[GioiTinh] Bit NOT NULL,
	[DoTuoi] Integer NOT NULL,
	[NamRaMat] Datetime NOT NULL,
	[NongDo] Varchar(10) NOT NULL,
	[NhaPhaChe] Nvarchar(30) NOT NULL,
	[DoLuuHuong] Char(10) NOT NULL,
	[DoToaHuong] Char(30) NOT NULL,
	[ThoiDiemKhuyenDung] Char(20) NOT NULL,
	[PhongCach] Char(20) NOT NULL,
	[GiaBan] Money NOT NULL,
	[DanhGia] Text NOT NULL,
	[DiemDanhGia] Float NOT NULL,
	[MaBV] Integer NOT NULL,
	[MaNhom] Integer NOT NULL,
Primary Key ([MaNH])
) 
go

Create table [HANGNUOCHOA]
(
	[MaSoHang] Integer Identity NOT NULL,
	[TenHang] Nvarchar(20) NOT NULL,
	[Logo] Image NOT NULL,
	[QuocGia] Nvarchar(30) NOT NULL,
	[LinhVuc] Char(30) NOT NULL,
	[Website] Char(30) NOT NULL,
	[CongTyMe] Nvarchar(30) NOT NULL,
	[TTNguoiSangLap] Text NOT NULL,
Primary Key ([MaSoHang])
) 
go

Create table [NHOMMUIHUONG]
(
	[MaNhom] Integer Identity NOT NULL,
	[TenNhom] Nvarchar(30) NOT NULL,
	[AnhMinhHoa] Image NOT NULL,
	[MoTa] Text NOT NULL,
Primary Key ([MaNhom])
) 
go

Create table [MH-NH]
(
	[MaNH] Integer NOT NULL,
	[MaMH] Integer NOT NULL,
Primary Key ([MaNH],[MaMH])
) 
go


Alter table [NUOCHOA] add  foreign key([MaBV]) references [BAIVIETNUOCHOA] ([MaBV])  on update no action on delete no action 
go
Alter table [MH-NH] add  foreign key([MaMH]) references [MUIHUONG] ([MaMH])  on update no action on delete no action 
go
Alter table [MH-NH] add  foreign key([MaNH]) references [NUOCHOA] ([MaNH])  on update no action on delete no action 
go
Alter table [NUOCHOA] add  foreign key([MaSoHang]) references [HANGNUOCHOA] ([MaSoHang])  on update no action on delete no action 
go
Alter table [NUOCHOA] add  foreign key([MaNhom]) references [NHOMMUIHUONG] ([MaNhom])  on update no action on delete no action 
go
Alter table [MUIHUONG] add  foreign key([MaNhom]) references [NHOMMUIHUONG] ([MaNhom])  on update no action on delete no action 
go


Set quoted_identifier on
go


Set quoted_identifier off
go
