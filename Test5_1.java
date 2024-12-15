package laba5;

public class Test5_1 {
    public static void main(String[] args) {
        Test5 test5_1 = new Test5();
        test5_1.setX();
        System.out.println("Проверка 1: "+ test5_1.getX());
        test5_1.setX(10);
        System.out.println("Проверка 2: "+ test5_1.getX());
        test5_1.setX(100000);
        System.out.println("Проверка 3: "+ test5_1.getX());
    }
}
// Проверяем работу методов