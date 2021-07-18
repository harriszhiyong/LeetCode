package interviewquestion._16_26;

import java.util.Stack;

public class _16_26 {
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        char[] cs = s.trim().toCharArray();
        Stack<Integer> st = new Stack();
        int ans = 0, i = 0;
        while(i < cs.length){
            if(cs[i] == ' ') {i++;continue;}
            char tmp = cs[i];
            if(tmp == '*' || tmp == '/' || tmp == '+' || tmp == '-'){
                i++;
                while(i < cs.length && cs[i] == ' ') i++;
            }
            int num = 0;
            while(i < cs.length && Character.isDigit(cs[i])){
                num = num * 10 + cs[i] - '0';
                i++;
            }
            switch(tmp){
                case '-':
                    num = -num;
                    break;
                    case '*':
                        num = st.pop() * num;
                        break;
                    case '/':
                        num = st.pop() / num;
                        break;
                    default:
                        break;
                }
                st.push(num);
            }
        while(!st.isEmpty()) ans += st.pop();
        return ans;
        }
}
