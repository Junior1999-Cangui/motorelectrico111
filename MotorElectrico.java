package motorelectrico;

/*
 * @author Cangui Toapanta Junior Steven
 */
interface SensorPotencia{
    default String Medida(String nombre){
        return " Potencia del motor"+nombre;
    } 
}

interface SensorVoltaje{
    default String Medida(String nombre){
        return " Voltaje del motor";
    }
}

interface SensorTemperatura{
    default String Medida(String nombre){
        return " Temperatura del motor";
    }
}
public class MotorElectrico implements SensorPotencia, 
        SensorVoltaje, SensorTemperatura{

    @Override
        public String Medida(String nombre){
            return SensorPotencia.super.Medida(nombre);
        }
    /*
    @Override
        public String Medida(String nombre){
            return SensorVoltaje.super.Medida(nombre);
        }*/
        
    /*@Override
        public String Medida(String nombre){
            return SensorTemperatura.super.Medida(nombre);
        }*/    
        
    public static void main(String[] args) {
        
        System.out.println("\tUniversidad de las Fuerzas Armadas ESPE ");
        System.out.println("\t\tSede Latacunga");
        System.out.println("Estudiante: Junior Cangui");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Asignatura: Programacion [7450]");
        System.out.println("Tema: HERENCIA MÚLTIPLE\n");
        
        MotorElectrico motorelectrico = new MotorElectrico();
        System.out.println(motorelectrico.Medida("\n Es la capacidad que tiene el motor electrico"));
        System.out.println(" para realizar un trabajo en dicho caso el movimiento.");
    }
}
