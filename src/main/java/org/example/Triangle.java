package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The Triangle class represents a triangle as a composite of three Line elements.
 */
public class Triangle implements GraphicElement{
    private List<GraphicElement> elements;

    /**
     * Constructs a Triangle with the specified lines.
     *
     * @param line1 the first line
     * @param line2 the second line
     * @param line3 the third line
     */
    public Triangle(Line line1, Line line2, Line line3){
        this.elements = new ArrayList<>();

        this.elements.add(line1);
        this.elements.add(line2);
        this.elements.add(line3);
    }

    /**
     * Draws the triangle.
     */
    @Override
    public void draw() {
        System.out.println("Draw a triangle");

        elements.forEach(GraphicElement::draw);
    }

    /**
     * Clones the triangle with a specified depth of cloning.
     *
     * @param depthOfClone the depth of cloning
     * @return a cloned triangle
     */
    @Override
    public GraphicElement clone(int depthOfClone) {
        if (depthOfClone > 0) {
            Line line1 = (Line) elements.get(0).clone(depthOfClone - 1);
            Line line2 = (Line) elements.get(1).clone(depthOfClone - 1);
            Line line3 = (Line) elements.get(2).clone(depthOfClone - 1);

            return new Triangle(line1, line2, line3);
        }

        return this;
    }

    /**
     * Clones the triangle.
     *
     * @return a cloned triangle
     */
    @Override
    public GraphicElement clone() {
        return new Triangle( (Line) elements.get(0), (Line) elements.get(1), (Line) elements.get(2));
    }
}
