class Inverse_a_no_8 {
    public static void main(String[] args) {
        int n = 21453;
        int position = 1;
        int inverse = 0;
        while(n>0){
            int digit = n%10;
            inverse += position * (int)Math.pow(10, digit-1);
            n /= 10;
            position++;
        }
        System.out.println(inverse);
    }
}