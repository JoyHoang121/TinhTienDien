package entities;

import java.util.Scanner;

public class DienSinhHoat extends Dien {
    protected int soDauky, soCuoiKy;
    protected int soKy = soCuoiKy - soDauky;


    public DienSinhHoat() {
    }

    public DienSinhHoat(int soDauky, int soCuoiKy) {
        this.soDauky = soDauky;
        this.soCuoiKy = soCuoiKy;
    }

    public void inputInfo(Scanner sc) {
        System.out.println("Mời nhập số đầu kỳ");
        this.soDauky = sc.nextInt();
        System.out.println("Mời nhập số cuối kỳ");
        this.soCuoiKy = sc.nextInt();
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("entities.Dien{");
        this.getDienInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    protected void getDienInfo(StringBuffer sb) {
        sb.append(" soDauky=").append(soDauky);
        sb.append(", soCuoiKy=").append(soCuoiKy);
    }

    @Override
    public double calculate() {
        return 0;
    }
}
