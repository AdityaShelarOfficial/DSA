public class second_smallest {
    public static void main(String[] args) {
        int a[]={12,45,67,22,77,90,87};
        int smallest=Integer.MAX_VALUE;
        int ssmallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                ssmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]<ssmallest && a[i]!=smallest){
                ssmallest=a[i];
            }
        }
        System.out.println("Second Smallest NUmber is:"+ssmallest);
    }
}
