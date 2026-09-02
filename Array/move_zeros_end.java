public class move_zeros_end {
    public static void main(String[] args) {
        int a[]={12,0,34,56,89,57,0,};
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[index]=a[i];
                index++;
            }
        }
        while(index<a.length){
                a[index]=0;
                index++;
            }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
