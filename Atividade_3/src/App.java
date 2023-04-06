public class App {
    public static void main(String[] args) throws Exception {
        double n1 = 80;
        double n2 = 60;
        double n3 = 80;
        double n4 = 70;
        double n5 = 20;
        
        System.out.println("n1, n2, n3, n4 e n5: " + n1 + " " + n2 + " " + n3 + " " + n4 +" " + n5);
        System.out.println("Media de n1, n2, n3, n4 e n5: " + media(n1,n2,n3,n4,n5));
        }

        public static double media(double ... numeros) {
        double total = 0;

        for (double d: numeros)
        total += d;
        return total/numeros.length;
        }
    }
