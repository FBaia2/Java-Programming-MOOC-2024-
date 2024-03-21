public class Fitbyte {
    private int m_age;
    private int m_restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        m_age = age;
        m_restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return ((206.3 - (0.711 * m_age)) - m_restingHeartRate) * (percentageOfMaximum) + m_restingHeartRate;

    }

}
