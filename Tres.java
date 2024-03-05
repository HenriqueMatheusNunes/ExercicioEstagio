public class Tres {

    public static void main(String[] args) {

        // a) Números ímpares
        int nextA = 7 + 2;
        
        // b) Progressão geométrica (dobro do anterior)
        int nextB = 64 * 2;
        
        // c) Quadrados perfeitos
        int nextC = (int)Math.pow((int)Math.sqrt(36) + 1, 2);
        
        // d) Quadrados perfeitos começando de 2^2
        int nextD = (int)Math.pow((int)Math.sqrt(64) + 2, 2);
        
        // e) Sequência de Fibonacci
        int prev1 = 5, prev2 = 8;
        int nextE = prev1 + prev2;
        
        System.out.println("Próximo número para a sequência a) é: " + nextA);
        System.out.println("Próximo número para a sequência b) é: " + nextB);
        System.out.println("Próximo número para a sequência c) é: " + nextC);
        System.out.println("Próximo número para a sequência d) é: " + nextD);
        System.out.println("Próximo número para a sequência e) é: " + nextE);
        // f) Não temos lógica clara
    }
}