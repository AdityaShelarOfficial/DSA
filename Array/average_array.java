public class average_array {
    public static void main(String[] args) {
        int a[]={18,19,20,21,22};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("The Average is: "+sum/a.length);
    }
}
