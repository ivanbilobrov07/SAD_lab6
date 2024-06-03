package org.example;

/**
 * The GraphicElement interface represents a graphical element that can be drawn and cloned.
 */
public interface GraphicElement {
    /**
     * Draws the graphical element.
     */
    void draw();

    /**
     * Clones the graphical element with a specified depth of cloning.
     *
     * @param depthOfClone the depth of cloning
     * @return a cloned graphical element
     */
    GraphicElement clone(int depthOfClone);

    /**
     * Clones the graphical element.
     *
     * @return a cloned graphical element
     */
    GraphicElement clone();
}
