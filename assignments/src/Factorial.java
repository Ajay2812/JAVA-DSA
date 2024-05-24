import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=in.nextInt();
        int ans=fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int result=1;
        for (int i=2;i<=n;i++){
            result *= i;
        }
        return result;
    }

}
