public class App {
    public static void main(String[] args) throws Exception {
        double [ ] array = { 32, 10, 50, 2, 20, 15, 12, 28, 15, 45,11,12};
        double arrayy [] = { 12,10,9,8,7,6,5,4,3,2,1,0};

        System.out.printf("%s%8s\n","Índice","Valor");
        
        for (int a = 0; a < array.length; a++)
        System.out.printf("%d\t%f\n", a, array[a]);
        System.out.printf("================================================\n");
        
        for (int i = 0; i < arrayy.length; i++)
        System.out.printf("%d\t%f\n", i,arrayy[i]);
    }
}
