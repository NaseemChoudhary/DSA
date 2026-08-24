class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[top++] = ch;
            } 
            else {
                if (top == 0) {
                    return false;
                }

                char open = stack[--top];

                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return top == 0;
    }
}
