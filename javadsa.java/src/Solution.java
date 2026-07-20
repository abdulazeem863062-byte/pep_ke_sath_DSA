public class Solution {





    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] ans = new int[26];
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i) - 'a']++;
            ans[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++){
            if(ans[i]!=0){
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
        Solution obj = new Solution();
    boolean ans = obj.isAnagram(s,t);
        System.out.println(ans);
//        int[] nums = {9,6,4,2,3,5,7,0,1};
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            boolean found = false;
//         for(int j=0;j<n;j++){
//             if(nums[j]==i){
//                 found=true;
//                 break;
//             }
//         }
//         if(!found){
//             System.out.println(i);
//         }
//
//        }
//



//        int sum = 0;
//        for(int num : nums){
//            sum += num;
//        }
//        int sum2 = 0;
//        for(int i=1;i<=n; i++){
//            sum2 += i;
//        }
//        int ans = sum2 - sum;
//        System.out.println(ans);



//        int[] num = {1,3,5,6};
//        int target = 7;
//        int n = num.length;
//        for(int i=0;i<n;i++){
//            if(num[i]>=target){
//                System.out.println(i);
//                break;
//            }
//        }if(target>n){
//            System.out.println(n);
//        }



//        String[] s = {"h","e","l","l","o"};
//        int start = 0;
//        int end = s.length-1;
//        while(start<end){
//            String temp = s[start];
//            s[start] = s[end];
//            s[end] = temp;
//            start++;
//            end--;
//        }
//        for(String ch : s){
//            System.out.print(ch);
//        }


//        String[] s =  {"A man, a plan, a canbl: Panama"};
//        String str = s[0];
//        int start = 0;
//        int end = str.length()-1;
//        while(start<end){
//            while(start<end && !Character.isLetterOrDigit(str.charAt(start))){
//                start++;
//            }
//            while(start<end && !Character.isLetterOrDigit(str.charAt(end))){
//                end--;
//            }
//            if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))){
//                System.out.println(false);
//            }
//            start++;
//            end--;
//        }
//        System.out.println(true);





    }
}
