import java.io.*;
public class targetcode {
    public static void main(String args[]) throws IOException
    {
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter the equation");
        String stmt = in .readLine();
        StringBuffer ans = new StringBuffer("");
        int reg = 0;
        int count = 0;
        char c2 = 'a';
        int flag = 0;
        for (int i = 0; i < stmt.length(); i++) {
            char c = stmt.charAt(i);
            if (i > 0) {
                c2 = stmt.charAt(i - 1);
            }
            switch (c) {
                case '(':
                    count++;
                    break;
                case ')':
                    count--;
                    break;
                case '+':
                    if (count > 0) {
                        System.out.println("MOV " + stmt.charAt(i - 1) + ",R" + reg);
                        System.out.println("ADD " + stmt.charAt(i + 1) + ",R" + reg);
                        ans.append("R" + reg);
                        reg++;
                    } else {
                        ans.append("+");
                    }
                    break;
                case '-':
                    if (count > 0) {
                        System.out.println("MOV " + stmt.charAt(i - 1) + ",R" + reg);
                        System.out.println("SUB " + stmt.charAt(i + 1) + ",R" + reg);
                        ans.append("R" + reg);
                        reg++;
                    } else {
                        ans.append("-");
                    }
                    break;
                case '*':
                    if (count > 0) {
                        System.out.println("MOV " + stmt.charAt(i - 1) + ",R" + reg);
                        System.out.println("MUL " + stmt.charAt(i + 1) + ",R" + reg);
                        ans.append("R" + reg);
                        reg++;
                    } else {
                        ans.append("*");
                    }
                    break;
                case '/':
                    if (count > 0) {
                        System.out.println("MOV " + stmt.charAt(i - 1) + ",R" + reg);
                        System.out.println("DIV " + stmt.charAt(i + 1) + ",R" + reg);
                        ans.append("R" + reg);
                        reg++;
                    } else {
                        ans.append("/");
                    }
                    break;
                default:
                    break;
            }
            flag++;
        }
        String ans1 = new String(ans);
        for (int i = 0; i < ans1.length(); i++) {
            char c = ans1.charAt(i);
            switch (c) {
                case '+':
                    System.out.println("ADD " + ans1.charAt(i - 2) + ans1.charAt(i - 1) + "," + ans1.charAt(i + 1) + ans1.charAt(i + 2));
                    break;
                case '-':
                    System.out.println("SUB " + ans1.charAt(i - 2) + ans1.charAt(i - 1) + "," + ans1.charAt(i + 1) + ans1.charAt(i + 2));
                    break;
                case '*':
                    System.out.println("MUL " + ans1.charAt(i - 2) + ans1.charAt(i - 1) + "," + ans1.charAt(i + 1) + ans1.charAt(i + 2));
                    break;
                case '/':
                    System.out.println("DIV " + ans1.charAt(i - 2) + ans1.charAt(i - 1) + "," + ans1.charAt(i + 1) + ans1.charAt(i + 2));

                    break;
                default:
   break;}}}}

