public class LastValidWordLength {
    public static int findLastValidWordLength(String input) {
        // 首先将字符串按空格分割成单词数组
        String[] words = input.split(" ");

        // 从最后一个单词开始倒序查找有效单词
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];

            // 使用正则表达式检查单词是否只包含字母
            if (word.matches("^[a-zA-Z]+$")) {
                return word.length();
            }
        }

        // 如果没有找到有效单词，可以返回一个默认值或抛出异常，这里返回0
        return 0;
    }

    public static void main(String[] args) {
        String input = "hello world wor_d 3red"; // 用你的实际输入替换这里的字符串

        int length = findLastValidWordLength(input);

        System.out.println("最后一个有效单词的长度为：" + length);
    }
}
