import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số loại điện cần đăng ký");
        int n = sc.nextInt();
        Dien[] list = new Dien[n];
        for(int i=0;i<n;i++){
            System.out.println("Mời chọn loại đăng ký điện thứ " + (i+1) );
            System.out.println("1. Điện sinh hoạt bán lẻ  2. Điện sinh hoạt bán sỉ 3.Điện kinh doanh cao áp");
            System.out.println("4 Điện kinh doanh trung áp  5. Điện kinh doanh thấp áp");
            int type = sc.nextInt();
            switch (type){
                case 1: list[i] = new DienSinhHoatBanLe();break;
                case 2: list[i] = new DienSinhHoatBanSi();break;
                case 3: list[i] = new DienKinhDoanhCaoAp();break;
                case 4: list[i] = new DienKinhDoanhTrungAp();break;
                case 5: list[i] = new DienKinhDoanhThapAp();break;
                default:
                    break;
            }
            list[i].inputInfo(sc);
        }

        System.out.println("Thông tin đăng ký điện");
        for(Dien type:list){
            System.out.println(type);
        }

        double total = 0;
        for (Dien s : list) {
            total +=  s.Calculate();
        }
        System.out.println("Tổng số tiền phải thanh toán: " + total);
    }
}
