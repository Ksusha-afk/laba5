package laba5;

public class Test5 {
    private int x;
// ������� ��������� ������������� ����


    // ������� ����������� ��� ������������ �������� ����������

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 100) {
            this.x = 100;
        } else {
            this.x = x;
        }
    }

    public void setX() {
        this.x=0;
        }
    // ������� ������ ��� ������������ �������� ����������
}


