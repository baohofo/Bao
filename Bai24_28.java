
import java.util.Scanner;

public class Bai24_28 {
    static Scanner sc = new Scanner(System.in);

    // bai 24-28
    public static void main(String[] args) {
        int n = NhapN();
        lietkeuocsoduong(n);
        demsouocduong(n);

        if (Ktrasonguyento(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong la so nguyen to.");
        }
    }

    public static int NhapN() {
        int n = -1;
        do {
            try {
                System.out.print("Nhap n: ");
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Vui long nhap so nguyen duong!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so nguyen hop le!");
                sc.nextLine(); // Clear the invalid input
            }
        } while (n < 0);
        return n;
    }

    public static void lietkeuocsoduong(int n) {
        System.out.println("Cac uoc so duong cua " + n + " la: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void demsouocduong(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println("\nTong so uoc duong: " + count);
    }

    public static boolean Ktrasonguyento(int n) {
        if (n < 2) {
            return false; // Số nguyên nhỏ hơn 2 không phải là số nguyên dương
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu n chia hết cho một số nào đó, nó không phải là số nguyên dương
            }
        }
        return true; // Nếu không tìm được ước số nào khác 1 và n, thì n là số nguyên tố
    }

    public static int TimUocChungLonNhat(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int TimBoiChungNhoNhat(int a, int b) {
        return (a * b) / TimUocChungLonNhat(a, b);
    }

    public static boolean Ktrasohoanthien(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n; // Nếu tổng các ước số bằng chính nó, thì n là số hoàn thiện
    }

}
