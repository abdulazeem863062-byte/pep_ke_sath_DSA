class  AllPrimeNo_3 {
    static void main() {
        int start = 2;
        int end = 30;
        for (int i = start; i <= end; i++) {
                int count = 0;
            for (int j = 2; j*j <= i; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
                
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}