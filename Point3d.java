public class Point3d {

    public double xCoord;
    public double yCoord;
    public double zCoord;

    public Point3d(double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d(){
        this(0,0,0);
    }
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }
    public void setX(double val){
        xCoord = val;
    }
    public void setY(double val){
        yCoord = val;
    }
    public void setZ(double val){
        zCoord = val;
    }
    public boolean equals(Point3d point){
        if ((point.getX() == xCoord) && (point.getY() == yCoord) && (point.getZ() == zCoord)){
            return true;
        }
        return false;
    }
    public double distanceTo(Point3d point){
        return ((double) ((int) (Math.sqrt(Math.pow(point.getX() - xCoord, 2) + Math.pow(point.getY() - yCoord, 2) + Math.pow(point.getZ() - zCoord, 2)) * 100))) / 100;
    }
}
