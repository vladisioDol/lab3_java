package ad211.dolgih;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Method #1. Enter your string: ");
        end(console.nextLine());

        System.out.println("Method #2. Enter your string: ");
        sumNumbersInString(console.nextLine());

        System.out.println("Method #3. Enter your string: ");
        theLongestBlock(console.nextLine());

        System.out.println("Method #4. Enter your string:");
        foundWords(console.nextLine());

        System.out.println("Method #5.");
        twoStringInOne();
    }
    public static void end(String str) {
        boolean ed = str.endsWith("ed");
        System.out.println(ed);
    }
    public static void sumNumbersInString(String str) {
        int sum = 0;
        char[] chars = str.toCharArray();
        char zero = '0';
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                sum += chars[i] - zero;
            }
        }
        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("This string have no numbers");
        }
    }
    public static void theLongestBlock(String str) {
        char[] chars = str.toCharArray();
        String str1="";
        int position = 0;
        for (int i = 1; i < str.length(); i++) {
            if(chars[i-1]==chars[i]){
               str1+=chars[i];
                position=i;
            }
        }

        System.out.println(str1+chars[position]);
    }
    public static void foundWords(String str) {
        char[] chars = str.toCharArray();
        String str1="";
        for(int i=0;i<str.length();i++){
            str1+=chars[i];
            if(chars[i]==' '){
                System.out.println(str1);
                str1="";
           }
        }
        System.out.println(str1);
    }
    public static void twoStringInOne() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your string1:");
        String str1 = console.next();
        System.out.println("Enter your string2:");
        String str2 = console.next();
        String str3="";
        if(str1.length()<str2.length()){
            for(int i=0;i<str1.length();i++){
                str3+=str1.charAt(i);
                str3+=str2.charAt(i);
            }
            str3=str3+ str2.substring(str1.length());
        }else{
            for(int i=0;i<str2.length();i++){
                str3+=str1.charAt(i);
                str3+=str2.charAt(i);
            }
            str3=str3+ str1.substring(str2.length());
        }
        System.out.println(str3);
    }
}
