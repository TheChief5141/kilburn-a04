package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Solution41 {
    /*Problem:
    Create a program that reads in the following list of names from a file
    called `exercise41_input.txt` and sorts the list alphabetically:
        Ling, Mai
        Johnson, Jim
        Zarnecki, Sabrina
        Jones, Chris
        Jones, Aaron
        Swift, Geoffrey
        Xiong, Fong

        Constraints:
        Don't hard-code the number of names.

        Pseudocode:
        Create a file path that opens exercise41_input.txt and store in a file  variable
        Create a scanner variable input that will read input from the files
        Create an ArrayList that can store the names of the file
        Run the getNames method, which takes in the ArrayList as a parameter
        Create a loop for while the file has not ended,
        store the names in the array
        Run the sortNames method, which takes in the ArrayList as a parameter
        Create a loop for the length of the ArrayList,
        sort the names in the arrayList
        Run the printNames method, which takes in the ArrayList as a parameter
        Create a loop for the length of the ArrayList,
        print the names in the arrayList
     */

    private static void printNames(ArrayList<String> nameList){
        System.out.println("There are " + (nameList.size()) + " people");
        System.out.print("==================\n");
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
            System.out.print("\n");
        }

    }
    private static void getNames(ArrayList<String> nameList, File file){
        try(Scanner input = new Scanner(file).useDelimiter("\\s*-\\s*")){
            while (input.hasNextLine()){
                nameList.add(input.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.print("No file found");
        }


    }
    private static void sortNames(ArrayList<String> nameList){
        Collections.sort(nameList);
    }

    public static void main(String[] args){
        File file = new File("data/exercise41_input.txt");
        ArrayList<String> nameList = new ArrayList<>();

        getNames(nameList, file);
        sortNames(nameList);
        printNames(nameList);

    }


}