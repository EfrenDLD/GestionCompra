package Operaciones;

import Bebidas.RegistroBebidas;
import Comidas.RegistrarComida;

import java.util.Scanner;

public class Menu {
    RegistroBebidas registroBebidas = new RegistroBebidas();
    RegistrarComida registrarComida = new RegistrarComida();

    Scanner scanner = new Scanner(System.in);
    public void MenuGestion(){
            System.out.println(" --  Operaciones Menu de de la casa -- ");
            System.out.println("1.- Alimentos");
            System.out.println("2.- Bebidas ");
            System.out.println("3.- Salir");
            System.out.println("Seleccione una opcion :");
            int agregar = scanner.nextInt();
            switch (agregar){
                case 1:
                    registrarComida.elegirComida();
                    break;
                case 2:

                    registroBebidas.elegirBebida();
                    break;
                case 3:
                    System.out.println("Gracias por su visista !!");
                    break;
            }
    }
}
