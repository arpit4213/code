package separate_practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class new1 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        if (n == 0) {
            return ans;
        }

        int i = 0;
        while (i < n) {
            int start = nums[i];
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            int end = nums[i];
            if (start != end) {
                ans.add(start + "->" + end);
            } else {
                ans.add(String.valueOf(start));
            }
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of array
        int n = scanner.nextInt();

        // Input array elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Calculate summary ranges
        List<String> result = summaryRanges(nums);

        // Print result
        for (String range : result) {
            System.out.print(range + " ");
        }

        scanner.close();
    }
}
