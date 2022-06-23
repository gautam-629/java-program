import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        int rem;
        int cube;
        int originalNumber=n;
        while(n!=0){
          rem=n%10;
          cube=rem*rem*rem;
          sum+=cube;
          n/=10;
        }
        if(originalNumber==sum)
        System.out.println(originalNumber + " is A Armstrong Number");
        else
        System.out.println(originalNumber + " is Not Armstrong Number");
    }
}
