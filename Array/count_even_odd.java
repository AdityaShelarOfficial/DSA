public class count_even_odd {
    public static void main(String[] args) {
        int a[]={22,55,76,29,99,11};
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("Even numbers are:"+even_count);
         System.out.println("odd numbers are:"+odd_count);
    }
}
