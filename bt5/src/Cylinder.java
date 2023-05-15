public class Cylinder extends Circle{
    int width;

    public Cylinder(double radiux, String color, int width) {
        super(radiux, color);
        this.width = width;
    }

    public Cylinder(int width) {
        this.width = width;
    }
    Cylinder(){

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public String toString(){
        return "A Circle with radius="
                + getRadiux()
                + ", which is a subclass of Circle";
    }
}
