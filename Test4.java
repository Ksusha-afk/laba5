package laba5;

public class Test4 {

private char symbol;
private int code;

// ������� ��� ��������� ���� ���������� � �������������

    public Test4(int code, char symbol) {
        this.code = code;
        this.symbol = symbol;
    }
// ������� ����������� � ����� �����������

    public Test4(double value) {
        int intValue = (int) value;
        this.code = (int) ((value - intValue) * 100);
        this.symbol = (char) intValue;
    }
// ������� ����������� � ���������� ���� double

    public void displayValues() {
        System.out.println("�����: " + symbol);
        System.out.println("���: " + code);
    }

// ������� ��������� �� �������
    public static void main(String[] args) {
        Test4 obj1 = new Test4(65, 'A');
        obj1.displayValues();

        Test4 obj2 = new Test4(65.1267);
        obj2.displayValues();
    }
}

