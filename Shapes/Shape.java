import java.util.Arrays;

/** abstract class Shape - model for shapes, stores an array of Point2D objects
 * @author Nicole Lonatro
 * @version 0.1
 * @since September 3, 2022
*/

public abstract class Shape {

    private final Point2D[] vertices;

    /**  Constructor taking an arbitrary amount of Point2D objects
     * which reference points on a 2 dimensional plane
     * @param pointList Point2D objects referencing the coordinates of each point or vertex
     * @custom.require Need to take least 3 Point2D objects for the argument, thus making a shape
     */
    public Shape(Point2D ... pointList) {
        vertices = new Point2D[pointList.length];

        for (int i=0; i< pointList.length; i++) {
            vertices[i] = pointList[i];
        }
    }

    /**  Returns the element of a Point2D object in an array at a specified index value.
     * @param index The index value of an element
     * @return Vertex of the element
     */
    public Point2D getVertex(int index) {
        return vertices[index];
    }

    /**  Returns the length of the Point2D array
     * @return Array length
     */
    public int arrayLength() {
        return vertices.length;
    }

    /**  Compares each vertex's y-values to determine which two vertices make up the base side.
     * Since any given vertex and the next vertex define a side and must be ordered in a clockwise manner,
     * the first instance of a vertex(n) whose y-value is equal to the next vertex(n+1) will be determined
     * as the side that is parallel to the x-axis
     * @return The index value of the first of two vertices who make up a side
     */
    public int baseIndex() {
        int index = 0;

        for (int i=0; i<(arrayLength()-1); i++) {
            if ((getVertex(i).getY()) == (getVertex(i + 1).getY())) {
                index = i;
                i = arrayLength();
            } else if ((getVertex(arrayLength() - 1).getY()) == (getVertex(0).getY())) {
                index = arrayLength() - 1;
                i = arrayLength();
            }
        }
        return index;
    }

    /**  Calculates the area, abstract method to be overridden
     * @custom.require calculateArea() >= 0.0
     */
    public abstract double calculateArea();

    /**  Calculates the perimeter, abstract method to be overridden
     * @custom.require calculatePerimeter() >= 0.0
     */
    public abstract double calculatePerimeter();

    public String toString() {
       return Arrays.toString(vertices);
    }
} //  end class
