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
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                break;
            }
            xCoord += str.charAt(i);
        }
        for (int i = xCoord.length() + 1; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                break;
            }
            yCoord += str.charAt(i);
        }
        for (int i = xCoord.length() + yCoord.length() + 2; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                break;
            }
            zCoord += str.charAt(i);
        }
        Point3d point = new Point3d();
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
