package comparable.a;


public class Rectangle implements Comparable<Rectangle>{
    private int hight;
    private int width;
    private int square;

    public Rectangle(int hight, int width) {
        this.hight = hight;
        this.width = width;
        this.square = hight * width;
    }

    public Rectangle() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return square == rectangle.square;
    }

    @Override
    public int compareTo(Rectangle o) {
        if (o == null) {
            throw new NullPointerException();
        }
        if (this.square > o.square) {
            return 1;
        }
        if (this.square < o.square) {
            return -1;
        }
        return 0;
    }
}
