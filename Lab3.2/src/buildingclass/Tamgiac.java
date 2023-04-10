package buildingclass;

public class Tamgiac extends Diem {
	private Diem A, B, C;

	public Tamgiac(int x, int y) {
		super(x, y);
		A = new Diem(0, 0);
		B = new Diem(0, 0);
		C = new Diem(0, 0);
	}

	public void NhapTG() {
		System.out.println("Nhap toa do diem A ");
		A.nhapDiem();
		System.out.println("Nhap toa do diem B ");
		B.nhapDiem();
		System.out.println("Nhap toa do diem C ");
		C.nhapDiem();
	}

	public void inTG() {
		System.out.print("Diem A");
		A.inDiem();
		System.out.print("Diem B");
		B.inDiem();
		System.out.print("Diem C");
		C.inDiem();
	}

	public float AB() {
		float AB;
		AB = (float) Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
		return AB;
	}

	public float AC() {
		float AC;
		AC = (float) Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
		return AC;
	}

	public float BC() {
		float BC;
		BC = (float) Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
		return BC;
	}

	public void Kiemtra() {
		float AB, AC, BC;
		AB = (float) Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
		AC = (float) Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
		BC = (float) Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));

		if ((AB + AC > BC && AB + BC > AC && AC + BC > AB)) {
			System.out.println("Thoa man");
		} else {
			System.err.println("Ba canh khong tso thanh tam giac!");
		}
	}

	public float tinhChuvi() {
		float AB, AC, BC;
		AB = (float) Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
		AC = (float) Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
		BC = (float) Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
		return AB + AC + BC;
	}

	public double tinhDientich() {
		float AB, AC, BC;
		AB = (float) Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
		AC = (float) Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
		BC = (float) Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
		float p = AB + AC + BC / 2;
		return Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));

	}
}
