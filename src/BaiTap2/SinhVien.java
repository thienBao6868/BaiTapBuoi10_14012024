package BaiTap2;

public class SinhVien {
	String ten;
	int maSv;
	double diemToan;
	double diemLy;
	double diemHoa;
	
	public SinhVien(String ten, int maSv, double diemToan, double diemLy, double diemHoa) {
		this.ten = ten;
		this.maSv = maSv;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	};
	
	public double diemTrungBinh() {
		double diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
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


