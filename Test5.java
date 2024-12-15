package laba5;

public class Test5 {
    private int x;
// —оздаем приватное целочисленное поле


    // —оздаем конструктор дл€ присваивани€ значени€ переменной

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
    // —оздаем методы дл€ присваивани€ значений переменной
}


