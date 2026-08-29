public class find_common_el_two_array {
    public static void main(String[] args) {
        int a[]={12,34,67,44,90,78,35};
        int b[]={12,56,89,54,98,35};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}
