package entities;

import java.util.Scanner;

public class DienKinhDoanhCaoAp extends DienKinhDoanh {
    private int giaGioBinhThuong = 2442;
    private int giaGioThapDiem = 1361;
    private int giaGioCaoDiem = 4251;
    @Override
    public double calculate() {
        double tongTienThanhToanChuaVAT, tongTienThanhToanVAT;
        tongTienThanhToanChuaVAT =soDienGioBinhThuong * giaGioBinhThuong + soDienGioThapDiem * giaGioThapDiem + soDienGioCaoDiem * giaGioCaoDiem ;
        tongTienThanhToanVAT = tongTienThanhToanChuaVAT + tongTienThanhToanChuaVAT * 0.1;
        return tongTienThanhToanVAT;
    }

    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
