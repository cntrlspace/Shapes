/** class Rectangle - models a Rectangle in 2D, can calculate its own area and perimeter; subclass of Shape
 * @author Nicole Lonatro
 * @version 0.1
 * @since September 3, 2022
 */

public class Rectangle extends Shape {

    private double base;  /** @custom.invariant  base >= 0.0 */
    private double height;  /** @custom.invariant  height >= 0.0 */

    /**  Constructor taking 4 Point2D objects as arguments for each vertex in a Rectangle, calls superclass Shape
     * @param point1 The first vertex
     * @param point2 The second vertex
     * @param point3 The third vertex
     * @param point4 The fourth vertex
     * @custom.require There can be no vertices with the exact same x and y values. So, each point must have a different coordinates
     * @custom.require The vertices that make up a side that is parallel to the x-axis have the same y-values
     * @custom.require The vertices that make up a side that is parallel to the y-axis have the same x-values
     */
    public Rectangle(Point2D point1, Point2D point2, Point2D point3, Point2D point4) {
        super(point1, point2, point3, point4);
    }

    /**  Returns the distance between one vertex and the next vertex which make up a side of this
     *  rectangle that is parallel to the x-axis
     * @return The length of the side as a double
     * @custom.ensure baseLength() >= 0.0
     */
    public double baseLength() {
        Point2D point1 = getVertex(baseIndex());
        Point2D point2;

        if (baseIndex() == (arrayLength() - 1)) {
            point2 = getVertex(0);
        } else {
            point2 = getVertex(baseIndex() + 1);
        }
        return point1.distance(point2);
    }

    /**  Returns the distance between the two parallel sides of this rectangle that
     *  are also parallel to the x-axis
     * @return The height of this rectangle as a double
     * @custom.ensure heightLength() >= 0.0
     */
    public double heightLength() {
        double yMax, yMin;
        double yParallelSide = getVertex(parallelSideIndex()).getY();
        double yBaseIndex = getVertex(baseIndex()).getY();

        if (yParallelSide < yBaseIndex) {
            yMax = yBaseIndex;
            yMin = yParallelSide;
        } else {
            yMax = yParallelSide;
            yMin = yBaseIndex;
        }
        return yMax - yMin;
    }

    /**  Returns the index value of the opposite side of a side that is parallel to the x-axis
     * @return Starting index integer value of the other side that is parallel to the x-axis
     */
    public int parallelSideIndex() {
        int parallelSide = 0;
        //  Odd Index
        if (isOdd(baseIndex())) {
            if (baseIndex() == 1) {
                parallelSide = 3;
            } else {
                parallelSide = 1;
            }
        }
        //  Even Index
        if (!isOdd(baseIndex())) {
            if (baseIndex() == 0) {
                parallelSide = 2;
            } else {
                parallelSide = 0;
            }
        }
        return parallelSide;
    }

    /**  Evaluates if an integer is odd
     * @param number The integer value to be evaluated
     * @return True if integer is odd; false otherwise
     */
    public boolean isOdd(int number) {
        if ((number % 2) == 0) {
            return false;
        } else return true;
    }

    /**  Calculates the area of this rectangle
     * @return The area as a double
     * @custom.ensure calculateArea() >= 0.0
     */
    @Override
    public double calculateArea() {
        base = baseLength();
        height = heightLength();
        return base * height;
    }

    /**  Calculates the perimeter of this rectangle
     * @return The perimeter as a double
     * @custom.ensure calculatePerimeter() >= 0.0
     */
    @Override
    public double calculatePerimeter() {
        base = baseLength();
        height = heightLength();
        return base + base + height + height;
    }

    /**  Returns the state of this rectangle
     * @return rectangle vertices
     */
    @Override
    public String toString() {
        return String.format("Rectangle Vertices:%n %s%n %s%n %s%n %s", getVertex(0), getVertex(1), getVertex(2), getVertex(3));
    }
} //  end class
