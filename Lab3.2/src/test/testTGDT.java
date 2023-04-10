package test;

import java.text.DecimalFormat;

import buildingclass.Diem;
import buildingclass.Duongtron;
import buildingclass.Tamgiac;

public class testTGDT {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".##");
		System.out.println("<<<<<- TAM GIAC ->>>>>");
		Tamgiac tg = new Tamgiac(0, 0);
		tg.NhapTG();
		tg.inTG();
		tg.Kiemtra();
		System.out.println("Chu vi tam giac la: " + df.format(tg.tinhChuvi()));
		System.out.println("Dien tich tam giac la: " + df.format(tg.tinhDientich()));

		System.out.println("<<<<<- DUONG TRON ->>>>>");
		Duongtron ht = new Duongtron(0, 0, 0);
		ht.nhapDT();
		ht.inDT();
		System.out.println();
		System.out.println("Chu vi duong tron la: " + df.format(ht.chuviDT()));
		System.out.println("Dien tich duong tron la: " + df.format(ht.dientichDT()));

	}
}