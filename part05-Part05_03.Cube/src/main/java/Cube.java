public class Cube {
    private int m_edgeLength;
    private Double deez;

    public Cube(int edgeLength) {
        m_edgeLength = edgeLength;
    }

    public int volume() {
        return m_edgeLength * m_edgeLength * m_edgeLength;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + m_edgeLength + " and the volume " + volume();
    }
}
