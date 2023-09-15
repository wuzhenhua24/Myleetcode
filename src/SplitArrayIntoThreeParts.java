public class SplitArrayIntoThreeParts {

    public static boolean canSplitIntoThreeParts(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // 如果总和不能被3整除，或者数组为空，无法分成等值的三个部分
        if (totalSum % 3 != 0 || nums.length == 0) {
            return false;
        }

        int targetSum = totalSum / 3; // 每个部分的目标和
        int sum = 0; // 用于跟踪当前部分的和
        int partCount = 0; // 用于计数已经找到的部分

        for (int num : nums) {
            sum += num;

            // 如果当前部分的和等于目标和，表示找到一个部分
            if (sum == targetSum) {
                sum = 0; // 重置当前部分的和
                partCount++; // 增加部分计数
            }
        }

        // 如果能够找到3个以上部分，返回true
        return partCount >= 3;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 1, -1, 1, -1, 1, -1}; // 用你的实际数组替换这里的数组

        boolean canSplit = canSplitIntoThreeParts(nums);

        if (canSplit) {
            System.out.println("可以将数组分成等值的三个部分。");
        } else {
            System.out.println("无法将数组分成等值的三个部分。");
        }
    }
}

