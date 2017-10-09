package by.it.sc04_evening_tue_thu.sushchenja.lesson04;

/*
Lesson 04. Task A2. Стихотворение

В созданном вами методе main напишите следующий код:
Запишите свое любимое стихотворение в переменных a b c d и т.д. (типа String)
Выведите одну строку «Мое любимое стихотворение:».
Напишите еще одну строку вывода, но так, чтобы в результате выполнения программы
было выведено ваше любимое стихотворение.
В стихотворении должно быть не меньше, чем 4 строки.

Требования:
1.Программа должна выводить текст.
2.Перед стихом должна быть выведена строка "Мое любимое стихотворение:".
3.Выводимый текст должен состоять не меньше, чем из пяти строк (пустые строки - это тоже строки).
4.В выводимом тексте должно быть не менее, чем 50 символов.
5.Команд System.out.println в коде должно быть максимум две.

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/
class TaskA2 {
    public static void main(String[] args) {

        String a = "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
        String b = "\naaaaaaaaaaaaaaaaaaaaaaaaaa";
        String c = "\nbbbbbbbbbbbbbbbbbbbbf";
        String d = "\nffffcccccccccccccvvvfffffffffffffffffffff";
        String f = "\nfffffsdadsadsadsafgffffffffffffffghffffffffffffffffffff";
        String e = "Мое любимое стихотворение:";
        System.out.println(e);
        System.out.print(a+b+c+d+f);
    }
}
