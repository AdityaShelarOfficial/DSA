public class smallest_no {
    public static void main(String[] args) {
        int a[]={6,3,68,54,23};
        int smallest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println(smallest);
    }
}
