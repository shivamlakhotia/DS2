package random.experiments;

public class Startup {
    // 0 - equilateral
    // 1 - isosceles
    // 2 - scalene
    // -1 - not a triangle
    public static int typeOfTriangle(int a, int b, int c){
        if(a == b && b == c && c == a)
            return 0;
        else return -1;
    }

    public static void main(String args[]) {
        System.out.println(typeOfTriangle(1, 1, 1));
    }
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println(typeOfTriangle(1, 1, 1));
//    }
}
