class Gcd_and_lcm_10 {
    public static void main(String[] args) {
        int gcd = 12;
        int lcm = 18;
        int gcdcopy = gcd;
        int lcmcopy = lcm;
        while(lcm!=0){
            int temp = gcd%lcm;
            gcd=lcm;
            lcm=temp;
        }System.out.println("GCD is: = " + gcd);
        int anslcm = (gcdcopy*lcmcopy)/gcd;
        System.out.println("LCM is: = " + anslcm);
    }
}