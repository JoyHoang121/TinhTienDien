package entities;

import java.util.Scanner;

public class DienKinhDoanhThapAp extends DienKinhDoanh {
    @Override
    public double calculate() {
        double tongTienThanhToanChuaVAT, tongTienThanhToanVAT;
        tongTienThanhToanChuaVAT = soDienGioBinhThuong * 2442 + soDienGioCaoDiem * 4251 + soDienGioThapDiem * 1361;
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
