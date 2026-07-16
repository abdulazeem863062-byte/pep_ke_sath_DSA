class DigitofaNumber_6 {
    public static void main(String[] args) {
         int n = 34547;
        int temp = n;
        int divisor = 1;

        // Highest power of 10 find karo
        while (temp >= 10) {
            temp = temp / 10;
            divisor = divisor * 10;
        }

        while(divisor>0){
            System.out.println(n/divisor);
            n %= divisor;
            divisor /= 10;
        }
    }

}