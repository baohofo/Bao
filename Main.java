import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Nhapn();
        int a[] = new int[1000];
        Nhapmang(n, a);
        xuatmang(n, a);
        timvid(n, a);
        tinhtb(n, a);
        giamdan(n, a);
        sapxepvipham(n, a);
        n = xoapt(n, a);
        n = themptu(n, a);

    }

    public static int Nhapn() {
        int n = -1;
        do {
            try {
                System.out.println("Nhap luot xem: ");
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Ko dc am");
                }
            } catch (Exception e) {
                System.out.println("Ko nhap chu");
                sc.nextLine();
            }
        } while (n < 0);
        return n;
    }

    public static void Nhapmang(int n, int a[]) {
        System.out.println("Danh sach luot xem hien tai");
        for (int i = 0; i < n; i++) {
            System.out.printf("Luot xem vid thu %d: ", i);
            a[i] = sc.nextInt();
        }
    }

    public static void xuatmang(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d ", a[i]);
        }
    }

    public static void timvid(int n, int a[]) {
        int vt = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 500) {
                vt = i;
                break;
            }
        }
        if (vt == -1) {
            System.out.println("\nK co xu huong");
        } else
            System.out.printf("\nVid xu huong o vi tri thu %d", vt);
    }

    public static void tinhtb(int n, int a[]) {
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        double tb = tong / n;
        System.out.println("\nVid trug binh la: " + tb);


        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < tb) {
                count++;
            }
        }
        System.out.println("\nLuong vid thap hon tb la: " + count);
    }


    public static void giamdan(int n, int a[]) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
        }
        System.out.println("\nXuat mang sau khi sap xep: ");
        xuatmang(n, a);
    }

    public static void sapxepvipham(int n, int a[]) {
        int vt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                int tam = a[i];
                a[i] = a[vt];
                a[vt] = tam;
                vt++;
            }
        }
        System.out.println("\nSau khi sap xep vi pham la: ");
        xuatmang(n, a);
    }

    public static int xoapt(int n, int a[]) {
        if (n < 0) {
            System.out.println("K co gi de xoa");
            return n;
        }
        int k = -1;
        System.out.println("Nhap vi tri can xoa: ");
        k = sc.nextInt();
        for (int i = k; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;
        System.out.println("Mang sau khi xoa");
        xuatmang(n, a);
        return n;
    }

    public static int themptu(int n, int a[]) {
        if (n >= 100) {
            System.out.println("day");
            return n;
        }

        int x = -1, m = -1;
        do {
            try {
                System.out.println("Nhap vi tri them: ");
                x = sc.nextInt();
                if (x < 0 || x > n)
                    System.out.println("K them dc");
            } catch (Exception e) {
                System.out.println("Loi");
                sc.nextLine();
            }
        } while (x < 0 || x > n);
        do {
            try {
                System.out.println("Nhap gia tri them: ");
                m = sc.nextInt();
                if (m < 0)
                    System.out.println("K them dc");
            } catch (Exception e) {
                System.out.println("Loi");
                sc.nextLine();
            }
        } while (m < 0);

        for (int i = n; i > x; i--) {
            a[i] = a[i - 1];
        }
        a[x] = m;
        n++;
        System.out.println("Mang sau khi them");
        xuatmang(n, a);
        return n;
    }

/*    public static int timucln(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b!=0){
            int tam = a % b;
            a= b;
            b= tam;

        }
        return a;
    }
    public static int bccn(){
        return (a*b)/timucln;
    }*/

    public static void tinhgt(int n) {
        long s = 0, p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
            s += p;
        }
        System.out.println("Tong la: " + s);
    }

    public static void tinhps(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println("Tong la: " + s);
    }

    public static boolean ktsnt(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void lietke(int n) {
        for (int i = 2; i < n; i++) {
            if (ktsnt(n)) {
                System.out.printf(" %d ", i);
            }
        }
    }

    public static boolean sochinhphuong(int n) {
        if (n < 0) {
            return false;
        }

        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void cacvitrile(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                if (sochinhphuong(i))
                    System.out.println(" " + a[i]);
            }
        }
    }

    public static void amlonnhat(int n, int a[]) {
        int vt = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                if (vt == -1 || a[i] > a[vt]) {
                    vt = i;
                }
            }
            if (vt == -1)
                System.out.println("Ko co nen bang -1");
            else
                System.out.println("Vi tri am lon nhat: " + vt);

        }
    }

    public static void tongdacbiet(int n, int a[]){
        int tong = 0;

        if (a[0]>a[1]){
            tong+=a[0];
        }
        for (int i = 1; i < n - 1 ; i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]){
                tong += a[i];
            }
        }
        if(a[n-1]>a[n-2]){
            tong+=a[n-1];
        }
        System.out.println(" "+tong);
    }

    public static int xoaptuxnhohon(int n, int a[],int x){
        int k = 0;
        System.out.println("Nhap gia tri x: ");
        k = sc.nextInt();

        for (int i =0;i<n;i++){
            if(a[i]>x){
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }

    public static void demsochanle(int n){
        int chan = 0, le = 0;
        int goc = n;

        if (n==0)
            chan = 1;
        while(n>0){
            int so = n % 10;
            if(so%2==0){
                chan++;
            } else
                le++;
        }
        n=n/10;
    }

    public static void tinhgiathuaphanso(int n){
        double s = 0;
        long p =1;
        for(int i = 1; i<=n; i++){
            p *= i;
            s += 1.0/p;
        }
    }
}
