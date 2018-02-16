public class UnitPosition {
    private Point3 coords;
    private int delay;
    private int statusId;

    public UnitPosition(double x, double y, int statusId, int delay) {
        this.statusId = statusId;
        this.coords = new Point3(x,y,0);
        this.delay = delay;
    }

    public int getStatusId() {
        return statusId;
    }

    public Point3 getCoords() {
        return coords;
    }

    public int getDelay() {
        return delay;
    }

    @Override
    public String toString() {
        return coords.toString()+" delay="+delay+" statusId="+statusId;
    }
}
