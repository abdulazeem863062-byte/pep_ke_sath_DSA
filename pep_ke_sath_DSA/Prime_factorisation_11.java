class Prime_factorisation_11 {
    public static void main(String[] args) {
        int n = 25;
        int mul = 1;
        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i + " ");
                n /=i;
            }
        }
    }
}