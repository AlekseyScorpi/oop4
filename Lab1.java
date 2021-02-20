import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Point3d a = parseStr(in1.nextLine());
        Scanner in2 = new Scanner(System.in);
        Point3d b = parseStr(in2.nextLine());
        Scanner in3 = new Scanner(System.in);
        Point3d c = parseStr(in3.nextLine());
        if (a.equals(b) || a.equals(c) || b.equals(c)){
            System.out.println("Значение двух или более точек совпадает -> указан не треугольник!");
            return;
        }
        System.out.println("Площадь треугольника равна: ");
        System.out.println(computeArea(a, b, c));
    }
    public static Point3d parseStr(String str){
        String xCoord = "";
        String yCoord = "";
        String zCoord = "";
        String[] coord = str.split(" ");
        Point3d point = new Point3d();
        xCoord = coord.length >= 1 ? coord[0] : "";
        yCoord = coord.length >= 2 ? coord[1] : "";
        zCoord = coord.length >= 3 ? coord[2] : "";
        if (xCoord != ""){
            point.setX(Double.parseDouble(xCoord));
        }
        if (yCoord != "") {
            point.setY(Double.parseDouble(yCoord));
        }
        if (zCoord != ""){
            point.setZ(Double.parseDouble(zCoord));
        }

        return point;
    }
    public static double computeArea(Point3d a, Point3d b, Point3d c){
        double AB = a.distanceTo(b);
        double AC = a.distanceTo(c);
        double BC = b.distanceTo(c);
        double p = (AB + AC + BC) / 2;
        return Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
    }
}
