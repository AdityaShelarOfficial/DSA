public class seprate_even_odd {
    public static void main(String[] args) {
        int a[]={12,45,67,88,98,12};
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                index++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}