package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamenPractico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String parar = "0";
        List<Integer> numerosLista = new ArrayList<>();
        int contador = 1;

        System.out.println("Añade 5 números");

        while (contador < 6) {
            try {
                // Añadimos el número
                System.out.println("Añade el número #" + contador);
                Integer numero = scanner.nextInt();
                numerosLista.add(numero);

            } catch (InputMismatchException e) {
                System.out.println("El dato debe ser un número entero, no decimal ni letras.");
                System.out.println("Fin de la operación");
                break;

            }
            contador ++;
        }

        // Si la lsita está vacia, no ejecutarla.
        if (!numerosLista.isEmpty()) {
            List<Integer> num10Lista = new ArrayList<>();

            num10Lista = numerosLista.stream()
                    .filter(numero -> numero > 10) //filtramos los números mayores a 10
                    .map(numero -> numero * 2)     //Multiplicmaos los números por 2
                    .collect(Collectors.toList());

            //Calculamos la suma total de los números
            int sumaTotal = 0;
            for (Integer num : num10Lista) {
                sumaTotal += num;
            }

            //Se imprimen los números
            System.out.println("La suma total es: " + sumaTotal);
        }

    }
}
