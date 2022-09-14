/** class Triangle - models a Triangle in 2D, can calculate its own area and perimeter; subclass of Shape
 * @author Nicole Lonatro
 * @version 0.1
 * @since September 3,
 */


public class Triangle extends Shape{

   private double base; /** @custom.invariant base >= 0.0 */
   private double height; /** @custom.invariant height >= 0.0 */

    /**  Constructor taking 3 Point2D objects as arguments for each vertex in a Triangle, calls superclass Shape
     * @param point1 The first vertex
     * @param point2 The second vertex
     * @param point3 The third vertex
     * @custom.require There can be no vertices with the exact same x and y values. So, each point must have a different coordinate
     * @custom.require Two Point2D objects must have the same y-values
     */
   public Triangle(Point2D point1, Point2D point2, Point2D point3) {
       super(point1, point2, point3);
   }

    /**  Returns the distance between one vertex and the next vertex making up the base side of the
     *  triangle
     * @return The length of the base side
     * @custom.ensure baseLength() >= 0.0
     */
   public double baseLength() {
        Point2D point1 = getVertex(baseIndex());
        Point2D point2;
       // System.out.println(baseIndex());
        if (baseIndex() == (arrayLength() - 1)) {
            point2 = getVertex(0); }
        else {
            point2 = getVertex(baseIndex() + 1);
        }
        return point1.distance(point2);
   }

    /**  Compares the vertices' y-values and calculates the maximum distance along the y-axis
     * @return The height of this triangle
     * @custom.ensure heightLength() >= 0.0
     */
   public double heightLength() {
       double yMax, yMin;
       double yIndex0 = getVertex(0).getY();
       double yIndex1 = getVertex(1).getY();
       double yIndex2 = getVertex(2).getY();
       double baseHeight = getVertex(baseIndex()).getY();
       double otherHeight;

       if ((baseHeight == yIndex0) && (baseHeight == yIndex1)) {
           otherHeight = yIndex2;
       } else if ((baseHeight == yIndex1) && (baseHeight == yIndex2)) {
           otherHeight = yIndex0;
       } else {
           otherHeight = yIndex1;
       }

       if (otherHeight < baseHeight) {
           yMax = baseHeight;
           yMin = otherHeight;
       } else {
            yMax = otherHeight;
            yMin = baseHeight;
       }
       return yMax - yMin;
   }

    /**  Calculates the area using the formula for the area of a triangle
     * @return This triangle area
     * @custom.ensure calculateArea() >= 0.0
     */
   @Override
   public double calculateArea() {
       base = baseLength();
       height = heightLength();
        return (base*height)/2;
   }

    /**  Calculates the perimeter using the formula for the perimeter of a triangle
     * @return This triangle perimeter
     * @custom.ensure calculatePerimeter() >= 0.0
     */
   @Override
   public double calculatePerimeter() {
        double side1 = getVertex(0).distance(getVertex(1));
        double side2 = getVertex(1).distance(getVertex(2));
        double side3 = getVertex(2).distance(getVertex(0));
        return side1 + side2 + side3;

   }

    /**  Returns the state of this triangle
     * @return triangle vertices
     */
    @Override
    public String toString() {
        return String.format("Triangle Vertices:%n %s%n %s%n %s", getVertex(0), getVertex(1), getVertex(2));
    }
} //  end class
