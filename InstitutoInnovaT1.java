package institutoinnova.t1;

import java.util.Scanner;

public class InstitutoInnovaT1 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AlumnoControlador controla = new AlumnoControlador();

        String rpta = "si";

        while (rpta.equalsIgnoreCase("si")) {

            try {

                Alumno a = new Alumno();

            
                while (a.getTipoDocumento() == null) {

                    System.out.println(
                            "Ingrese tipo de documento: DNI o Residencia Temporal");

                    a.setTipoDocumento(sc.nextLine());
                }

             
                while (a.getNumeroDocumento() == null) {

                    System.out.println("Ingrese numero de documento:");

                    a.setNumeroDocumento(sc.nextLine());
                }

          
                System.out.println("Ingrese nombre del alumno:");
                a.setNombre(sc.nextLine());

             
                while (a.getNivelSocioeconomico() == null) {

                    System.out.println(
                            "Ingrese nivel socioeconomico: A, B o C");

                    a.setNivelSocioeconomico(sc.nextLine());
                }

             
                while (a.getTarifaBase() == 0) {

                    System.out.println("Ingrese tarifa base:");

                    a.setTarifaBase(sc.nextDouble());
                }

                sc.nextLine(); 

               
                while (a.getTipoBeca() == null) {

                    System.out.println(
                            "Ingrese tipo de beca: Sin Beca, Parcial o Total");

                    a.setTipoBeca(sc.nextLine());
                }

                
                a.calcularPension();

              
                controla.agregarAlumno(a);

                System.out.println("Alumno registrado correctamente.");

              
                System.out.println(
                        "Desea ingresar otro alumno: si/no");

                rpta = sc.nextLine();

            } catch (Exception e) {

                System.out.println(
                        "Error: ingrese los datos correctamente.");

                sc.nextLine();
            }
        }

        
        controla.listarAlumnos();

        sc.close();
    }
}