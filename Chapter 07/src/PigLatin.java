import java.util.*;
public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word in lowercase: ");
        String inputWord = input.nextLine();

        String pigLatinWord = translate(inputWord);
        System.out.println("Word in Pig Latin: " + pigLatinWord);
    }

    public static String translate(String word){
        if(word.length() == 0){
            return "";
        }
        char firstCh = word.charAt(0);
        if(isVowel(firstCh)){
            return word + "ay";
        } else {
            return word.substring(1, word.length()) + word.charAt(0) + "ay";
        }
        
    }

    public static boolean isVowel(char firstCh) {
        if(firstCh == 'a' || firstCh == 'e' || firstCh == 'i' || firstCh == 'o' || firstCh == 'u'){
            return true;
        }
        return false;
        // "aeiou".indexOf(c) != -1;
    }
}
