package BaiTap2;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BaiTap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner
		Scanner scanner = new Scanner(System.in);
		// số lượng Sinh Viên Muốn Nhập
		System.out.print("Số sinh viên muốn nhập là : ");
		int soLuongSv = scanner.nextInt();
		ArrayList<SinhVien> cacSinhVien = nhapSinhVien(soLuongSv);
		
		// Tìm sinh Viên có điểm trung bình cao nhất 
		 sinhviencodiemtrungbinhcaonhat(cacSinhVien);
		
		// Tìm sinh viên yếu 
		// timsinhvienyeu(cacSinhVien);
		
		// Tìm sinh viên theo tên 
		//timsinhvientheoten(cacSinhVien);
		
		// Tìm sinh viên theo mã số 
		//timsinhvientheomaso(cacSinhVien);
		
		
		// Xoá sinh viên theo mã số. 
		//xoasinhvientheomaso(cacSinhVien);
		
		
		// Đóng hàm scanner 
		scanner.close();
	}

	public static ArrayList<SinhVien> nhapSinhVien(int soLuongSv) {
		ArrayList<SinhVien> cacSinhVien = new ArrayList<>();
		// scanner
		Scanner scanner = new Scanner(System.in);

		// Vong lap
		for (int i = 0; i < soLuongSv; i++) {

			System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");
			if(i > 0 ) {
				scanner.nextLine(); // Đọc dòng kết thúc từ lần nhập trước
			}
			System.out.println("\nTên: ");
			String hoTen = scanner.nextLine();
			System.out.println("maSv: ");
			int maSv = scanner.nextInt();
			System.out.println("Diem Toan: ");
			double diemToan = scanner.nextDouble();
			System.out.println("Diem Ly: ");
			double diemLy = scanner.nextDouble();
			System.out.println("Diem Hoa: ");
			double diemHoa = scanner.nextDouble();

			SinhVien sinhVien = new SinhVien(hoTen, maSv, diemToan, diemHoa, diemLy);
			cacSinhVien.add(sinhVien);

		}
		// Trước khi kết thúc hàm hoặc ứng dụng, đóng Scanner
		// scanner.close(); đóng scanner ở đây khi chạy hàm kế tiếp sẽ không đọc được scanner => báo lỗi 
		return cacSinhVien;
	}

	public static void sinhviencodiemtrungbinhcaonhat(ArrayList<SinhVien> cacSinhVien) {
		double diemTbLonNhat = cacSinhVien.get(0).diemTrungBinh();
		for (int i = 1; i < cacSinhVien.size(); i++) {
			double diemTb = cacSinhVien.get(i).diemTrungBinh();
			if (diemTb > diemTbLonNhat) {
				diemTbLonNhat = diemTb;
			}

		}
		;
		for (int i = 0; i < cacSinhVien.size(); i++) {
			double diemTb = cacSinhVien.get(i).diemTrungBinh();
			if (diemTbLonNhat == diemTb) {
				SinhVien sinhVien = cacSinhVien.get(i);
				System.out.println("Sinh Vien co diem TB lon nhat : ");
				System.out.println("Tên : " + sinhVien.ten);
				System.out.println("Ma SV : " + sinhVien.maSv);
				System.out.println("Điểm trung bình : " + diemTb);

			}
		}

	}

	public static void timsinhvienyeu(ArrayList<SinhVien> cacSinhVien) {

		for (int i = 0; i < cacSinhVien.size(); i++) {
			double diemTb = cacSinhVien.get(i).diemTrungBinh();
			if (diemTb < 5) {
				SinhVien sinhVien = cacSinhVien.get(i);
				System.out.println("Sinh Vien yeu : ");
				System.out.println("Tên : " + sinhVien.ten);
				System.out.println("Ma SV : " + sinhVien.maSv);
				System.out.println("Điểm trung bình : " + diemTb);

			}
		}

	}

	public static void timsinhvientheoten(ArrayList<SinhVien> cacSinhVien) {
		// scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Vui lòng nhập tên sinh viên cần tìm : ");
		String ten = scanner.nextLine();
		for (int i = 0; i < cacSinhVien.size(); i++) {
			if (ten.equals(cacSinhVien.get(i).ten)) {
				SinhVien sinhVien = cacSinhVien.get(i);
				System.out.println("Sinh Vien can tim la : ");
				System.out.println("Tên : " + sinhVien.ten);
				System.out.println("Ma SV : " + sinhVien.maSv);
				return;
			}
		}
		;
		System.out.println("Không tìm thấy sinh viên có tên là " + ten);
	
	};
	public static void timsinhvientheomaso (ArrayList<SinhVien> cacSinhVien) {
		// scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Vui lòng nhập mã số  sinh viên cần tìm : ");
		int maSv = scanner.nextInt();
		for (int i = 0; i < cacSinhVien.size(); i++) {
			if (maSv == cacSinhVien.get(i).maSv) {
				SinhVien sinhVien = cacSinhVien.get(i);
				System.out.println("Sinh Vien can tim la : ");
				System.out.println("Tên : " + sinhVien.ten);
				System.out.println("Ma SV : " + sinhVien.maSv);
				return;
			}
		}
		;
		System.out.println("Không tìm thấy sinh viên có mã sinh viên là " + maSv);
	
	};
	public static void xoasinhvientheomaso (ArrayList<SinhVien> cacSinhVien) {
		// scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Vui lòng nhập mã số  sinh viên cần xoá : ");
		int maSv = scanner.nextInt();
		for (int i = 0; i < cacSinhVien.size(); i++) {
			if (maSv == cacSinhVien.get(i).maSv) {
				cacSinhVien.remove(i);
				System.out.println(cacSinhVien.size());
			}
		}
		;
		
	
	};

}
