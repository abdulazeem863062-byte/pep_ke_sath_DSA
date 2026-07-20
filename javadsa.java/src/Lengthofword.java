public class Lengthofword {
    public static void main(String[] args){
//        String s = "Hello Word   ";
//        int count = 0;
//        int i = s.length()-1;
//        while(i>=0 && s.charAt(i) == ' '){
//            i--;
//        }
//        while(i>=0 && s.charAt(i) != ' '){
//            count++;
//            i--;
//        }
//        System.out.println(count);

        String[] str = {"flower","flow","flight"};
        String reference = str[0];
        int len = reference.length();
        int j=0;
        String ans = "";
        while(j<len){
            if(reference.charAt(j) == str[1].charAt(j) && reference.charAt(j) == str[2].charAt(j) ){
                ans += reference.charAt(j);
                System.out.print(ans);
            }
            j++;
        }
    }
}
