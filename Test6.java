package laba5;

public class Test6 {

private int max;
private int min;

// ������� ��������� ������������� ����
public Test6(int a, int b) {
    setValues(a, b);
}

public void setValues(int a, int b) {
    if (a > b) {
        max = a;
        min = b;
    } else {
        max = b;
        min = a;
    }
}
// ������� ����� ��� ��������� ��������

public void setValues(int value) {
    if (value > max) {
        max = value;
    } else if (value < min || min == 0) { // min == 0 ��� ������, ����� min ��� �� ����������
        min = value;
    }
}
// ������� ����� ��� ��������� ��������

public void displayValues() {
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
}
// ������� ����� ��� ����������� ��������

public static void main(String[] args) {
    Test6 minMax = new Test6(5, 10);
    minMax.displayValues();

    minMax.setValues(3);
    minMax.displayValues();

    minMax.setValues(12, 1);
    minMax.displayValues();
    }
// ��������
}
