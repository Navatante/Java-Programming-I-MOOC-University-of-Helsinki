public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return (int)Math.pow(edgeLength,3);
    }

    public String toString () {
        return "The length of the edge is " + edgeLength + "and the volume " + volume();
    }
}
