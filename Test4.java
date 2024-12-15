package laba5;

public class Test4 {

private char symbol;
private int code;

// Создаем два приватных поля символьное и целочисленное

    public Test4(int code, char symbol) {
        this.code = code;
        this.symbol = symbol;
    }
// Создаем конструктор с двумя аргументами

    public Test4(double value) {
        int intValue = (int) value;
        this.code = (int) ((value - intValue) * 100);
        this.symbol = (char) intValue;
    }
// Создаем конструктор с переменной типа double

    public void displayValues() {
        System.out.println("Сивол: " + symbol);
        System.out.println("Код: " + code);
    }

// Выводим результат на консоль
    public static void main(String[] args) {
        Test4 obj1 = new Test4(65, 'A');
        obj1.displayValues();

        Test4 obj2 = new Test4(65.1267);
        obj2.displayValues();
    }
}

