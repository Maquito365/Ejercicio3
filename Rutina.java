public class Rutina {
    private String nombreRutina;
    private int duracion;
    private boolean RutinaActiva;
    private int miembrosAsignados;

    public Rutina(String nombreRutina, int duracion, boolean rutinaActiva) {
        this.nombreRutina = nombreRutina;
        this.duracion = duracion;
        this.RutinaActiva = rutinaActiva;
        this.miembrosAsignados = 0;
    }
    
    public String getNombreRutina(){ return nombreRutina;}
    public void setNombreRutina(String nombreRutina){ this.nombreRutina = nombreRutina;}
    public int getDuracion(){ return duracion;}
    public void setDuracion(int duracion){ this.duracion = duracion;}
    public boolean isRutinaActiva(){ return RutinaActiva;}
    public void setRutinaActiva(boolean rutinaActiva){ this.RutinaActiva = rutinaActiva;}
    public int getMiembrosAsignados(){ return miembrosAsignados;}
    public void incrementoMiembros(){ this.miembrosAsignados++;}
    public void decrementoMiembros(){ this.miembrosAsignados--;}

    @Override
    public String toString(){
        return "Rutina: " + nombreRutina + ", Duración: " + duracion + " mins, Activa: " + RutinaActiva + ", Miembros Asignados: " + miembrosAsignados;
    }
}
