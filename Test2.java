package laba5;

public class Test2 {
    private char start;
    private char end;
// ������� ��� ��������� ���������� ����
    public Test2(char start, char end) {
        this.start = start;
        this.end = end;
    }
// ����������� �� ��������
    public void printCharacterRange() {
        for (char � = start; �<= end; �++) {
            System.out.print(� + " ");
        }
        System.out.println();
    }
// ������� ��������� �� � �� �
    public static void main(String[] args) {
        Test2 cr = new Test2('�', '�');
        cr.printCharacterRange();
    }
}

