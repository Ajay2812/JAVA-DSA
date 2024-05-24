import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int ans=max(a,b,c);
        System.out.println("maiximum= "+ans);
        int answ=min(a,b,c);
        System.out.println("minimum= "+answ);
    }
    static int max(int a,int b,int c){
        int maximum=Math.max(a,(Math.max(b,c)));
        return maximum;
    }

    static int min(int a,int b,int c) {
        int minimum = Math.min(a, (Math.min(b, c)));
        return minimum;
    }
}
