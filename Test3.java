package laba5;

public class Test3 {
    private int x;
    private int y;

// ������� ��� ���� � ���������� �������������� ����������

    public Test3() {

    }
// ������� �����������, ������� ������� ������� ��� �������� ����������

    public Test3(int x) {
        this.x = x;
    }

// ������� �����������, ������� ������� ������� � ��������� ������ �� ����������
    public Test3(int x, int y) {
        this.x = x;
        this.y = y;
    }
// ������� �����������, ������� ������� ������� � ��������� ���� ����������

    public void printXy() {
        System.out.println("���: " + x);
        System.out.println("�����: " + y);
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.printXy();
    }
// ������� �� �������
}
