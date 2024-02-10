package src.Assignment8.AreaFormula;

interface Formula {
    void printFormula();
}

class Square implements Formula {
    public void printFormula() {
        System.out.println("The formula for a square is: Length * Length");
    }
}

class Rectangle implements Formula {
    public void printFormula() {
        System.out.println("The formula for a rectangle is Length*Width");
    }
}

class Circle implements Formula {
    public void printFormula() {
        System.out.println("The formula for a circle is πr^2");
    }
}
