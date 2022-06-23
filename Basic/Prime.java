import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Posite integer Number");
        int n=Sc.nextInt();
        int flag=0;
        // 0 and are not prime number
        if(n==0||n==1)
        flag=1;

        for(int i=2;i<n/2;i++){
            if(n%i==0)
            flag=1;
            break;
        }
        if(flag==0)
            System.out.println(n+" is a prime number");
        
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}
