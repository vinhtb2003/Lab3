package buildingclass;

import java.util.Scanner;

public class Duongtron extends Diem {
	protected Diem tamI;
	protected int r;

	public Duongtron(int x, int y, int r) {
		super(x, y);
		this.r = r;
		tamI = new Diem(0, 0);
	}

	public void nhapDT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tam I ");
		tamI.nhapDiem();
		System.out.print("Nhap ban kinh r: ");
		r = sc.nextInt();
	}

	public void inDT() {
		System.out.print("Toa do tam I cua duong tron la: I");
		tamI.inDiem();
		System.out.print("Ban kinh r cua duong tron la: " + r);
	}

	public double chuviDT() {
		return Math.sqrt(2 * Math.PI * r);
	}

	public double dientichDT() {
		return Math.sqrt(Math.PI * r * r);
	}
}
