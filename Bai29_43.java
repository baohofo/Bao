import java.util.Scanner;

public class Bai29_43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n========= MENU BAI TAP (29 - 43) =========");
            System.out.println("29-31: Tong so nguyen | 32-33: Tich (Giai thua)");
            System.out.println("34-36: Tong luy thua  | 37-41: Tong phan so");
            System.out.println("42: Luy thua x^y      | 43: Tong cua tong");
            System.out.println("0: Thoat chuong trinh");
            System.out.print("Chon so thu tu bai tap: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
                if (chon == 0) {
                    break;
                }

                System.out.print("Nhap n: ");
                int n = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 29:
                        tinhBai29(n);
                        break;
                    case 30:
                        tinhBai30(n);
                        break;
                    case 31:
                        tinhBai31(n);
                        break;
                    case 32:
                        tinhBai32(n);
                        break;
                    case 33:
                        tinhBai33(n);
                        break;
                    case 34:
                        tinhBai34(n);
                        break;
                    case 35:
                        tinhBai35(n);
                        break;
                    case 36:
                        tinhBai36(n);
                        break;
                    case 37:
                        tinhBai37(n);
                        break;
                    case 38:
                        tinhBai38(n);
                        break;
                    case 39:
                        tinhBai39(n);
                        break;
                    case 40:
                        tinhBai40(n);
                        break;
                    case 41:
                        tinhBai41(n);
                        break;
                    case 42:
                        System.out.print("Nhap co so x: ");
                        double x = Double.parseDouble(sc.nextLine());
                        tinhBai42(x, n);
                        break;
                    case 43:
                        tinhBai43(n);
                        break;
                    default:
                        System.out.println("Loi: So thu tu bai tap khong hop le!");
                }
            } catch (Exception e) {
                System.out.println("Loi: Vui long nhap so nguyen hop le!");
                chon = -1;
            }
        } while (chon != 0);

        System.out.println("Chuong trinh ket thuc.");
    }

    // --- NHOM TONG SO NGUYEN ---
    public static void tinhBai29(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++)
            s += i;
        System.out.println("S = 1 + 2 + ... + " + n + " = " + s);
    }

    public static void tinhBai30(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++)
            s += (2 * i + 1);
        System.out.println("S = 1 + 3 + ... + (2*" + n + "+1) = " + s);
    }

    public static void tinhBai31(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                s -= i;
            else
                s += i;
        }
        System.out.println("S = 1 - 2 + 3 - ... + (-1)^(" + (n + 1) + ")*" + n + " = " + s);
    }

    // --- NHOM TICH (GIAI THUA) ---
    public static void tinhBai32(int n) {
        long p = 1;
        for (int i = 1; i <= n; i++)
            p *= i;
        System.out.println("P = " + n + "! = " + p);
    }

    public static void tinhBai33(int n) {
        long p = 1;
        for (int i = 0; i <= n; i++)
            p *= (2 * i + 1);
        System.out.println("P = 1 * 3 * ... * (2*" + n + "+1) = " + p);
    }

    // --- NHOM LUY THUA & TONG PHUC TAP ---
    public static void tinhBai34(int n) {
        long s = 0;
        for (int i = 1; i <= n; i++)
            s += (long) i * i;
        System.out.println("S = 1^2 + 2^2 + ... + " + n + "^2 = " + s);
    }

    public static void tinhBai35(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++)
            s += Math.pow(i, i);
        System.out.printf("S = 1^1 + 2^2 + ... + %d^%d = %.0f\n", n, n, s);
    }

    public static void tinhBai36(int n) {
        long s = 0, p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
            s += p;
        }
        System.out.println("S = 1! + 2! + ... + " + n + "! = " + s);
    }

    // --- NHOM TONG PHAN SO (Dung kieu double) ---
    public static void tinhBai37(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++)
            s += 1.0 / i;
        System.out.printf("S = 1 + 1/2 + ... + 1/%d = %.4f\n", n, s);
    }

    public static void tinhBai38(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++)
            s += (double) i / (i + 1);
        System.out.printf("S = 1/2 + 2/3 + ... + %d/(%d+1) = %.4f\n", n, n, s);
    }

    public static void tinhBai39(int n) {
        double s = 0;
        long p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
            s += 1.0 / p;
        }
        System.out.printf("S = 1/1! + 1/2! + ... + 1/%d! = %.4f\n", n, s);
    }

    public static void tinhBai40(int n) {
        double s = 0;
        int t = 0;
        long p = 1;
        for (int i = 1; i <= n; i++) {
            t += i;
            p *= i;
            s += (double) t / p;
        }
        System.out.printf("S = (1+..+%d)/%d! = %.4f\n", n, n, s);
    }

    public static void tinhBai41(int n) {
        double s = 0;
        int m = 0;
        for (int i = 1; i <= n; i++) {
            m += i;
            s += 1.0 / m;
        }
        System.out.printf("S = 1/1 + 1/(1+2) + ... + 1/(1+..+%d) = %.4f\n", n, s);
    }

    public static void tinhBai42(double x, int n) {
        System.out.println("P = " + x + "^" + n + " = " + Math.pow(x, n));
    }

    public static void tinhBai43(int n) {
        long s = 0, t = 0;
        for (int i = 1; i <= n; i++) {
            t += i;
            s += t;
        }
        System.out.println("S = 1 + (1+2) + ... + (1+..+" + n + ") = " + s);
    }
}