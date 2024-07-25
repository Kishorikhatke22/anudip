import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        
        String output = input.trim().replaceAll("\\s+", "#");

    
        System.out.println("Modified sentence: " + output);
    }
}
