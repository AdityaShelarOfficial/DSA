public class Left_Rotate_Array {
    public static void main(String[] args) {
        int a[]={2,4,57,78,90};
        int first=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=first;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}