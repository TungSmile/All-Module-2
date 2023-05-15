public class Circle {
    double radiux;
    String color;

    public Circle(double radiux, String color) {
        this.radiux = radiux;
        this.color = color;
    }
    Circle(){

    }

    public double getRadiux() {
        return radiux;
    }

    public void setRadiux(double radiux) {
        this.radiux = radiux;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "A Circle with radius="
                + getRadiux();
    }
}
