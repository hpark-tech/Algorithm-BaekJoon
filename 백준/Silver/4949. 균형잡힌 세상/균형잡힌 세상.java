import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n;

        while (true) {
            n = scan.nextLine();
            if (n.equals(".")) {
                break;
            } else
                System.out.println(result(n));
        }
    }

    private static String result(String n) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n.length(); i++) {
            char k = n.charAt(i);
            if (k == '(' || k == '[')
                stack.push(k);

            else if (k == ')') {
                if (stack.isEmpty() || stack.peek() != '(')
                    return "no";
                else
                    stack.pop();
            } else if (k == ']') {
                if (stack.isEmpty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }
        }

        if (stack.isEmpty())
            return "yes";
        else
            return "no";
    }
}