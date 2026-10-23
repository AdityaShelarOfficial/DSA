public class largest_ele {
    public static void main(String[] args) {
        int a[]={3,6,8,6,9,4};
        int largest=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
}
