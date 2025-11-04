package DelaPena_Karlo;

public class lastWordLength {

    public static int lastWordLength(String s) {
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }

    public static void main(String[] args) {
        String s = "hello world";
        int i = lastWordLength(s);
        System.out.println(s);
        System.out.println(i);
    }
}
