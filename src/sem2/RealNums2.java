package sem2;

public class RealNums2 implements Nums{
    int start;
    int val;
    int prev;

    RealNums2() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 20;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
