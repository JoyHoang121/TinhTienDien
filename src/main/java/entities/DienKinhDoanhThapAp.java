package entities;

import java.util.Scanner;

public class DienKinhDoanhThapAp extends DienKinhDoanh {
    private int giaGioBinhThuong = 2666;
    private int giaGioThapDiem = 1622;
    private int giaGioCaoDiem = 4587;

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
