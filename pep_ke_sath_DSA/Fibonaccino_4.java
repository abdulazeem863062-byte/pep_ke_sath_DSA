
class Fibonaccino_4 {

    public static void main(String[] args) {
        int n = 10;
        int one = 0;
        int two = 1;
        if (n == 1) {
            System.out.println(one);
        } else if (n == 2) {
            System.out.println(one + " " + two);
        }
        System.out.print(one + " " + two + " ");
        for (int i = 3; i <= n; i++) {
            int next = one + two;
            System.out.print(next + " ");
            one = two;
            two = next;
        }
    }
}
