import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=in.nextInt();
        if(checker(n)){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    static boolean checker(int n){
      return (n%2==0);
    }
}
