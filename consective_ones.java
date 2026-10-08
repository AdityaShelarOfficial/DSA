public class consective_ones {
    public static void main(String[] args) {
        int a[]={0,1,3,5,1,3,1,1,1,1};
        int count=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(max);
    }
}
