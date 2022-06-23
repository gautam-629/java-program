import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        int orginalNumber=n;
        for(int i=1;i<n;i++){
            if(n%i==0)
            sum+=i;
        }
        if(orginalNumber==sum)
        System.out.println(orginalNumber+ " is  perfect Number");
        else
        System.out.println(orginalNumber+ " is Not perfect Number");
    }
}
