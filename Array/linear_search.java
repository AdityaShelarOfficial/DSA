
public class linear_search {
    public static void main(String[] args) {
        int a[]={22,66,89,45,11,99};
        int target=11;
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.println("Element found at "+ i +"Index");
            }
        }
    }    
}
