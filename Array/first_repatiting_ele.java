public class first_repatiting_ele {
    public static void main(String[] args) {
        int a[]={12,34,6,78,6,89};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Repateting Element Found:"+a[i]);
                }
            }
        }
        System.out.println("No repatating element :");
    }
}
