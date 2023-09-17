import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EqualFrequency {
    public static boolean equalFrequency(String word){
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char c: word.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) +1);
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            treeMap.put(entry.getValue(), treeMap.getOrDefault(entry.getValue(), 0) + 1);
        }
        if(treeMap.size() > 2) {
            return false;
        }
        if(treeMap.size() == 1){
            //所有字母各出现一次或者只有一种字母
            return treeMap.containsKey(1) || hashMap.size() == 1;
        }
        //要么有1种字母只出现一次，要么其他k次，有一种k+1
        return treeMap.containsKey(1) && treeMap.get(1) == 1
                || treeMap.lastEntry().getValue() == 1 && treeMap.lastKey() - treeMap.firstKey() == 1;

    }

    public static void main(String[] args) {
        String word = "zz";
        System.out.println(equalFrequency(word));
        String word1 = "abc" ;
        System.out.println(equalFrequency(word1));
        String word2 = "abad";
        System.out.println(equalFrequency(word2));
        String word3 = "abbccc";
        System.out.println(equalFrequency(word3));
        String word4 = "aabbc";
        System.out.println(equalFrequency(word4));

    }
}
