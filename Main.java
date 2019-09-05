package objectclass;

public class Main {
    public static void main(String[] args) {

/*        Point p = new Point(1, 10); // Adress
        System.out.println(p.getClass());
        Point p2 = new Point(1, 10); // Different adress
        if (p == p2) {
            System.out.println("They are equal"); // Thats why they are not equal (adresses are different)
        }
        if (p.equals(p2)) {
            System.out.println("Adresses are both objects"); // The both adresses are objects - thats why equal
        }
        if (p.equals2(p2)) {
            System.out.println("Values of p and p2 are equal"); // Checking the values now
        }*/

        Point[] p = new Point[5];
        p[0] = new Point(4,50);
        p[1] = new Point(4,50);
        p[2] = new Point(7,55);
        p[3] = new Point(11,70);
        System.out.println(p[0].equals2(p[1]));

    }
}

class Point {
    private int x;
    private int y;

    Point(){

    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

/*    int getX() {
        return x;
    }
    int getY() {
        return y;
    }*/

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public boolean equals2(Object obj) {
        //Checking if obj exist in array (array contain 5 objects but trying to compare p[6]
// "If" method or "For" method with "instanceOF" ??

        //Checking if placed obj is the same obj (p[0] == p[0])
        if (this == obj) {
            return true;
        }
        //Checking if obj in array is null (doesnt have value)
        if (obj == null) {
            return false;
        }
        //Checking if objects are from the same class
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        //Checking values in objects
        Point sentPoint = (Point)obj; // Downcasting
        return this.x == sentPoint.x && this.y == sentPoint.y;
    }



}