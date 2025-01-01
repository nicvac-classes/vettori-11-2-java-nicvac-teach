import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i;
        int j;
        boolean duplicato;
        int contatore;

        System.out.println("Inserisci la dimensione del vettore");
        n = Integer.parseInt(scanner.nextLine());
        
        // Dichiara e inizializza il vettore convenzionale
        int[] v = new int[n];
        
        // Input dei valori
        for (i = 0; i <= n-1; i++) {
            System.out.print("Inserisci il " + (i + 1) + "° valore: ");
            v[i] = Integer.parseInt(scanner.nextLine());
        }
        
        // Ricerca dei duplicati
        for (i = 0; i <= n-2; i++) {
            duplicato = false;
            contatore = 1;
            
            for (j = i + 1; j <= n-1; j++) {
                if (v[i] == v[j]) {
                    System.out.println("Il valore " + v[i] + " occorre nelle posizioni " + i + " e " + j);
                    contatore = contatore + 1;
                    duplicato = true;
                }
            }
            
            if (duplicato) {
                System.out.println("E' stato inserito " + contatore + " volte.");
            }
        }
        
        scanner.close();
    }
}



