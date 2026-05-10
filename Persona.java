public class Persona {

    private final String nombre;
    private final String ap;
    private final String am;
    private final String telefono;
    private final int edad;
    private final char genero;
    private final double estatura;

    public Persona(String nombre, String ap, String am, String telefono, 
                    int edad, char genero, double estatura){
        
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.telefono = telefono;
        this.edad = edad;
        this.genero = genero;
        this.estatura = estatura;
        }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + 
        "Apellido Paterno: " + ap + "\n" +
        "Apellido Materno: " + am + "\n" +
        "Telefono: " + telefono + "\n" +
        "Edad: " + edad + "\n" + 
        "Genero: " + genero + "\n" +
        "Estatura: " + estatura;
    
    }
    public static void main(String[] args) {

        System.out.println("///// DATOS DE LA PERSONA /////");

        Persona unaPersona = new Persona("Carlos Alfredo", "Hernández ","Rojas ", "2472884546",45, 'H', 1.90);

        System.out.println(unaPersona.toString());
    }
}

