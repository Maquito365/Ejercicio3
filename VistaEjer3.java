import java.util.Scanner;
public class VistaEjer3 {
    private ControladorEjer3 controlador;
    private Scanner scanner;

    public VistaEjer3(){
        controlador = new ControladorEjer3();
        scanner = new Scanner(System.in);
    }

    public void MostrarMenu(){
        boolean salir = false;
        while(!salir){
        System.out.println("Menú de Gestión del Gimnasio:");
        System.out.println("1. Añadir Miembro al Gimnasio");
        System.out.println("2. Añadir Entrenador");
        System.out.println("3. Añadir Rutina");
        System.out.println("4. Asignar Entrenador a Miembro");
        System.out.println("5. Asignar Rutina a Miembro");
        System.out.println("6. Mostrar Rutina con Más Miembros");
        System.out.println("7. Mostrar Número de Rutinas Activas");
        System.out.println("8. Mostrar Entrenador con Más Personas Asignadas");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch(opcion){
            case 1:
            System.out.print("Ingrese el nombre de la persona:");
            String nombrePersona = scanner.nextLine();
            System.out.print("Ingrese el tipo de membresía (Básica/Premium):");
            String tipoMembresia = scanner.nextLine();
            PersonaGym persona = new PersonaGym(nombrePersona, tipoMembresia);
            controlador.añadirPersona(persona);
            System.out.println("Persona añadida exitosamente.");
            break;

            case 2:
            System.out.print("Ingrese el nombre del entrenador:");
            String nombreEntrenador = scanner.nextLine();
            EntrenadorGym entrenador = new EntrenadorGym(nombreEntrenador);
            controlador.añadirEntrenador(entrenador);
            System.out.println("Entrenador añadido exitosamente.");
            break;

            case 3:
            System.out.print("Ingrese el nombre de la rutina:");
            String nombreRutina = scanner.nextLine();
            System.out.print("Ingrese la duración de la rutina: ");
            int duracion = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese el estado de la rutina (activa/inactiva): ");
            String estado = scanner.nextLine();
            boolean rutinaActiva = estado.equalsIgnoreCase("activa");
            Rutina rutina = new Rutina(nombreRutina, duracion, rutinaActiva);
            controlador.añadirRutina(rutina);
            System.out.println("Rutina añadida exitosamente.");
            break;

            case 4:
            System.out.print("Ingrese el nombre del miembro:");
            String nombreMiembro = scanner.nextLine();
            System.out.print("Ingrese el nombre del entrenador:");
            String nombreEntrenadorA = scanner.nextLine();
            PersonaGym miembro = null;
            for(PersonaGym personaGym: controlador.getPersonas()){
                if(personaGym.getNombre().equalsIgnoreCase(nombreMiembro)){
                    miembro = personaGym;
                    break;
                }

            }

            EntrenadorGym entrenadorA = null;
            for(EntrenadorGym entrenadorGym: controlador.getEntrenadores()){
                if(entrenadorGym.getNombre().equalsIgnoreCase(nombreEntrenadorA)){
                    entrenadorA = entrenadorGym;
                    break;
                }
            }

            if(miembro != null && entrenadorA != null){
                miembro.setEntrenadorAsignado(entrenadorA);
                entrenadorA.asignarPersona(miembro);
                System.out.println("Entrenador asignado exitosamente.");
            }
            else{
                System.out.println("Miembro o Entrenador no encontrado.");
            }
            break;
            
            case 5:
            System.out.print("Ingrese el nombre del miembro:");
            String Nmiembro = scanner.nextLine();
            System.out.print("Ingrese el nombre de la rutina:");
            String NRutina = scanner.nextLine();

            PersonaGym miembroR = null;
            for(PersonaGym personaGym: controlador.getPersonas()){
                if(personaGym.getNombre().equalsIgnoreCase(Nmiembro)){
                    miembroR = personaGym;
                    break;
                }
            }

            Rutina rutinaA= null;
            for(Rutina rutinaGym: controlador.getRutinas()){
                if(rutinaGym.getNombreRutina().equalsIgnoreCase(NRutina)){
                    rutinaA = rutinaGym;
                    break;
                }
            }

            if(miembroR != null && rutinaA != null){
                miembroR.setRutinaAsignada(rutinaA);
                rutinaA.incrementoMiembros();
                System.out.println("Rutina asignada exitosamente.");
            }
            else {
                System.out.println("Miembro o Rutina no encontrado.");
            }
            break;
            case 6:
            Rutina rutinaMax = controlador.getRutinaConMasMiembros();
            if(rutinaMax != null){
                System.out.println("Rutina con más miembros: " + rutinaMax + "Con " + rutinaMax.getMiembrosAsignados() + " miembros.");
            } else {
                System.out.println("No hay rutinas disponibles.");
            }
            case 7:
            int numRActivas = controlador.getNumeroRutinasActivas();
            if(numRActivas > 0){
                System.out.println("Número de rutinas activas: " + numRActivas);
            } else {
                System.out.println("No hay rutinas activas.");
            }
            break;

            case 8:
            EntrenadorGym entrenadorGod = controlador.getEntrenadorConMasPersonas();
            if (entrenadorGod != null){
                System.out.println("Entrenador con la mayor cantidad de personas asignadas: " + entrenadorGod + "Con " + entrenadorGod.getPersonasAsignadas().size() + " personas.");
            }
            else{
                System.out.println("No hay entrenadores disponibles.");
            }
            break;
            
            case 9:
            salir = true;
            System.out.println("Saliendo del programa...");
            break;
        }
        }
    }
}
