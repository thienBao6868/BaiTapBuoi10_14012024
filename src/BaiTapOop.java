
public class BaiTapOop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien("Nguyen Van A", 001, 8,9,9);
		double diemTB = sv.diemTrungBinh();
		String xepLoai = sv.xepLoai(diemTB);
		sv.xuatThongTin();
		System.out.println("DTB : " + diemTB + " - Xep Loai :" + xepLoai);
	}

}
