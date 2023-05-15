public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }
    public String a(){  // test interface về class con có kế thừa interface của cha ko
        return "a";
    };
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] a = new float[2];
        a[0] = getxSpeed();
        a[1] = getySpeed();
        return a;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "),Speed=(" + getX() * xSpeed + "," + getY() * ySpeed + ")";
    }

    public MoveablePoint move() {
        float a = getX();
        a += this.xSpeed;
        float b = getY();
        b += this.ySpeed;
        setX(a);
        setY(b);
        return this;
    }
}
