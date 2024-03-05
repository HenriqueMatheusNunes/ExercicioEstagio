public class Dois {
    
        public static void main(String[] args) {
            int num = 34; // Número a ser verificado
            int prev = 0;
            int next = 1;
    
            while (prev <= num) {
                if (prev == num) {
                    System.out.println(num + " pertence à sequência de Fibonacci.");
                    return;
                }
                int sum = prev + next;
                prev = next;
                next = sum;
            }
    
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

