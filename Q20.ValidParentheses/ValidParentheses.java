public class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1 || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<> ();
        char[] charString = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (charString[i] == '(' || charString[i] == '{' || charString[i] == '[') {
                stack.push(charString[i]);
            } else if (charString[i] == ')' || charString[i] == '}' || charString[i] == ']') {
                try {
                    char temp = stack.peek();
                    if((charString[i] == ')' && temp == '(') || 
                            (charString[i] == '}' && temp == '{') || 
                            (charString[i] == ']' && temp == '['))
                        stack.pop();
                    else
                        return false;
                } catch (Exception e) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
