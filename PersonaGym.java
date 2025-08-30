public class PersonaGym {
    private String nombre;
    private String tipoMembresia;
    private Rutina rutinaAsignada;
    private EntrenadorGym entrenadorAsignado;

    public PersonaGym(String nombre, String tipoMembresia) {
        this.nombre = nombre;
        this.tipoMembresia = tipoMembresia;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipoMembresia() { return tipoMembresia; }
    public void setTipoMembresia(String tipoMembresia) { this.tipoMembresia = tipoMembresia; }
    public Rutina getRutinaAsignada() { return rutinaAsignada; }
    public void setRutinaAsignada(Rutina rutinaAsignada) { this.rutinaAsignada = rutinaAsignada; }
    public EntrenadorGym getEntrenadorAsignado() { return entrenadorAsignado; }
    public void setEntrenadorAsignado(EntrenadorGym entrenadorAsignado) { this.entrenadorAsignado = entrenadorAsignado; }

    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Tipo de Membresía: " + tipoMembresia + 
               (rutinaAsignada != null ? ", Rutina Asignada: " + rutinaAsignada.getNombreRutina() : ", Sin Rutina Asignada") +
               (entrenadorAsignado != null ? ", Entrenador Asignado: " + entrenadorAsignado.getNombre() : ", Sin Entrenador Asignado");
    }
    
}
