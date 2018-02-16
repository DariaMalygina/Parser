public class Point3 {
    private double x; //Easting
    private double y; //Northing
    private double z;

    public static Point3 Empty() {
        return new Point3(0, 0, 0);
    }

    public Point3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceTo(Point3 point) {
        double dx = (point.x - x);
        double dy = (point.y - y);
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "({" + x + "};{" + y + "};{" + z + "})";
    }

    public static Point3 fromString(String data) {
        try {
            String str = data.substring(1, data.length() - 2);
            String[] parts = str.split(";");
            float x = Float.parseFloat(parts[0]);
            float y = Float.parseFloat(parts[1]);
            float z = Float.parseFloat(parts[2]);
            return new Point3(x, y, z);
        } catch (Exception ex) {
            return Point3.Empty();
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Point3 point = (Point3) o;
        return  this.x == point.getX() &&
                this.y == point.getY() &&
                this.z == point.getZ();
    }

    @Override
    public int hashCode() {
        return ((Double) x).hashCode() + ((Double) y).hashCode() + ((Double) z).hashCode();
    }
}
