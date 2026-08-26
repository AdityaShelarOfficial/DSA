public class reverce_array_two_pinter {
    public static void main(String[] args) {
        int a[]={12,45,4,98,55,10};
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("Reverced Array Is:");
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
