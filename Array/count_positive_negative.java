public class count_positive_negative {
    public static void main(String[] args) {
        int a[]={11,23,44,67,11,-89,-45,20,0};
        int pos_count=0;
        int neg_count=0;
        int zero_count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                neg_count++;
            }
            else if(a[i]>0){
                pos_count++;
            }
            else{
                zero_count++;
            }
        }
        System.out.println("Positive count"+pos_count);
        System.out.println("Negative count"+neg_count);
        System.out.println("Zero count"+zero_count);
    }
}
