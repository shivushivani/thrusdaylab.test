public class Radius{
private static int count;
float center,radius;
public Radius(float c,float r){
this.center=c;
this.radius=r;
count++;
}
Radius(){
System.out.println("this a default constructor");
count++;
}
void display(){
System.out.println("center:"+center+" "+"radius:"+radius);
}
public static void main(String[]ards){
Radius r1=new Radius(12.4f,54.3f);
Radius r2=new Radius(42.6f,54.5f);
r1.display();
r2.display();
Radius r3 =new Radius();
System.out.println("total number of Instance:"+Radius.count);}
}
