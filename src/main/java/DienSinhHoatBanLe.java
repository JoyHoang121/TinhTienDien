public class DienSinhHoatBanLe extends Dien {
    private int soKy;

    private int tongSoKySuDung() {
        return soKy = soCuoiKy - soDauky;
    }

    @Override
    public int Calculate() {
        int tienThanhToan = 0;
        if (soKy <= 50) {
            tienThanhToan = soKy * 1678;
        } else if (soKy <= 100) {
            tienThanhToan = 50 * 1678 + (soKy - 50) * 1734;
        } else if (soKy > 101 && soKy <= 200) {
            tienThanhToan = 50 * 1678 + 50 * 1734 + (soKy - 100) * 2014;
        } else if (soKy > 201 && soKy <= 300) {
            tienThanhToan = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soKy - 200) * 2536;
        } else if (soKy > 301 && soKy <= 400) {
            tienThanhToan = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soKy - 300) * 2834;
        } else {
            tienThanhToan = 50 * 1403 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soKy - 400) * 2927;
        }
        return tienThanhToan;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DienSinhHoatBanLe{");
        super.getDienInfo(sb);
        sb.append(", soKySuDung= ").append(tongSoKySuDung());
        sb.append('}');
        return sb.toString();
    }
}
