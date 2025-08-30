import java.util.ArrayList;
import java.util.List;
public class EntrenadorGym {
    private String nombre;
    private List<PersonaGym> personasAsignadas;

    public EntrenadorGym(String nombre) {
        this.nombre = nombre;
        this.personasAsignadas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<PersonaGym> getPersonasAsignadas() { return personasAsignadas; }
    public void asignarPersona(PersonaGym persona) {personasAsignadas.add(persona);}

    @Override
    public String toString(){
        return "Entrenador: " + nombre + ", Personas Asignadas: " + personasAsignadas.size();
    }

}