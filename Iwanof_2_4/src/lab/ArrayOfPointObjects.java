package lab;

public class ArrayOfPointObjects extends AbstractArrayOfPoints {
    private Point[] p = { };

    @Override
    public void setPoint(int i, double x, double y) {
        if (i < count()) {
            p[i].setPoint(x, y);
        }
    }

    @Override
    public double getX(int i) {
        return p[i].getX();
    }

    @Override
    public double getY(int i) {
        return p[i].getY();
    }

    @Override
    public int count() {
        return p.length;
    }

    @Override
    public void addPoint(double x, double y) {
        // Створюємо масив, більший на один елемент:
        Point[] p1 = new Point[p.length + 1];
        // Копіюємо всі елементи:
        System.arraycopy(p, 0, p1, 0, p.length);
        // Записуємо нову точку в останній елемент:
        p1[p.length] = new Point(x, y);
        p = p1; // Тепер p вказує на новий масив
    }

    @Override
    public void removeLast() {
        if (p.length == 0) {
            return; // Масив вже порожній
        }
        // Створюємо масив, менший на один елемент:
        Point[] p1 = new Point[p.length - 1];
        // Копіюємо всі елементи, крім останнього:
        System.arraycopy(p, 0, p1, 0, p1.length);
        p = p1; // Тепер p вказує на новий масив
    }

}
