package laba5;

public class Test5_1 {
    public static void main(String[] args) {
        Test5 test5_1 = new Test5();
        test5_1.setX();
        System.out.println("�������� 1: "+ test5_1.getX());
        test5_1.setX(10);
        System.out.println("�������� 2: "+ test5_1.getX());
        test5_1.setX(100000);
        System.out.println("�������� 3: "+ test5_1.getX());
    }
}
// ��������� ������ �������