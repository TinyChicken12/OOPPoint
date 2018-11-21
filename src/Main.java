public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,9);
        MovablePoint moveablePoint = new MovablePoint(5,9);

        System.out.println(point.toString());

        System.out.println(moveablePoint.toString());

        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
