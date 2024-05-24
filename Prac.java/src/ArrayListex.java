import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(10);
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
