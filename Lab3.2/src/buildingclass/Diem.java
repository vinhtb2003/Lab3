package buildingclass;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;

	public Diem(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;

	}

	public void setX(int x) {
		this.x = x;

	}

	public int getY() {
		return y;

	}

	public void setY(int y) {
		this.y = y;

	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap toa do x: ");
		x = sc.nextInt();
		System.out.print("Nhap toa do y: ");
		y = sc.nextInt();

	}

	public void inDiem() {
		System.out.println("(" + x + ";" + y + ")");
	}

}