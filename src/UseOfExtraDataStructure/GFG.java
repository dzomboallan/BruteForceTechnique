package UseOfExtraDataStructure;

import java.util.*;

public class GFG {
    int MAX_CHAR = 256;
    boolean uniqueCharacters(String str){
        //If length is greater than 256 some characters must have been repeated
        if(str.length() > MAX_CHAR)
            return false;

        boolean [] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);

        for(int i=0; i < str.length();i++) {
            int index = (int)str.charAt(i);
            //If value is true string has a duplicate,return false
            if (chars[index] == true)
                return false;
            chars[index] = true;
        }
        //No duplicate encountered
        return true;
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
