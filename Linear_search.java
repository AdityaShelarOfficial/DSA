public class Linear_search {
    public static void main(String[] args) {
        int a[]={1,3,5,6,7,4};
        int target=4;
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.println("the element found at the "+i+"Position");
            }
        }
    }
}
