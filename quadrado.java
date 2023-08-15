import java.util.Base64;

public class quadrado {
    public static void main (String[] args){
        Point a = new Point(1,1);
        Point b = new Point(2,2);
        Point c = new Point(3,4);
        Point d = new Point(8,2);
        
        Rectangle amarelo  = new Rectangle(a, c);
        Rectangle laranja  = new Rectangle(2, 3, 9, 6);
        Rectangle verde    = new Rectangle(3, 4, 4, 5);
        Rectangle azul     = new Rectangle(5, 1, 6, 5);
        Rectangle vermelho = new Rectangle(7, 3, 9, 5);

        System.out.println("Perimetro do retangulo amarelo = " + amarelo.perimeter()); // 10
        System.out.println("Perimetro do retangulo laranja = " + laranja.perimeter()); // 20
      
        System.out.println("Area do retangulo amarelo = " + amarelo.area()); // 6
        System.out.println("Area do retangulo laranja = " + laranja.area()); // 21                   
      
        System.out.println("Ponto B dentro rectangulo amarelo? " + amarelo.pointInside(b)); // true
        System.out.println("Ponto D dentro rectangulo amarelo? " + amarelo.pointInside(d)); // false
        
        System.out.println("Retangulo verde dentro do laranja? " + laranja.rectangleInside(verde));       // true
        System.out.println("Retangulo azul dentro do laranja? " + laranja.rectangleInside(azul));         // false
        System.out.println("Retangulo vermelho dentro do laranja? " + laranja.rectangleInside(vermelho)); // true 
        System.out.println(amarelo.x);
        System.out.println(amarelo.doble().x);

    }
}
class Point {
    int x, y;

    Point() {
    x = y = 0;
    }
    
    Point(int x0, int y0) {
    x = x0;
    y = y0;
    }

    public String toString() {
    return "(" + x + "," + y + ")";
    }
}

class Rectangle{
    int x;
    int y;
    int xu;
    int yu;
    

    Rectangle(Point p1, Point p2){
        x  = p1.x;
        y  = p1.y;
        xu = p2.x;
        yu = p2.y;
    }

    Rectangle(int x1,int y1,int x2,int y2){
        x = x1;
        y = y1;
        xu = x2;
        yu = y2;

    } 

    public int area(){
        int base = (xu -x);
        int altura = (yu - y); 
        return (base * altura);
    }
    public int perimeter(){
        int base = (xu -x);
        int altura = (yu - y);
        return((2*base)+(2*altura));
    }
    public boolean pointInside(Point p){
        if (p.x>= x && p.x <= xu && p.y>= y && p.y <= yu ){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean rectangleInside(Rectangle r){
        if(r.x >= x && r.xu <= xu && r.y>=y && r.yu <= yu){
            return true;
        }
        else{
            return false;
        }

    }
    public Rectangle doble(){
        Rectangle s = new Rectangle(2*x,2*y,2*xu,2*yu);
        return s;

    }




}

