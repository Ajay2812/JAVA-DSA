import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][2];

        for (int rows=0;rows<arr.length;rows++){
            for(int col=0;col<arr[rows].length;col++){
                arr[rows][col]=sc.nextInt();
            }
        }
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
       

    }
}


