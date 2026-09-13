package ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        String nomb, jor, gen, tur;
        int ed, cod, dni;
        double hor, pagxhor;
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        
        //Captura de datos
        System.out.println("Registro del empleado");
        cod = ran.nextInt(9000)+1000;
        System.out.println("Ingrese el Nombre: ");
        nomb = scan.nextLine();
        System.out.println("Ingrese genero: ");
        gen = scan.nextLine();
        System.out.println("Ingrese su tipo de jornada: ");
        jor = scan.nextLine();
        System.out.println("Ingrese su tipo de turno: ");
        tur = scan.nextLine();
        System.out.println("Ingrese la edad: ");
        ed = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese el DNI: ");
        dni = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        hor = scan.nextDouble();
        scan.nextLine(); //Salto al sig. requisito
        System.out.println("Ingrese el pago por hora: ");
        pagxhor = scan.nextDouble();
        scan.nextLine();
        
        Empleado emp = new Empleado (nomb,jor,tur,ed,dni,cod,hor,pagxhor,gen);
        
        emp.mostar_sueldoNeto();
    }
    
}
