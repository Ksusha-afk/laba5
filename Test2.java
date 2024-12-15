package laba5;

public class Test2 {
    private char start;
    private char end;
// Создаем два приватных символьных поля
    public Test2(char start, char end) {
        this.start = start;
        this.end = end;
    }
// Присваиваем им значение
    public void printCharacterRange() {
        for (char ю = start; ю<= end; ю++) {
            System.out.print(ю + " ");
        }
        System.out.println();
    }
// Выводим результат от А до Я
    public static void main(String[] args) {
        Test2 cr = new Test2('а', 'я');
        cr.printCharacterRange();
    }
}

