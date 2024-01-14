
public class SinhVien {

	String hoTen;
	int maSv;
	double diemToan;
	double diemLy;
	double diemHoa;

	public SinhVien() {
	};

	public SinhVien(String thamSo1, int thamSo2, double thamSo3, double thamSo4, double thamSo5) {
		hoTen = thamSo1;
		maSv = thamSo2;
		diemToan = thamSo3;
		diemLy = thamSo4;
		diemHoa = thamSo5;

	}
	public void xuatThongTin() {
		System.out.println("Tên : " + hoTen + " + diemToan :" + diemToan + "+ diemLy : " + diemLy + "+ diemHoa: " + diemHoa);
	}

	public double diemTrungBinh() {
		double diemTB = (diemToan + diemLy + diemHoa) / 3;
		return diemTB;
	}

	public String xepLoai(double diemTB) {
		String ketQua = "";
		if (diemTB >= 9) {
			ketQua = "Xuat sac";

		} else if (diemTB < 9 && diemTB >= 8) {
			ketQua = " Gioi";

		} else if (diemTB < 8 && diemTB >= 7) {
			ketQua = " Kha";

		} else if (diemTB < 7 && diemTB >= 6) {
			ketQua = " Trung Binh kha ";

		}else if (diemTB < 6 && diemTB >= 5) {
			ketQua = "Trung binh";
			
		}else {
			ketQua = "Yeu Kem";
		}
		return ketQua;
	}

}
