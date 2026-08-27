public class frequency_eachele {
    public static void main(String[] args) {
        int a[]={11,56,23,98,73,81,11};
        int count=1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    break;
                }
            }
            System.out.println("count is:"+a[i]+"Appers "+count+"Times");
        }
        
    }
}
