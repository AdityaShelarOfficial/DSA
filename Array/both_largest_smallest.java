public class both_largest_smallest {
    public static void main(String[] args) {
        int a[]={11,45,80,33,57,32,9};
        int large=a[0];
        int small=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>large)
                large=a[i];

            if(a[i]<small)
                small=a[i];
        }
        System.out.println("The largest element is:"+large);
        System.out.println("The small element is:"+small);
    }
}
