import java.util.Scanner;

public class MainAnagram {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner scanner = new Scanner(System.in);
        String userEnterWord = scanner.nextLine();

        Anagram anagram = new Anagram(userEnterWord);
        System.out.println("Анаграмма получается = " + anagram.generateAnagram(userEnterWord));
    }
}
