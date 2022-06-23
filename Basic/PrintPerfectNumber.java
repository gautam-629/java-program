import java.util.Scanner;

public class PrintPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of limit");
        int limit = sc.nextInt();

        System.out.println("The list of perfect Number are");
        for (int n = 1; n <= limit; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    sum += i;
            }
            if(n==sum)
            System.out.println(n);
        }
    }
}