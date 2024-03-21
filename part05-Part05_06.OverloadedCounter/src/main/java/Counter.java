public class Counter {
    private int m_startvalue;

    public Counter(int startValue) {
        m_startvalue = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return m_startvalue;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {

            m_startvalue += increaseBy;

        }

    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {

        } else {
            m_startvalue += (decreaseBy * -1);
        }

    }

}
