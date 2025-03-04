import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String str = "";
        
        for (int i=0; i<a.length(); i++) {
            char b = a.charAt(i);
            
            if (Character.isUpperCase(b)) {
                str += Character.toLowerCase(b);
            } else {
                str += Character.toUpperCase(b);
            }
        }
        
        System.out.println(str);
    }
}