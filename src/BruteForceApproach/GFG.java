package BruteForceApproach;
/*A program to determine if a string has all unique characters using brute force*/
import java.util.*;
public class GFG {
    boolean uniqueCharacter(String str){
        //If at any point we encounter 2 same characters return false
        for(int i=0; i< str.length();i++){
            for(int j=i+1; j<str.length();j++)
                if(str.charAt(i) == str.charAt(j))
                    return false;
        }
        //If no duplicate characters encountered return true
        return true;
    }

    public static void main(String[] args) {
        GFG obj = new GFG();
        String input ;
        System.out.println("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();

        if(obj.uniqueCharacter(input))
            System.out.println("The string " + input + " has all unique characters.");
        else
            System.out.println("The string " + input + " has duplicate characters.");
    }
}
