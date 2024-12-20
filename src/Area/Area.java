package Area;

public class Area {
    static int a;
    static int b;
    static int c;
    static int count = 0;
    static double S;
    public Area(int a, int b, int c){
        this.a = a;
        this. b = b;
        this.c = c;
    }
    public Area(int a){
        this.a = a;
    }
    public Area(int a, int b){
        this.a = a;
        this. b = b;
    }

    public static double areaTriangleGeron(int a, int b, int c){
        double p = ((double)a+(double)b+(double)c)/2;
        S = Math.sqrt(p*(p-(double)a)*(p-(double)b)*(p-(double)c));
        count++;
        return S;
    }

    public static double areaTriangle(int a, int b){
        S = (double)a*(double)b/2;
        count++;
        return S;
    }

    public static double areaSquare(int a){
        S = Math.pow(a, 2);
        count++;
        return S;
    }

    public static double areaRectangle(int a, int b){
        S = a*b;
        count++;
        return S;
    }

    public static int getCount(){
        return count;
    }
}
