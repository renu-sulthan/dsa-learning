import java.util.Scanner;


public class LinearSearchString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice to search \n 1.character\n 2.String");
        int value = sc.nextInt();
        sc.nextLine();
        switch (value){
            case 1 -> {
                System.out.println("Enter input string: ");
                String inputString = sc.nextLine().toLowerCase();
                System.out.println("Enter the Character to search in the input string");
                char findChar = sc.next().toLowerCase().charAt(0);
                searchChar(inputString, findChar);
            }

            case 2-> {
                System.out.println("Enter array size: ");
                int arraySize = sc.nextInt();
                sc.nextLine();
                String[] array = new String[arraySize];
                System.out.println("Enter array elements: ");

                for (int i = 0; i < arraySize; i++) {
                    array[i] = sc.nextLine();
                }
                System.out.println("Enter the  string element to find in the array");
                String findString = sc.nextLine();
                linearSearchString(array, findString);
            }
        }
    }

    private static void linearSearchString(String[] array, String findString) {
        for (int i = 0; i < array.length; i++) {
            if (findString.equalsIgnoreCase(array[i])){
                System.out.println("Given string found at the index: "+i);
                return;
            }
        }
        System.out.println("String not found");
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