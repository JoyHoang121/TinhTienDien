package entities;

public class DienSinhHoatBanSi extends DienSinhHoat {
    private int giaBac1 = 1403;
    private int giaBac2 = 1459;
    private int giaBac3 = 1590;
    private int giaBac4 = 1971;
    private int giaBac5 = 2231;
    private int giaBac6 = 2323;

    private int tongSoKySuDung() {
        return soKy = soCuoiKy - soDauky;
    }

    @Override
    public double calculate() {
        int tienThanhToanChuaVAT;
        double tienThanhToanVAT;
        if (soKy <= 50) {
            tienThanhToanChuaVAT = soKy * giaBac1;
        } else if (soKy <= 100) {
            tienThanhToanChuaVAT = 50 * giaBac1 + (soKy - 50) * giaBac2;
        } else if (soKy > 101 && soKy <= 200) {
            tienThanhToanChuaVAT = 50 * giaBac1 + 50 * giaBac2 + (soKy - 100) * giaBac3;
        } else if (soKy > 201 && soKy <= 300) {
            tienThanhToanChuaVAT = 50 * giaBac1 + 50 * giaBac2 + 100 * giaBac3 + (soKy - 200) * giaBac4;
        } else if (soKy > 301 && soKy <= 400) {
            tienThanhToanChuaVAT = 50 * giaBac1 + 50 * giaBac2 + 100 * giaBac3 + 100 * giaBac4 + (soKy - 300) * giaBac5;
        } else {
            tienThanhToanChuaVAT = 50 * giaBac1 + 50 * giaBac2 + 100 * giaBac3 + 100 * giaBac4 + 100 * giaBac5 + (soKy - 400) * giaBac6;
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
