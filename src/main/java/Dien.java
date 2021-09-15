import java.util.Scanner;

public abstract class Dien {
    protected int soDauky, soCuoiKy;

    public Dien() {
    }

    public Dien(int soDauky, int soCuoiKy) {
        this.soDauky = soDauky;
        this.soCuoiKy = soCuoiKy;
    }

    public void inputInfo(Scanner sc) {
        System.out.println("Mời nhập số đầu kỳ");
        this.soDauky = sc.nextInt();
        System.out.println("Mời nhập số cuối kỳ");
        this.soCuoiKy = sc.nextInt();
    }

    public abstract double Calculate();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dien{");
        this.getDienInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    protected void getDienInfo(StringBuffer sb) {
        sb.append("soDauky=").append(soDauky);
        sb.append(", soCuoiKy=").append(soCuoiKy);
    }
}
