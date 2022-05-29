import java.util.Arrays;
/**
 * Класс анаграммы из введенного юзером слова, генерируемой с помощью метода, где
 * @params userWord - веденное Пользователем слово
 * @params char [] userWordArray - введенное Пользователем слово, преобразованное в массив
 * @params temporary - временное хранилище символа слова
 */
public class Anagram {
    String userWord;

    Anagram(String userWord) {
        this.userWord = userWord;
    }

    String generateAnagram(String userWord) {
        char[] userWordArray = userWord.toCharArray();
        char temporary;
        temporary = userWordArray[0];
        userWordArray[0] = userWordArray[userWordArray.length - 1];
        userWordArray[userWordArray.length - 1] = temporary;
        userWord = String.valueOf(userWordArray);
        return userWord;
    }
}
