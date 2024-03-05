public class Cinco {
    
        public static void main(String[] args) {
            String original = "Exemplo"; // String a ser invertida
            char[] caracteres = original.toCharArray();
            int inicio = 0;
            int fim = caracteres.length - 1;
            char temp;
    
            while (inicio < fim) {
                // Troca os caracteres
                temp = caracteres[inicio];
                caracteres[inicio] = caracteres[fim];
                caracteres[fim] = temp;
    
                // Move os índices para o próximo par de caracteres
                inicio++;
                fim--;
            }
    
            String invertida = new String(caracteres);
            System.out.println("String original: " + original);
            System.out.println("String invertida: " + invertida);
        }
    }

