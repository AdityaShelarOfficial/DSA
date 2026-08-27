public class count_duplicate {
    public static void main(String[] args) {
        int a[]={12,45,76,76,69,24,88,12,45};
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println("The total count is:"+count);
    }
}
