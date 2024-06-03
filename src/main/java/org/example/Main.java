package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(10);
        Line line2 = new Line(20);
        Line line3 = new Line(30);

        Triangle triangle = new Triangle(line1, line2, line3);

        Line copyOfLine1 = (Line) line1.clone(); //Copy of line1

        Triangle partialCopyOfTriangle = (Triangle) triangle.clone(); //Only copy of triangle not lines
        Triangle fullCopyOfTriangle = (Triangle) triangle.clone(2); //Full copy of triangle

        CompositeGraphicElement cge1 = new CompositeGraphicElement();
        CompositeGraphicElement cge2 = new CompositeGraphicElement();

        cge1.add(triangle);
        cge1.add(line1);

        cge2.add(cge1);
        cge2.add(triangle);

        CompositeGraphicElement cge1Depth1Clone = (CompositeGraphicElement) cge1.clone(); // Only copy of cge1, not elements
        CompositeGraphicElement cge1Depth2Clone = (CompositeGraphicElement) cge1.clone(2); // Copy of cge1, triangle without lines and line
        CompositeGraphicElement cge1Depth3Clone = (CompositeGraphicElement) cge1.clone(3); // Copy of cge1, triangle with lines and line

        CompositeGraphicElement cge2Depth1Clone = (CompositeGraphicElement) cge2.clone(); // Only copy of cge2, not elements
        CompositeGraphicElement cge2Depth2Clone = (CompositeGraphicElement) cge2.clone(2); // Copy of cge2, cge1, triangle without lines
        CompositeGraphicElement cge2Depth3Clone = (CompositeGraphicElement) cge2.clone(3); // Copy of cge2, cge1 (triangle without lines and line), triangle with lines
        CompositeGraphicElement cge2Depth4Clone = (CompositeGraphicElement) cge2.clone(4); // CCopy of cge2, cge1 (triangle with lines and line), triangle with lines
    }
}