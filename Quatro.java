public class Quatro {
   

        public static void main(String[] args) {
            // Simula os interruptores e lâmpadas
            boolean[] interruptores = new boolean[3];
            boolean[] lampadas = new boolean[3];
            boolean[] lampadasQuentes = new boolean[3];
    
            // Passo 1: Ligue o primeiro interruptor (index 0)
            interruptores[0] = true;
            // Deixe a lâmpada esquentar por um tempo
            lampadasQuentes[0] = true;
    
            // Passo 2: Desligue o primeiro interruptor e ligue o segundo (index 1)
            interruptores[0] = false;
            interruptores[1] = true;
    
            // Passo 3: Vá até a sala das lâmpadas
            for (int i = 0; i < lampadas.length; i++) {
                if (interruptores[i]) {
                    // Lâmpada acesa
                    lampadas[i] = true;
                } else if (lampadasQuentes[i]) {
                    // Lâmpada apagada e quente
                    lampadas[i] = false;
                } else {
                    // Lâmpada apagada e fria
                    lampadas[i] = false;
                }
            }
    
            // Identifique qual interruptor controla cada lâmpada
            for (int i = 0; i < lampadas.length; i++) {
                if (lampadas[i]) {
                    System.out.println("O interruptor " + (i + 1) + " controla a lâmpada acesa.");
                } else if (lampadasQuentes[i]) {
                    System.out.println("O interruptor " + (i + 1) + " controla a lâmpada apagada e quente.");
                } else {
                    System.out.println("O interruptor " + (i + 1) + " controla a lâmpada apagada e fria.");
                }
            }
        }
    }

