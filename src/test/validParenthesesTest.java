import org.junit.Test;

import Gumayagay_Kenneth.validParentheses;

public class TestValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();

        String[] tests = {
                "()",
                "()[]{}",
                "(]",
                "([])",
                "([)]",
                "{[()]}",
                "(((",
                ""
        };

        System.out.println("Testing isValid() method:");
        for (String s : tests) {
            System.out.println("Input: \"" + s + "\" → Output: " + validator.isValid(s));
        }
    }
}

