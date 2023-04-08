public class App  {
    public static int soma(int... numeros) {
        int resultado = 0;
        
        for (int numero: numeros) {
            resultado += numero;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int soma = soma(19, 8, 2, 7);
        int somas = soma(64, 30, 17, 46);

        System.out.println("Primeira Soma: " + soma);
        System.out.println("Segunda Soma: " + somas);
    }
}
