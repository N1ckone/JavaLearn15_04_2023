package homeWork4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**1-5 задания */
public class RegexFormatter {
    public static void main(String[] args) {

        System.out.println(isConsistOfEnglishLettersAndNumbers("Hello_world1")); //true
        System.out.println(isConsistOfEnglishLettersAndNumbers("Hello_world!")); //false
        System.out.println(isConnectedBy_("love_forever")); //true
        System.out.println(isConnectedBy_("Love_forever")); //false
        System.out.println(isConnectedBy_("love_")); //false
        System.out.println(isConsistG("jfgjk")); //true
        System.out.println(isConsistG("grkte")); //false
        printHTMLTags("""
                <!DOCTYPE html>
                <html>
                  <head>
                    <title>Заголовок страницы</title>
                  </head>
                  <body>
                    <h1>Привет, мир!</h1>
                    <p>Это простой HTML код.</p>
                  </body>
                </html>
                <b>lfwp</b>
                """);
        System.out.println(isEmail("user123@gmail.com")); //true
        System.out.println(isEmail("ivan.ivanov@yandex.ru")); //true
        System.out.println(isEmail("123max")); //false
        System.out.println(isEmail("miwf@kf_lr.com")); //false
        System.out.println(isEmail("jack.green@it.comp")); //false


    }

    //1

    public static boolean isConsistOfEnglishLettersAndNumbers(String str) {
        return str.matches("\\w+");
    }

    //2
    public static boolean isConnectedBy_(String str) {
        return str.matches("[a-z0-9]+_[a-z0-9]+");
    }

    //3
    public static boolean isConsistG(String str) {

        return str.matches("\\b[a-fh-su-zA-FH-SU-Z]*g[a-fh-su-zA-FH-SU-Z]+\\b");
    }

    //4
    public static void printHTMLTags(String str) {
        Pattern pattern = Pattern.compile("<[^>]+>");

        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    public static boolean isEmail(String str) {
        return str.matches("[\\w-.]+@[A-Za-z\\d-]+\\.[A-Za-z]{2,3}");
    }
}
