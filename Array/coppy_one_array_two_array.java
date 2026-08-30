public class coppy_one_array_two_array {
    public static void main(String[] args) {
        int a[]={12,45,75,78,98};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("Coppied Array");
        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }
    }
}
