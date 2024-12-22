import java.util.Scanner;


public class LinearSearchString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String inputString = sc.nextLine().toLowerCase();
        System.out.println("Enter the Character to search in the input string");
        char findChar = sc.next().toLowerCase().charAt(0);

        searchChar(inputString, findChar);

    }

    private static void searchChar(String inputString, char findChar) {
        for (int i = 0; i < inputString.length(); i++) {
            char charValue = inputString.charAt(i);
            if (findChar == charValue){
                System.out.println("Character found in the input string at index: "+ i);
                return;
            }
        }
        System.out.println("Given character do not present in the input string");
    }
}