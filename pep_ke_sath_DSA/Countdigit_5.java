class Countdigit_5 {
    public static void main(String[] args) {
        int digit = 326553543;
        int count = 0; 
        while(digit!=0){
            digit /= 10;
            count++;
        }
        System.out.println(count);
    }
}