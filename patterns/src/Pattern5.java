public class Pattern5 {

    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern(int n){
        for(int i=0;i<2*n;i++){
            int col;
            if (i > n) {
                col = 2 * n - i;
            } else col = i;
            for(int j=0;j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern28(int n){
        for(int i=0;i<2*n;i++){
            int col;
            if (i > n) col = 2 * n - i;
            else col = i;
            int spaces=n-col;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=0;j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    static void pattern30(int n){
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i=1;i<=2*n;i++){
            int col=i>n ? 2*n-i : i;
            int spaces=n-col;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=col;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=col;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
