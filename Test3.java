package laba5;

public class Test3 {
    private int x;
    private int y;

// Создаем два поля с приватными целочисленными значениями

    public Test3() {

    }
// Создаем конструктор, который создает объекты без передачи аргументов

    public Test3(int x) {
        this.x = x;
    }

// Создаем конструктор, который создает объекты с передачей одного из аргументов
    public Test3(int x, int y) {
        this.x = x;
        this.y = y;
    }
// Создаем конструктор, который создает объекты с передачей двух аргументов

    public void printXy() {
        System.out.println("Икс: " + x);
        System.out.println("Игрек: " + y);
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.printXy();
    }
// Выводим на консоль
}
