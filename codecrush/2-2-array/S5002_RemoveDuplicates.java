import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S5002_RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (Objects.isNull(nums) || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }


        int tail = nums.length;


        for (int i = 0; i < tail; ++i) {

          while (i + 1 < tail && nums[i] == nums[i + 1]) {
            int cur = i;
            for (int j = i + 1; j < tail; ++j) {
              nums[cur++] = nums[j];
            }
            tail--;
          }

        }

        return tail;

    }


    public static void main(String[] args) {
      S5002_RemoveDuplicates solution = new S5002_RemoveDuplicates();

      int[] nums = new int[] {2,2,3,6,6,6,7};

      System.out.println(solution.removeDuplicates(nums));

      for (int n : nums) {
        System.out.print(n + ",");
      }

    }


}
