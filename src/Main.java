import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int findSymbolOccurance(String str, char symbol){
        int result = 0;
        var chars = str.toCharArray();
        for (int i = 0; i <= chars.length - 1; i++){
            if (symbol == chars[i]){
                result++;
            }
        }
        return result;
    }

    public static int findWordPosition(String sourse, String target){
        return sourse.indexOf(target);
    }

    public static String stringReverse(String sourse){
        return new StringBuilder(sourse).reverse().toString();
    }

    public static boolean isPalindrome(String sourse){
        return (sourse.equals(new StringBuilder(sourse).reverse().toString()));
    }

    public static void quiz(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String hiddenWord = words[new Random().nextInt(words.length)];
        boolean win = false;

        //Main loop
        while (!win){
            System.out.println("Enter you answer");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            char[] hint = new char[15];

            //Check win
            if (hiddenWord.equals(answer)) {
                System.out.println("You win!!!");
                win = true;
            } else {
                System.out.println("Try again, here are the letters that matched:");
            }

            //Search match chars
            for (int i = 0; i <= 14; i++) {
                if ((i <= hiddenWord.length() - 1) && (i <= answer.length() - 1)) {
                    if (hiddenWord.charAt(i) == answer.charAt(i)) {
                        hint[i] = hiddenWord.charAt(i);
                    } else {
                        hint[i] = '#';
                    }
                } else {
                    hint[i] = '#';
                }

            }
            //Print hint with matched chars
            System.out.println(hint);
        }
    }

    public static void main(String[] args) {
        quiz();
        /**
         System.out.println(findSymbolOccurance("Hellllow", 'l'));
         System.out.println(findWordPosition("Hellow", "w"));
         System.out.println(stringReverse("Hellow"));
         System.out.println(isPalindrome("civic"));
         **/
    }

}