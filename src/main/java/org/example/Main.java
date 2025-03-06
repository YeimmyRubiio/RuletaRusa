package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ruletarusa Rr = new Ruletarusa();
        Scanner teclado= new Scanner(System.in);
         int u, jugador;

            System.out.println(" ");
            System.out.println("¡Bienvenido al juego!");
            System.out.println(" ");
            System.out.println("¡Ingresa la cantidad de jugadores!");
            jugador=teclado.nextInt();

            do {
                System.out.println(" ");
                System.out.println("1) Iniciar ronda");
                System.out.println("2) Reiniciar el juego");
                System.out.println("3) Salir");
                System.out.println(" ");
                u=teclado.nextInt();

                switch (u){
                    case 1:
                        System.out.println(" ");
                        System.out.println("Ronda de Disparos");

                        for (int i = 1; i<=jugador; i++){

                            System.out.println(" ");
                            System.out.println(Rr.toString());
                            System.out.println(" ");

                            if(Rr.disparar()){

                                System.out.println("Jugador " + i +" Perdiste :-(");
                                System.out.println(" ");
                                break;

                            }
                            else {
                                System.out.println("Jugador "+ i +" Aún estás vivo :-)");
                                System.out.println(" ");
                            }
                        }
                    break;

                    case 2:
                        Rr.reiniciarJuego();
                        System.out.println("Juego Reiniciado !!");
                        System.out.println(" ");
                        System.out.println("¡Bienvenido al juego!");
                        System.out.println(" ");
                        System.out.println("¡Ingresa la cantidad de jugadores!");
                        jugador=teclado.nextInt();
                    break;

                    default:  System.out.println("Fin del juego :-(");
                }

            } while (u!=3);

    }
}