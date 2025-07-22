public class PracticeQ {
    public static void countVowels(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'i' || name.charAt(i) == 'e' || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(" the No Vowels are in this array is :" + count);
    }

    public static void main(String[] args) {
        String name = "HarshalMulay";
        countVowels(name);
    }

}
