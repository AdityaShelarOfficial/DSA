import java.util.HashSet;
public class remove_duplicate {
    public static void main(String[] args) {
        int a[]={12,23,45,67,87,22,79,12,69,23};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(! hs.add(a[i])){
                System.out.println("Duplicate"+ a[i]);
            }
        }
    }
}
