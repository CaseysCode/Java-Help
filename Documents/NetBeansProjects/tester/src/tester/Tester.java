 
import java.util.Scanner;
 
class Quadrilateral{
double a;
double b;
Quadrilateral(double a,double b){
this.a = a;
this.b = b;
}
public void area(){System.out.print("\nInside Quadrilateral");}
}
class Parallelogram extends Quadrilateral{
 
Parallelogram(double x,double y){
super(x,y);
}
public void area(){
System.out.print("\nInside Parallelogram");
System.out.print("\nArea of Rectangle is :" + (a*b));
}
}
class Rectangle extends Quadrilateral{
 
Rectangle(double l,double w){
super(l,w);
}
public void area(){
System.out.print("\nInside Rectangle");
System.out.print("\nArea of Rectangle is :" + (a*b));
}
}
class Square extends Quadrilateral{
 
Square(double s){
super(s,s);
}
public void area(){
System.out.print("\nInside Square");
System.out.print("\nArea of Rectangle is :" + (a*b));
}
}
 
class InheritanceDemo {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Quadrilateral qr;
double a,b;
 
System.out.print("\nQuadrilateral-->");
Quadrilateral q = new Quadrilateral(0,0);
qr = q;
qr.area();
 
System.out.print("\nParallelogra-->");
System.out.print("\nEnter value of a and b :");
a=sc.nextDouble();b=sc.nextDouble();
Parallelogram p = new Parallelogram(a,b);
qr= p;
qr.area();
 
System.out.print("\nRectangle-->");
System.out.print("\nEnter value of length and width :");
a=sc.nextDouble();b=sc.nextDouble();
Rectangle r = new Rectangle(a,b);
qr = r;
qr.area();
 
System.out.print("\nSquare-->");
System.out.print("\nEnter value of side :");
a=sc.nextDouble();
Square s = new Square(a);
qr = s;
qr.area();
}
}