package sud.aufgaben.occupationalTherapy.figure;

import sud.aufgaben.occupationalTherapy.figure.pyramid.Cone;
import sud.aufgaben.occupationalTherapy.figure.pyramid.FourSidedPyramid;
import sud.aufgaben.occupationalTherapy.figure.pyramid.PyramidalFigure;
import sud.aufgaben.occupationalTherapy.figure.pyramid.ThreeSidedPyramid;
import sud.aufgaben.occupationalTherapy.form.Circle;
import sud.aufgaben.occupationalTherapy.form.Rectangle;
import sud.aufgaben.occupationalTherapy.form.Triangle;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        testSphere();
        testPyramids();
        testPrims();
    }

    private static void testSphere() {
        Sphere sphere = new Sphere(2.5);
        System.out.println("-----------| " + sphere.getClass().getSimpleName() + " |-----------");
        System.out.println("Surface: " + sphere.getSurface());
        System.out.println("Volume: " + sphere.getVolume());
    }

    private static void testPyramids() {
        Circle coneBase = new Circle(2.5);
        Triangle threeSidedPyramidBase = new Triangle(2, 2, 2);
        Rectangle fourSidedPyramidBase = new Rectangle(2, 2);
        PyramidalFigure<?>[] figures = {
                new Cone(coneBase, 5),
                new ThreeSidedPyramid(threeSidedPyramidBase, 2),
                new FourSidedPyramid(fourSidedPyramidBase, 2)
        };
        Arrays.stream(figures).forEach(pyramidalFigure -> {
            System.out.println("-----------| " + pyramidalFigure.getClass().getSimpleName() + " |-----------");
            System.out.println("Surface: " + pyramidalFigure.getSurface());
            System.out.println("Volume: " + pyramidalFigure.getVolume());
        });
    }

    private static void testPrims() {
        Circle cylinderBase = new Circle(2.5);
        Triangle threeSidedPrism = new Triangle(2, 2, 2);
        Rectangle fourSidedPrism = new Rectangle(2, 2);
        Prism<?>[] figures = {
                new Prism<>(cylinderBase, 5),
                new Prism<>(threeSidedPrism, 5),
                new Prism<>(fourSidedPrism, 5)
        };
        Arrays.stream(figures).forEach(prism -> {
            System.out.println("-----------| " + prism.getClass().getSimpleName() + ": " + prism.getBase().getClass().getSimpleName() + " |-----------");
            System.out.println("Surface: " + prism.getSurface());
            System.out.println("Volume: " + prism.getVolume());
        });
    }

}