package CipherSchool;

import java.io.*;
import java.util.*;

public class BalancedBracketCheck {

    public static void main(String[] args) throws Exception {


        new BalancedBracketCheck().getResult();
        //new Solution().getResult();
        //new Main().getResult();
        //new Codechef().getResult();
    }

    public void getResult() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Local  Sublime Compilar Start

        File ipFile = new File("input.txt");
        br = new BufferedReader
                (new FileReader(ipFile));
        PrintStream opFile = new PrintStream(new File("output.txt"));
        PrintStream console = System.out;
        // System.setOut(console); 
        System.setOut(opFile);

        //Local Sublime Compilar End

        int t = Integer.parseInt(br.readLine().trim());


        while (t > 0) {
            t--;
            boolean res = true;
            char[] ip = br.readLine().trim().toCharArray();
            Stack<Character> stack = new Stack<>();
            for (int i=0;i<ip.length && res;i++) {
                char c=ip[i];
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        res = false;
                        break;
                    }
                    char ob = stack.pop();
                    if (ob == '(' && c == ')') {
                        continue;
                    }
                    if (ob == '{' && c == '}') {
                        continue;
                    }
                    if (ob == '[' && c == ']') {
                        continue;
                    }
                    res=false;
                }

            }
            if(!stack.isEmpty()){
                res=false;
            }
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }


}