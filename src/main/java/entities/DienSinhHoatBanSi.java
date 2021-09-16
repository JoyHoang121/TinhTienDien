package entities;

public class DienSinhHoatBanSi extends DienSinhHoat {
    private int soKy;


    private int tongSoKySuDung() {
        return soKy = soCuoiKy - soDauky;
    }
    @Override
    public double calculate() {
        int tienThanhToanChuaVAT;
        double tienThanhToanVAT;
        if (soKy <= 50) {
            tienThanhToanChuaVAT = soKy * 1403;
        } else if (soKy <= 100) {
            tienThanhToanChuaVAT = 50 * 1403 + (soKy - 50) * 1459;
        } else if (soKy > 101 && soKy <= 200) {
            tienThanhToanChuaVAT = 50 * 1403 + 50 * 1459 + (soKy - 100) * 1590;
        } else if (soKy > 201 && soKy <= 300) {
            tienThanhToanChuaVAT = 50 * 1403 + 50 * 1459 + 100 * 1590 + (soKy - 200) * 1971;
        } else if (soKy > 301 && soKy <= 400) {
            tienThanhToanChuaVAT = 50 * 1403 + 50 * 1459 + 100 * 1590 + 100 * 1971 + (soKy - 300) * 2231;
        } else {
            tienThanhToanChuaVAT = 50 * 1403 + 50 * 1459 + 100 * 1590 + 100 * 1971 + 100 * 2231 + (soKy-400) * 2323;
        }
        tienThanhToanVAT = tienThanhToanChuaVAT + tienThanhToanChuaVAT * 0.1;
        return tienThanhToanVAT;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DienSinhHoatBanSi {");
        super.getDienInfo(sb);
        sb.append(", soKySuDung= ").append(tongSoKySuDung());
        sb.append('}');
        return sb.toString();
    }
}
