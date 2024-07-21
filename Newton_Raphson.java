public class Newton_Raphson {
    public static void main(String[] args) {
        double n = 50;
        System.out.println(Sqrt(n));
    }
    public static double Sqrt(double n){
        double x = n;
        double root;
        while (true){
            root = 0.5*(x + (n/x));
            if ( Math.abs(root - x) < 0.2) {
                break;
            }
            x = root;
        }
        return root;
    }
}
