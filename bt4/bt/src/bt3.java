public class bt3 {
    public static void main(String[] args) {
        Fan a = new Fan(3, true, 10, "yellow");
        System.out.println(a.show());
        Fan b = new Fan(2, false, 5, "blue");
        System.out.println(b.show());
    }
}

class Fan {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String getOnOff() {
        if (this.on) {
            return "On";
        } else return "Off";
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        String sp;
        switch (this.speed) {
            case 1:
                sp = "SLOW";
                break;
            case 2:
                sp = "MEDIUM";
                break;
            case 3:
                sp = "FAST";
                break;
            default:
        }

        return speed;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        if (speed > 0 && speed < 4) {
            this.speed = speed;
        } else
            System.out.println("quạt méo có số 4 nhé");
    }

    public String show() {
        return "Quạt có tốc độ :" + this.getSpeed() + " bán kính :" + getRadius() + " màu :" + getColor() + " trạng thái :" + getOnOff();
    }
}