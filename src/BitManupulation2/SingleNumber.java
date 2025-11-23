package BitManupulation2;

public class SingleNumber {
   
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out duplicates
        }
        return result;
    }
    public static void main(String[] args) {
        
        System.out.println();
    }
}



