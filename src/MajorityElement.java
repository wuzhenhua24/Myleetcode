import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int length = nums.length;
        int ans = 0;
        for(int num: nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
            if(hashMap.get(num) > (length/2)) {
                ans = num;
            }
        }
        return ans;

    }

    public static int majorityElement1(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int length = nums.length;
        int ans = 0;
        for(int num: nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > length/2) {
                ans = key;
            }
        }
        return ans;

    }

    public static void main(String[] args){
        int[] nums = {6, 5, 5};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement1(nums));

    }


}
