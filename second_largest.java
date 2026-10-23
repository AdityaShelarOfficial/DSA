import java.util.HashMap;

public class second_largest {
    public static void main(String[] args) {
        int a[]={22,45,87,92,36,67};
        int largest=0;
        int slargest=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]> slargest && a[i] != largest){
                slargest=a[i];
            }
        }
        System.out.println("Second largest element is :"+slargest);
    }
}
