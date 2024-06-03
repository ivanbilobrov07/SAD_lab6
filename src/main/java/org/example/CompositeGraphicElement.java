package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The CompositeGraphicElement class represents a composite graphical element that contains multiple graphic elements.
 */
public class CompositeGraphicElement implements GraphicElement {
    public List<GraphicElement> elements;

    /**
     * Constructs an empty CompositeGraphicElement.
     */
    public CompositeGraphicElement() {
        this.elements = new ArrayList<>();
    }

    /**
     * Adds a graphic element to the composite.
     *
     * @param element the graphic element to be added
     */
    public void add(GraphicElement element) {
        this.elements.add(element);
    }

    /**
     * Removes a graphic element from the composite.
     *
     * @param element the graphic element to be removed
     */
    public void remove(GraphicElement element) {
        this.elements.remove(element);
    }

    /**
     * Draws the composite graphic element.
     */
    @Override
    public void draw() {
        System.out.println("Draw a composite element");

        elements.forEach(GraphicElement::draw);
    }

    /**
     * Clones the composite graphic element with a specified depth of cloning.
     *
     * @param depthOfClone the depth of cloning
     * @return a cloned composite graphic element
     */
    @Override
    public GraphicElement clone(int depthOfClone) {
        if (depthOfClone > 0){
            CompositeGraphicElement compositeGraphicElement = new CompositeGraphicElement();

            for(GraphicElement element : elements){
                compositeGraphicElement.add(element.clone(depthOfClone - 1));
            }

            return compositeGraphicElement;
        }

        return this;
    }

    /**
     * Clones the composite graphic element.
     *
     * @return a cloned composite graphic element
     */
    @Override
    public GraphicElement clone() {
        CompositeGraphicElement compositeGraphicElement = new CompositeGraphicElement();

        for(GraphicElement element : elements){
            compositeGraphicElement.add(element);
        }

        return compositeGraphicElement;
    }
}
