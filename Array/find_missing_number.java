public class find_missing_number {
    public static void main(String[] args) {
        int a[]={1,2,3,4,6};
        int n=6;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        int total=n*(n+1)/2;
        int missing=total-sum;
        System.out.println("Misiing element is:"+missing);
    }
}
