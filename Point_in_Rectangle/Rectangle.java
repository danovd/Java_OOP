package Point_in_Rectangle;

public class Rectangle {

    private final Point pointA;
    private final Point pointC;

    public Rectangle(Point pointA, Point pointC) {
        this.pointA = pointA;
        this.pointC = pointC;
    }
    public boolean contains(Point point) {

        boolean isInHorizontal =

                this.pointA.getX() <= point.getX() &&

                        this.pointC.getX() >= point.getX();

        boolean isInVertical =

                this.pointA.getY() <= point.getY() &&

                        this.pointC.getY() >= point.getY();

        return isInHorizontal &&
                isInVertical;

    }
}
