package UsingSetFunction;

import java.util.*;

public class GFG {
    static boolean uniqueCharacters(String str){
        HashSet<Character> char_set = new HashSet<>();
        //Inserting character of string into set
        for(int c=0; c < str.length(); c++) {
            char_set.add(str.charAt(c));
        }
        //If length od set is equal to length of string then it will have unique characters
        if(char_set.size() == str.length())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        GFG obj = new GFG();
        String input;
        System.out.println("Enter string");
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();

        if(obj.uniqueCharacters(input))
            System.out.println("The string " + input + " has all unique characters.");
        else
            System.out.println("The string " + input + " has duplicate characters.");

    }
}
