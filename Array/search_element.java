public class search_element {
    public static void main(String[] args) {
        int a[]={12,44,56,75,98,23,22};
        int search=56;
        boolean found=false;
        for(int i=0;i<a.length;i++){
            if(a[i] == search){
                System.out.println("Element found at index"+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
}
