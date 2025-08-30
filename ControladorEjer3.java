import java.util.ArrayList;
import java.util.List;
public class ControladorEjer3 {
    private List<PersonaGym> personas;
    private List<EntrenadorGym> entrenadores;
    private List<Rutina> rutinas;

    public ControladorEjer3(){
        this.personas = new ArrayList<>();
        this.entrenadores = new ArrayList<>();
        this.rutinas = new ArrayList<>();
    }

    public void añadirPersona(PersonaGym persona){
        personas.add(persona);
        if(persona.getRutinaAsignada() != null){
            persona.getRutinaAsignada().incrementoMiembros();
        }
    }

    public void añadirEntrenador(EntrenadorGym entrenador){
        entrenadores.add(entrenador);
    }

    public void añadirRutina(Rutina rutina){
        rutinas.add(rutina);
    }
    
    public List<PersonaGym> getPersonas() { return personas; }
    public List<EntrenadorGym> getEntrenadores() { return entrenadores;}
    public List<Rutina> getRutinas() { return rutinas; }

    public Rutina getRutinaConMasMiembros(){
        Rutina maxRutina = null;
        for(Rutina rutina : rutinas){
            if(maxRutina == null || rutina.getMiembrosAsignados() > maxRutina.getMiembrosAsignados()){
                maxRutina = rutina;
            }
        }
        return maxRutina;
    }

    public int getNumeroRutinasActivas(){
        int contador = 0;
        for(Rutina rutina : rutinas){
            if(rutina.isRutinaActiva()){
                contador++;
            }
        }
        return contador;
    }
    public EntrenadorGym getEntrenadorConMasPersonas(){
        EntrenadorGym maxEntrenador = null;
        for(EntrenadorGym entrenador : entrenadores){
            if(maxEntrenador == null || entrenador.getPersonasAsignadas().size() > maxEntrenador.getPersonasAsignadas().size()){
                maxEntrenador = entrenador;
            }
        }
        return maxEntrenador;
    }
}
