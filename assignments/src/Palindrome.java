import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=in.nextInt();
        boolean result=ispalindrome(n);
        System.out.println(result);
    }
    static boolean ispalindrome(int n){
        int num=n;
        int ans=0;
        while(n>0){
            int r=n%10;
            ans=ans*10+r;
            n=n/10;
        }
        return num==ans;
    }
}
