public class J1920_BuildArrayfromPermutation {
    public static void main(String[] args) {

    }
    public int[] buildArray(int[] nums) {
        int numsNew[] = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            numsNew[i] = nums[nums[i]];
        }
        return numsNew;
    }
}
