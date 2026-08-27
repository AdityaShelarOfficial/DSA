public class DuplicateElements {
    public static void main(String[] args) {
        int a[]={11,23,34,34,56,88,11,3};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    break;
                }   
            }
        }
    }
}