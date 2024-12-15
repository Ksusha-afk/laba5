package laba5;

public class Test1 {

    private char symbol;
    // Создаем закрытое символьное поле

    public void setSymbol(char ch1) {
            symbol = ch1;
        }
    // Присваиваем значение полю

    public int getCode(char ch1) {
            return (int) symbol;
        }
    // Возвращаем код символа
    public void printSymbolCode() {
            System.out.println("Символ: " + symbol);
            System.out.println("Код: " + (int) symbol);
        }
    // Выводим на консоль символ и его код

    public static void main(String[] args) {
            Test1 sym = new Test1();
            sym.setSymbol('К');
            sym.printSymbolCode();
        }
    }
