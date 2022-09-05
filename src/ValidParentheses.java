import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                stack.push(c[i]);
            } else if (!stack.isEmpty() && ((c[i] == ')' && stack.peek() == '(')
                    || (c[i] == '}' && stack.peek() == '{')
                    || (c[i] == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{(([()]))}";
        System.out.println(isValid(s));
    }
}
