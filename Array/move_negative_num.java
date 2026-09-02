public class move_negative_num {
    public static void main(String[] args) {
        int a[]={10,23,-10,20,46,89,-20};
        int index=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>0){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                index++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
