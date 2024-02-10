package src.Assignment8.VolumeFormulas;

abstract class Shape {
    protected String Formula3d;

    public Shape(String Formula3d) {
        this.Formula3d = Formula3d;
    }

    abstract void printFormula3D();
}

class Circle3D extends Shape {
    public Circle3D(String Formula3d) {
        super(Formula3d);
    }
    protected String sphereString = "Sphere";
    public void printFormula3D() {
        System.out.println("Formula for a " +sphereString +" is (4/3)πr^3 ");
    }
}
