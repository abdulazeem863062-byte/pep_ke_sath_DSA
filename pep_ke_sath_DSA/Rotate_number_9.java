
class Rotate_number_9 {

    public static void main(String[] args) {
        int n = 1234567;
        int target = 2;
        int count = 0;
        int temp = n;
        int temp2 = n;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (target > count) {
            target %= count;  //agr count se bda target ho to jese target 11 count 5 to 11%5=1 to target 1
        } else if (target < 0) {
            target += count; //agr target - me ya negative ho to target + count 
        }
        int power = (int) Math.pow(10, target);
        temp2 /= power; //kitti value same rahengi    jese target 2 h to do value hta do 12345 bacha
        n %= power;  //kitti value ko aaghe le jana h   jese target 2 h to last ki do value lelo 67 huin
        int power1 = (int) Math.pow(10, count - target);
        int ans = (n * power1) + temp2;
        System.out.println(ans);
    }
}
