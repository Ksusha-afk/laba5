package laba5;

public class Test1 {

    private char symbol;
    // ������� �������� ���������� ����

    public void setSymbol(char ch1) {
            symbol = ch1;
        }
    // ����������� �������� ����

    public int getCode(char ch1) {
            return (int) symbol;
        }
    // ���������� ��� �������
    public void printSymbolCode() {
            System.out.println("������: " + symbol);
            System.out.println("���: " + (int) symbol);
        }
    // ������� �� ������� ������ � ��� ���

    public static void main(String[] args) {
            Test1 sym = new Test1();
            sym.setSymbol('�');
            sym.printSymbolCode();
        }
    }
