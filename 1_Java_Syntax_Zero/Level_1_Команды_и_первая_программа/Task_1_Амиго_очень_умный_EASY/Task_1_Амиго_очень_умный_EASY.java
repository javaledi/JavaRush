package JavaSyntaxZero.Level_1_Команды_и_первая_программа;

/*
Напиши программу, которая выводит на экран надпись: "Амиго очень умный".

Требования:
• Программа должна выводить текст.
• Текст должен начинаться с "Амиго".
• Текст должен заканчиваться на "умный".
• Текст должен состоять из 17 символов включая пробелы
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1_Амиго_очень_умный_EASY {
    public static void main(String[] args) {
        // напишите тут ваш код
        System.out.println("Амиго очень умный");
        // ln (сокращенно от line) выводит следующий текст с новой строки
        // Без точки. Внимательно читать ТЗ, иначе 18 символов ctrl c ctrl v :)
        // Не забыть ; и " "
        // !"AmigoSoSmart"

        System.out.println();

        System.out.print("Амиго");
        System.out.print(" ");
        System.out.print("очень");
        System.out.print(" ");
        System.out.print("умный");

        /*
        Для студентов, которые прошли курс JavaRush примерно до 15 уровня:
            “Для вывода текста на консоль мы обращаемся к статическому полю out класса System,
                у которого вызываем метод println(),
                    и в качестве аргумента передаем объект класса String”.
         */

        System.out.println();

        // Вот так примерно будет выглядеть подобное задание через пару десятков уровней (43):
        // + знания регулярных выражений:
        String smthToParse = "Амиго первый ученик JavaRush. " +
                "Его учитель говорит, что нужно много трудиться и он станет очень умный.";
        smthToParse = smthToParse.replaceAll("\\p{P}", "");
        Matcher matcher = Pattern
                .compile("(^|[^-_0-9a-zA-Zа-яёА-ЯЁ])Амиго|очень|умный([^-_0-9a-zA-Zа-яёА-ЯЁ]|$)")
                .matcher(smthToParse);
        StringBuilder phraseToPrint = new StringBuilder("");
        while (matcher.find()) {
            phraseToPrint.append(matcher.group()).append(" ");
        }
        System.out.println(phraseToPrint.toString().trim());
    }
}
