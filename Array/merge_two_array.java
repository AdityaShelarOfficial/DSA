public class merge_two_array {
    public static void main(String[] args) {
        int a[]={12,34,67,89};
        int b[]={14,87,9,45};
        int merge[]=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            merge[i]=a[i];    
        }

        for(int i=0;i<b.length;i++){
            merge[a.length+i]=b[i];
        }

        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+" ");
        }
    }
}
