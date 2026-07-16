class Reverse_a_no_7 {
    public static void main(String[] args) {
        int digit = 428725987;
        int temp = digit;
        while(digit!=0){
            temp = digit % 10;
            System.out.println(temp);
            digit /= 10;
        }
    }
}