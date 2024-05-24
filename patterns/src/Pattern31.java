public class Pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        int original=n;
        n=2*n;
        for(int r=0;r<=n;r++){

            for(int c=0;c<=n;c++){
                int ans=original-Math.min(Math.min(r,c),Math.min(n-r,n-c));
                System.out.print(ans+" ");

            }
            System.out.println();
        }
    }
}
