public class pattern_eleven {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<5;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
