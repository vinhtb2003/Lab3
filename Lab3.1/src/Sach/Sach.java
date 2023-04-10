package Sach;

import java.util.Scanner;

public class Sach {
	private String ma, ten, tg;
	private int trang, tap, gia;
	private String loai, nxb;

	public Sach() {
	}

	public Sach(String ma, String ten, String tg, int trang, int tap, int gia, String loai, String nxb) {
		this.ma = ma;
		this.ten = ten;
		this.tg = tg;
		this.trang = trang;
		this.tap = tap;
		this.gia = gia;
		this.loai = loai;
		this.nxb = nxb;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTg() {
		return tg;
	}

	public void setTg(String tg) {
		this.tg = tg;
	}

	public int getTrang() {
		return trang;
	}

	public void setTrang(int trang) {
		this.trang = trang;
	}

	public int getTap() {
		return tap;
	}

	public void setTap(int tap) {
		this.tap = tap;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	public void nhapsach() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma sach: ");
		this.ma = sc.nextLine();
		System.out.print("Nhap ten sach: ");
		this.ten = sc.nextLine();
		System.out.print("Nhap tac gia: ");
		this.tg = sc.nextLine();
		System.out.print("Nhap so trang: ");
		this.trang = sc.nextInt();
		System.out.print("Nhap so tap: ");
		this.tap = sc.nextInt();
		System.out.print("Nhap gia sach: ");
		this.gia = sc.nextInt();
		Scanner rc = new Scanner(System.in);
		System.out.print("Nhap loai sach: ");
		this.loai = rc.nextLine();
		System.out.print("Nhap nha xuat ban: ");
		this.nxb = rc.nextLine();
	}

	public void inSach() {
		System.out.println("Ma sach: " + this.ma + "; Ten sach: " + this.ten + ";Tac gia: " + this.tg + ";So trang: "
				+ this.trang + ";So tap: " + this.tap + ";Gia sach: " + this.gia + ";Loai sach: " + this.loai
				+ ";Nha xuat ban: " + this.nxb);

	}

}
