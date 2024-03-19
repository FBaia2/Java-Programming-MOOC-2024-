
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        count = 0;

    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (sum == 0 || count == 0) {
            return 0;
        }
        return  (double)sum/count;
    }


    public void addNumber(int number) {
       
        count += 1;
        sum += number;

    }

}