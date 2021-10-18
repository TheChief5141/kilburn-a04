package baseline;

import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/exercise41_input.txt");
        Scanner input = new Scanner(file);
        String actual = input.nextLine();
        String expected = "Ling, Mai";
        assertEquals(actual, expected);
    }



}