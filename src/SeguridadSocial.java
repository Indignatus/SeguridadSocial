import java.util.List;
import java.util.ArrayList;

public class SeguridadSocial {
    private List<Persona> personasList;
    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {


        String dni = persona.getDni();
        int seguridadSocial= persona.getSeguridadSocial();
        String nombre= persona.getNombre();
        String apellido= persona.getApellido();
       int edad= persona.getEdad();
       double salario = persona.getSalario();

        boolean correcto = true;

       if(dni.equalsIgnoreCase("")){
           System.out.println("El dni no puede estar empty");
           correcto = false;
       }

        if (seguridadSocial < 0 ){
            System.out.println("Numero de la seguridad social incorecto");
            correcto = false;
        }
        if(nombre.equalsIgnoreCase("")){
            System.out.println("El nombre no puede estar empty");
            correcto = false;
        }
        if (apellido.equalsIgnoreCase("")){
            System.out.println("El apellido no puede estar empty");
            correcto = false;

        }
        if (salario < 0 ){
            System.out.println("No puede existir un salario egative!!!!!!");
            correcto = false;
        }

        for (Persona n : personasList){
            if (dni.equalsIgnoreCase(n.getDni())){
                System.out.println("Ya existe ese dni");
                correcto = false;
            }

        }





        if (correcto){



            personasList.add(persona);
        }else{
            System.out.println("Persona no agregada ");
        }






    }

    public void bajaPersona(String dni) {
        boolean esta = false;

        Persona aux = null;

        for ( Persona h : personasList){

            if (dni.equalsIgnoreCase(h.getDni())){
              aux = h;

                esta = true;
                System.out.println("Persona borrada correctamente");
                break;
            }

        }
        if (aux != null){
            personasList.remove(aux);
        }


        if(!esta){
            System.out.println("No existe ningua persona con ese nombre");
        }


    }

    public Persona obtenerPersonaPorDNI(String dni) {

        boolean ele = false;
        for ( Persona x : personasList){
            if ( dni.equalsIgnoreCase(x.getDni())){
                ele = true;
                return x;

            }
        }

        if(!ele){
            System.out.println("No se ha encontrado ninguna persona");
        }

return  null;



    }

    public Persona obtenerPersonaPorNumSS(int numSS) {

        boolean esta = false;

        for (Persona o : personasList){

            if (numSS == o.getSeguridadSocial()){
                esta = true;
                return o;


            }
        }

        if (esta){
            System.out.println("No existe ninguna persona con ese numero de la ss");
        }

        return null;

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

        ArrayList <Persona> elefantes = new ArrayList<>();

        for (Persona u : personasList){

            if (u.getSalario() >= min && u.getSalario() <= max   ){

                elefantes.add(u);

            }

        }

        return elefantes;

    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

        ArrayList <Persona> temporal = new ArrayList<>();



        for (Persona y : personasList){

            if (y.getEdad() > edad){

                temporal.add(y);


            }

        }
        return temporal;
    }

    public List<Persona> obtenerTodas(){

        return  personasList;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
