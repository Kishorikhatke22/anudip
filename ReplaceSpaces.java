import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String a = sc.nextLine();
        int l = a.length();
        String f = "";
        for(int i=0;i<1;i++)
        {
            char c = a.charAt(i);
            if(c!=' ')
            f = f+c;
        }


    
        System.out.println("sentence with all white space removes:" +f);
    }
}
