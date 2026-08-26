public class second_largest_ele {
    public static void main(String[] args) {
        int a[]={12,34,56,87,45,87,12};

        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]>slargest && a[i]!=largest){
                slargest=a[i];
            }
        }
        System.out.println("Second largest element is"+slargest);
        System.out.println("Largest Element Is:"+largest);
    }
}
