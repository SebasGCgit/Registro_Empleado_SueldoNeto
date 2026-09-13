package ejercicio2;

public class Empleado 
{
    String nombre;
    String jornada;
    String turno;
    int edad, dni, cod_Emp;
    double horas;
    double pagoxhora;
    String genero;
    public Empleado (String nombre, String jornada, String turno, int edad, int dni, int cod_Emp, double horas, double pagoxhora, String genero)
    {
        this.nombre=nombre;
        this.jornada=jornada;
        this.turno=turno;
        this.edad =edad;        
        this.dni =dni;
        this.cod_Emp =cod_Emp;
        this.horas= horas;
        this.pagoxhora=pagoxhora;
        this.genero=genero;
    }
    //el metodo r-b
    public void mostar_sueldoNeto()
    {
        double sueldNeto=horas*pagoxhora;
        System.out.println("Sueldo neto (horas x pago por hora)");
        System.out.println("Nombre                    :" +nombre+
                           "\nCodigo de identificación :" +cod_Emp+
                           "\nJornada de trabajo:" +jornada+
                           "\nTurno                   :" +turno+
                           "\nDNI                       :" +dni+
                           "\nEdad                      :" +edad+
                           "\nGenero                    :" +genero+
                           "\nHoras trabajadas          :" +horas+
                           "\nPago por hora             :"+pagoxhora+
                           "\nSueldo a pagar            :" +sueldNeto);
    }
}
