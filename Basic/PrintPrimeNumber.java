import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the limit");
         int limit=sc.nextInt();
         System.out.println("The list of prime number are:");
           for(int n=1;n<=limit;n++){
            int count=0;
                for(int i=1;i<=n;i++){
                    if(n%i==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println(n);
                }
           }
    }
}
