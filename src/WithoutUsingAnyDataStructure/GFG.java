package WithoutUsingAnyDataStructure;

import  java.util.*;
public class GFG {
    boolean uniqueCharacters(String str){
        //Assuming string can have character a-z this has 32 bits set to 0
        int checker = 0;

        for(int i=0;i<str.length();i++){
            int bitAtIndex = str.charAt(i) - 'a';
            //If that bit is already set in checker return false
            if((checker & (1 << bitAtIndex)) > 0)
                return false;
            //Otherwise, update and continue by setting that bit in the checker
            checker = checker | (1 << bitAtIndex);
        }
        //No duplicates encountered
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
