package lab;
import java.util.Comparator;

class CompareBySquare implements Comparator<Triangle> {
    @Override
    public int compare(Triangle t1, Triangle t2) {
        return -1 *( Double.compare(t1.getSquare(), t2.getSquare()));
    }
}

