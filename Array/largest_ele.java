public class largest_ele {
    public static void main(String[] args) {
        int a[]={22,34,78,10,5,90};
        int largest=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
                largest=a[i];
        }
        System.out.println("Largest no is:"+largest);
    }
}
