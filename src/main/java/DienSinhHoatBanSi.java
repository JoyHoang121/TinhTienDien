public class DienSinhHoatBanSi extends Dien {
    private int soKy;


    private int tongSoKySuDung() {
        return soKy = soCuoiKy - soDauky;
    }
    @Override
    public double Calculate() {
        int tienThanhToan = 0;
        double tienThanhToanVAT = 0;
        if (soKy <= 50) {
            tienThanhToan = soKy * 1403;
        } else if (soKy <= 100) {
            tienThanhToan = 50 * 1403 + (soKy - 50) * 1459;
        } else if (soKy > 101 && soKy <= 200) {
            tienThanhToan = 50 * 1403 + 50 * 1459 + (soKy - 100) * 1590;
        } else if (soKy > 201 && soKy <= 300) {
            tienThanhToan = 50 * 1403 + 50 * 1459 + 100 * 1590 + (soKy - 200) * 1971;
        } else if (soKy > 301 && soKy <= 400) {
            tienThanhToan = 50 * 1403 + 50 * 1459 + 100 * 1590 + 100 * 1971 + (soKy - 300) * 2231;
        } else {
            tienThanhToan = 50 * 1403 + 50 * 1459 + 100 * 1590 + 100 * 1971 + 100 * 2231 + (soKy-400) * 2323;
        }
        tienThanhToanVAT = tienThanhToan + tienThanhToan * 0.1;
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
