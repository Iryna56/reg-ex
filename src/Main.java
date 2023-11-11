import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String str = "123456, city London, st. Baker, 1";
//        String regEx = "[0-9]{6}, city [A-Za-z -]+, st[.] [A-Za-z -]+, [0-9]+";

        String str = "123 456 765";
        String regEx = "[0-9]+";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);

//        System.out.println(matcher.matches()); // проверка на совпадение регекса и строки, булеан, валидация, полное совпадение
        System.out.println(matcher.find());// поиск по строке
        System.out.println(matcher.group());

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
