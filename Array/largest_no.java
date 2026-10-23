public class largest_no {
   public static void main(String[] args) {
    int a[]={22,44,66,77,43,1};
    int largest=a[0];
    for(int i=0;i<a.length;i++){
        if(a[i]>largest){
            largest=a[i];
        }
    }
    System.out.println(largest);
   } 
}
