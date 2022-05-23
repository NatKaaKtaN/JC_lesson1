package lesson1;

public class Pool {
    private double length;

    public Pool(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void doIt(Competitor competitor) {
        competitor.swim((int) length);
    }

    }

