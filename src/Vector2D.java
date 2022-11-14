import java.util.Locale;

public class Vector2D {
    public double vX, vY;

    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
    }

    public Vector2D(double x, double y) {
        this.vX = x;
        this.vY = y;
    }

    public Vector2D(Vector2D v) {
        this.vX = v.vX;
        this.vY = v.vY;
    }

    public void print() {
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", this.vX, this.vY));
    }

    public double length() {
        return Math.sqrt(this.vX * this.vX + this.vY * this.vY);
    }

    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
}
