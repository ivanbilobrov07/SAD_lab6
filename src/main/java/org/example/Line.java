package org.example;

/**
 * The Line class represents a line as a graphical element.
 */
public class Line implements GraphicElement{
    private float length;

    /**
     * Constructs a Line with the specified length.
     *
     * @param length the length of the line
     */
    public Line(float length){
        this.length = length;
    }

    /**
     * Draws the line.
     */
    @Override
    public void draw() {
        System.out.println("Draw a line of " + length + " cm");
    }

    /**
     * Clones the line with a specified depth of cloning.
     *
     * @param depthOfClone the depth of cloning
     * @return a cloned line
     */
    @Override
    public GraphicElement clone(int depthOfClone) {
        if (depthOfClone > 0) {
            return this.clone();
        }

        return this;
    }

    /**
     * Clones the line.
     *
     * @return a cloned line
     */
    @Override
    public GraphicElement clone() {
        try{
            return new Line(length);
        } catch (Exception e) {
            return this;
        }
    }
}
