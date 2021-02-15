public class Point3d extends Point2d {
    public double zCoord;

    public Point3d(double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d(){
        this(0,0,0);
    }
    public double getZ(){
        return zCoord;
    }
    public void setZ(double val){
        zCoord = val;
    }
    public boolean equals(Point3d point){
        return (point.getX() == xCoord) && (point.getY() == yCoord) && (point.getZ() == zCoord);
    }
    public double distanceTo(Point3d point){
        return ((double) ((int) (Math.sqrt(Math.pow(point.getX() - xCoord, 2) + Math.pow(point.getY() - yCoord, 2) + Math.pow(point.getZ() - zCoord, 2)) * 100))) / 100;
    }
}
