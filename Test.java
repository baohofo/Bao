import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static int a[] = new int[1000];
     public static void main(String[] args){
int n = nhapn();
Nhapmang(n,a);
xuatmang(n,a);
timngaydautien(n,a);
tinhtb(n,a);
/*tangdan(n,a);*/
vipham(n,a);
n = xoapt(n,a);
n = thempt(n,a);

     }

     public static int nhapn(){
         int n = -1;
         do {
             try {
                 System.out.println("Nhap N: ");
                 n=sc.nextInt();
                 if(n<0)
                     System.out.println("K so am");
             } catch (Exception e) {
                 System.out.println("Loi");
             }
         } while (n<0);
             return n;
     }

     public static void Nhapmang(int n, int a[]){
         System.out.println("Mang hien tai");
         for (int i = 0; i<n;i++){
             System.out.printf("Mang thu %d: ", i);
             a[i]= sc.nextInt();
         }
     }

     public static void xuatmang(int n, int a[]){
         for (int i = 0; i<n;i++){
             System.out.printf(" %d ", a[i]);
         }
     }

     public static void timngaydautien(int n, int a[]){
         int vt = -1;
         for (int i =0;i<n;i++){
             if(a[i]>100) {
                 vt = i;
                 break;
             }
         }
         if (vt == -1)
             System.out.println("\nK co ngay o nhiem");
         else
             System.out.printf("\nNgay o nhiem nam o ngay %d",vt);
     }

     public static void tinhtb(int n, int a[]){
         long tong = 0;
         for (int i = 0; i<n;i++){
             tong += a[i];
         }
         double tb= tong/n;
         System.out.printf("\nChi so tb la: %.2f",tb);

         int dem = 0;
         for (int i =0 ; i<n;i++){
             if(a[i]>tb){
                 dem++;
             }
         }
         System.out.printf("\nTong ngay cao hon tb la: %d ", dem);
     }

     public static void tangdan(int n, int a[]){
         for (int i =0; i<n-1;i++){
             for (int j = i + 1; j < n; j++){
                 if(a[i]>a[j]){
                     int tam = a[i];
                     a[i] = a[j];
                     a[j] = tam;
                 }
             }
         }
         System.out.println("\nMang sau khi sap xep");
         xuatmang(n,a);
     }

     public static void vipham(int n, int a[]){
         int vt = 0;
         for (int i = 0; i<n;i++){
             if(a[i]<50) {
                 int tam = a[i];
                 a[i] = a[vt];
                 a[vt] = tam;
                 vt++;
             }
         }
         System.out.println("\nMang sau khi sap xep");
         xuatmang(n,a);
     }

     public static int xoapt(int n, int a[]){
         if(n<0){
             System.out.println("K có để xóa");
             return n;
         }

        int k = -1;
         System.out.println("\nNhap vi tri can xoa: ");
         k = sc.nextInt();

         for(int  i = k; i<n-1;i++){
             a[i]=a[i+1];
         }

         n--;
         System.out.println("\nDa xoa xong");
         xuatmang(n,a);
         return n;
     }

     public static int thempt(int n , int a[]){
         if(n>=1000){
             System.out.println("Day k the them");
             return n;
         }

         int x = -1, m = -1;
         System.out.println("Nhập vị trí cần thêm: ");
         x = sc.nextInt();
         System.out.println("Nhập giá trị cần thêm: ");
         m = sc.nextInt();

         for (int i = n; i>x;i--){
             a[i]= a[i-1];
         }

         a[x] = m;
         n++;
         System.out.println("Da them vao");
         xuatmang(n,a);
         return n;
     }

      public static boolean KTSNT(int n){
         if(n<2)
             return false;

         for (int i = 2; i<= Math.sqrt(n);i++){
             if(n%i==0)
                 return false;
         }
         return true;
      }

      public static boolean sochinhphuong(int n){
         if(n<0)
             return false;

         for(int i = 0; i*i<=n;i++){
             if(i*i==n)
                 return true;
         }
         return false;
      }

      public static boolean sohoanthien(int n){
          if(n<0)
              return false;
         int tong = 0;
         for (int i=1;i<n;i++){
             if(n%i==0)
               tong +=i;
         }
        return (tong == n);
      }

      public static void demsohoanthien(int n){
         int dem = 0;
         for(int i = 1; i<n;i++){
             if(sohoanthien(i))
                 dem++;
         }
          System.out.println("TOng la: " + dem);
      }

      public static void tinhtientaxi(int n){
         int tong = 0;
         if( n==1)
             tong += 16000;
         else if (n<=30)
             tong = (1*16000) + (n-1)*15000;
         else if (n>=31)
             tong = (1*16000) + (29*15000) + (n-30)*12000;

          System.out.println("Tong tien taxi la: " + tong);
      }

      public static void tinhtien(int gbd, int gkt){
          int tongTien = 0;
          int moc = 17;

          if (gkt <= moc) {
              // Trường hợp 1: Toàn bộ thời gian thuê trước 17h
              tongTien = (gkt - gbd) * 2500;
          }
          else if (gbd >= moc) {
              // Trường hợp 2: Toàn bộ thời gian thuê sau 17h
              tongTien = (gkt - gbd) * 3000;
          }
          else {
              // Trường hợp 3: Thuê "xuyên" mốc 17h
              // Tiền = (Thời gian trước 17h * 2500) + (Thời gian sau 17h * 3000)
              tongTien = (moc - gbd) * 2500 + (gkt - moc) * 3000;
          }

          System.out.println("Tổng tiền Internet: " + tongTien + " VNĐ");
      }

    public static void tinhLuongCongNhan(int gvao, int gra) {
        if (gvao < 6 || gra > 18 || gvao >= gra) {
            System.out.println("Giờ vào/ra không hợp lệ!");
            return;
        }

        int tongLuong = 0;
        int moc = 12;

        if (gra <= moc) {
            // Làm toàn bộ trước 12h
            tongLuong = (gra - gvao) * 6000;
        }
        else if (gvao >= moc) {
            // Làm toàn bộ sau 12h
            tongLuong = (gra - gvao) * 7500;
        }
        else {
            // Làm "xuyên" mốc 12h
            // Lương = (Giờ trước 12h * 6000) + (Giờ sau 12h * 7500)
            tongLuong = (moc - gvao) * 6000 + (gra - moc) * 7500;
        }

        System.out.println("Lương ngày của công nhân: " + tongLuong + " VNĐ");
    }

    public static void demChanLe(int n) {
        int chan = 0, le = 0;
        int temp = n; // Giữ lại n để in ra kết quả

        if (n == 0) chan = 1; // Trường hợp đặc biệt số 0

        while (n > 0) {
            int chuSo = n % 10; // Lấy chữ số cuối
            if (chuSo % 2 == 0) {
                chan++;
            } else {
                le++;
            }
            n /= 10; // Cắt bỏ chữ số cuối
        }

        System.out.println("Số " + temp + " có " + chan + " chữ số chẵn và " + le + " chữ số lẻ.");
    }

    public static void demChuSoNguyenTo(int n) {
        int dem = 0;
        int temp = n;

        while (n > 0) {
            int chuSo = n % 10;
            if (KTSNT(chuSo)) { // Gọi hàm kiểm tra
                dem++;
            }
            n /= 10;
        }
        System.out.println("Số " + temp + " có " + dem + " chữ số là số nguyên tố.");
    }
    public static void tinhTongUoc(int n) {
        int tong = 0;
        // Ước số của n nằm trong khoảng từ 1 đến chính nó (n)
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        System.out.println("Tổng các ước số của " + n + " là: " + tong);
    }

    public static void uocLeLonNhat(int n) {
        int uocMax = 1;
        // Duyệt ngược từ n về 1 để tìm nhanh nhất
        for (int i = n; i >= 1; i--) {
            if (n % i == 0 && i % 2 != 0) {
                uocMax = i;
                break; // Tìm thấy số lẻ đầu tiên là dừng luôn
            }
        }
        System.out.println("Ước số lẻ lớn nhất của " + n + " là: " + uocMax);
    }

    public static void kiemTraToanChanToanLe(int n) {
        int temp = n;
        boolean toanChan = true;
        boolean toanLe = true;

        while (n > 0) {
            int chuSo = n % 10;

            if (chuSo % 2 == 0) {
                toanLe = false;   // Có số chẵn thì không thể là "toàn lẻ"
            } else {
                toanChan = false; // Có số lẻ thì không thể là "toàn chẵn"
            }

            n /= 10;
        }

        if (toanChan) {
            System.out.println("Số " + temp + " có các chữ số toàn chẵn.");
        } else if (toanLe) {
            System.out.println("Số " + temp + " có các chữ số toàn lẻ.");
        } else {
            System.out.println("Số " + temp + " có cả chữ số chẵn và lẻ.");
        }
    }

    public static void inNSonNguyenTo(int n) {
        int dem = 0; // Đếm số lượng đã tìm thấy
        int i = 2;   // Số bắt đầu kiểm tra

        System.out.printf("%d số nguyên tố đầu tiên là: ", n);
        while (dem < n) {
            if (KTSNT(i)) {
                System.out.print(i + " ");
                dem++; // Tìm thấy 1 số thì tăng biến đếm
            }
            i++; // Kiểm tra số tiếp theo
        }
        System.out.println();
    }

    public static void inSoHoanThienNhoHonN(int n) {
        System.out.printf("Các số hoàn thiện nhỏ hơn %d là: ", n);
        boolean timThay = false;

        for (int i = 1; i < n; i++) {
            if (sohoanthien(i)) {
                System.out.print(i + " ");
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.print("Không có số nào.");
        }
        System.out.println();
    }
    public static void tinhtong(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println("Tong S la: " + s);
    }

    public static void tong2(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += (2 * n + 1);
        }
        System.out.println("Tong S la: " + s);
    }

    public static void tong3(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                s -= i;
            } else
                s += i;
        }
        System.out.println("Tong S la: " + s);
    }

    public static void tong4(int n) {
        long p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        System.out.println("Tong giai thua: " + p);
    }

    public static void tong5(int n) {
        long p = 1;
        for (int i = 1; i <= n; i++) {
            p *= (2 * n + 1);
        }
        System.out.println("Tong giai thua: " + p);
    }

    public static void tong6(int n) {
        long p = 0;
        for (int i = 1; i <= n; i++) {
            p += (long) i * i;
        }
        System.out.println("Tong giai thua 3: " + p);
    }

    public static void tong7(int n) {
        long p = 0;
        for (int i = 1; i <= n; i++) {
            p += Math.pow(i, i);
        }
        System.out.println("Tong giai thua 4: " + p);
    }

}


