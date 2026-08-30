public class check_array_equals {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 4, 6 };
        boolean c = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                c = false;
                break;
            }
        }
        if (c == true) {
            System.out.println("two array are equals");
        } else {
            System.out.println("The two array not equals");
        }
    }
}
