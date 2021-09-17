package entities;

import java.util.Scanner;

public class DienKinhDoanhTrungAp extends DienKinhDoanh {
    private int giaGioBinhThuong = 2629;
    private int giaGioThapDiem = 1547;
    private int giaGioCaoDiem = 4400;

    @Override
    public double calculate() {
        double tongTienThanhToanChuaVAT, tongTienThanhToanVAT;
        tongTienThanhToanChuaVAT = soDienGioBinhThuong * giaGioBinhThuong + soDienGioThapDiem * giaGioThapDiem + soDienGioCaoDiem * giaGioCaoDiem;
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
