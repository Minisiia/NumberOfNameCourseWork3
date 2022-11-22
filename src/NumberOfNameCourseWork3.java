import java.util.Scanner;

public class NumberOfNameCourseWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я латинськими літерами:");
        String name = scanner.next();
        char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("Результат першим варіантом із використанням масивів: ");
        sumCharVer1 (name, alphabet);
        System.out.print("\nРезультат другим варіантом із використанням String i .charAt(index); ");
        sumCharVer2 (name, alphabetString);
    }

    static void sumCharVer1 (String stringName, char [] alphabetArray) {
        System.out.print(stringName + " = ");
        stringName = stringName.toUpperCase();
        char [] array = stringName.toCharArray();
        int [] arrayNumbers = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < alphabetArray.length; j++) {
                if (array[i] == alphabetArray [j]) {
                    arrayNumbers[i] = j + 1;
                    System.out.print(array[i] + "(" + arrayNumbers[i] + ")");
                    if (i < array.length - 1) System.out.print(" + ");
                    break;
                }
            }
            sum += arrayNumbers[i];
        }
        System.out.print(" = " + sum);
    }
    static void sumCharVer2 (String stringName, String alphabetString) {
        System.out.print(stringName + " = ");
        stringName = stringName.toUpperCase();
        int sum = 0;
        for (int i = 0; i < stringName.length(); i++) {
            for (int j = 0; j < alphabetString.length(); j++) {
                if (stringName.charAt(i) == alphabetString.charAt(j)) {
                    sum += j + 1;
                    System.out.print(stringName.charAt(i) + "(" + (j + 1) + ")");
                    if (i < stringName.length() - 1) System.out.print(" + ");
                    break;
                }
            }
        }
        System.out.print(" = " + sum);
    }
}
