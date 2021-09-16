package entities;

import java.util.Scanner;

public class DienKinhDoanh extends Dien {
    protected int soDienGioBinhThuong, soDienGioThapDiem, soDienGioCaoDiem;

    @Override
    public double calculate() {
        return 0;
    }

    public void inputInfo(Scanner sc) {
        System.out.println("Mời nhập số ký điện giờ bình thường ");
        this.soDienGioBinhThuong = sc.nextInt();
        System.out.println("Mời nhập số ký điện giờ thấp điểm");
        this.soDienGioThapDiem = sc.nextInt();
        System.out.println("Mời nhập số ký điện giờ cao điểm");
        this.soDienGioCaoDiem = sc.nextInt();
    }

    private int tongSoKySuDung() {
        return soDienGioCaoDiem + soDienGioThapDiem + soDienGioBinhThuong;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DienKinhDoanhCaoAp{");
        sb.append(" soDienGioBinhThuong = ").append(soDienGioBinhThuong);
        sb.append(", soDienGioThapDiem = ").append(soDienGioThapDiem);
        sb.append(", soDienGioCaoDiem = ").append(soDienGioCaoDiem);
        sb.append(", TongSoKyDienSuDung = ").append(tongSoKySuDung());
        sb.append('}');
        return sb.toString();
    }
}
