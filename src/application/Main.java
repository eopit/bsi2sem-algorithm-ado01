package application;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que deseja encontrar na matriz: ");
        int x = sc.nextInt();
        
        System.out.println("Agora digite o tamanho do vetor");
        int n = sc.nextInt();
        System.out.println(""); 
        
        int[] array = new int[n];
        populaArray(array);
        procuraArray(array, x);
    }
    
    public static void populaArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = NumAleatorioNaoRepetido(array);
        }
    }
    
    public static int NumAleatorioNaoRepetido(int array[]) {
        boolean existe; 
        Random rn = new Random();
        int randomNumber;
        
        do {
            existe = true; //valor default
            randomNumber = rn.nextInt(10001 - 1) + 1;
            
            for (int i = 0; i < array.length; i++) {
                if (randomNumber == array[i]) 
                    existe = false;
            }
        }
        while(existe != true);
        
        return randomNumber; 
    }
    
    public static void procuraArray(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                System.out.println("O valor "+ x +" foi encontrado na " + (i + 1) + " posicao.");
                return;
            }
        }
        System.out.println("O valor nao foi encontrado no vetor.");
    }
}
