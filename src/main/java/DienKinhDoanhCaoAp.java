import java.util.Scanner;

public class DienKinhDoanhCaoAp extends Dien {
    private int soDienGioBinhThuong, soDienGioThapDiem, soDienGioCaoDiem;


    @Override
    public void inputInfo(Scanner sc) {
        System.out.println("Mời nhập số ký điện giờ bình thường ");
        this.soDienGioBinhThuong = sc.nextInt();
        System.out.println("Mời nhập số ký điện giờ thấp điểm");
        this.soDienGioThapDiem = sc.nextInt();
        System.out.println("Mời nhập số ký điện giờ cao điểm");
        this.soDienGioCaoDiem = sc.nextInt();
    }


    @Override
    public double Calculate() {
        double tongTienThanhToanChuaVAT, tongTienThanhToanVAT;
        tongTienThanhToanChuaVAT = soDienGioBinhThuong * 2442 + soDienGioCaoDiem * 4251 + soDienGioThapDiem * 1361;
        tongTienThanhToanVAT = tongTienThanhToanChuaVAT + tongTienThanhToanChuaVAT * 0.1;
        return tongTienThanhToanVAT;
    }

    private int tongSoKySuDung() {
        return soDienGioCaoDiem + soDienGioThapDiem + soDienGioBinhThuong;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DienKinhDoanhCaoAp{");
        sb.append(", soDienGioBinhThuong = ").append(soDienGioBinhThuong);
        sb.append(", soDienGioThapDiem = ").append(soDienGioThapDiem);
        sb.append(", soDienGioCaoDiem = ").append(soDienGioCaoDiem);
        sb.append(", TongSoKyDienSuDung = ").append(tongSoKySuDung());
        sb.append('}');
        return sb.toString();
    }
}
