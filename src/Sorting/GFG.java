package Sorting;

import java.util.*;

public class GFG {
    //Convert the string into character array for sorting
    boolean uniqueCharacters(String str){
        char [] chArray = str.toCharArray();
        //Using sorting, Arrays.sort() uses binary sort in the background for
        //non-primitives which is of O(nlogn) time complexity
        Arrays.sort(chArray);
        for(int i=0; i<chArray.length - 1;i++){
            //If the adjacent elements are not equal move to the next element
            if(chArray[i] != chArray[i + 1])
                continue;
            //If at any time 2 adjacent elements become equal, return false
            else
                return false;
        }
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
