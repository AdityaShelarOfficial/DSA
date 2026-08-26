public class smallest_ele{
    public static void main(String[] args) {
        int a[]={11,68,55,22,87,1,81};
        int smallest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest)
                smallest=a[i];
        }
        System.out.println("Smallest element is:"+smallest);
    }
}