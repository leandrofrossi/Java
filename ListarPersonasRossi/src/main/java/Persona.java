import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;

    //Arrays con nombres y apellidos
    private final String[] nombres = {"Juan", "Federico", "Dario", "Agustin", "Leandro", "Jorge", "Carlos"};
    private final String[] apellidos = {"Rodriguez", "Rossi", "Garcia", "Perez", "Gutierrez", "Gonzalez"};

    //Logica para obtener nombres y apellidos al azar de los arrays previamente definidos
    public Persona() {
        this.nombre = getRandomWord(nombres);
        this.apellido = getRandomWord(apellidos);
    }
    private String getRandomWord (String[] list) {
        int randomIndex = (int) Math.round(Math.random() * (list.length - 1));
        return list[randomIndex];
    }

    //Sobreescritura de metodos de clases padres
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;

        if (!getNombre().equals(persona.getNombre())) return false;
        return getApellido().equals(persona.getApellido());
    }

    @Override
    public int hashCode() {
        int result = getNombre().hashCode();
        result = 31 * result + getApellido().hashCode();
        return result;
    }

    //Setters y Getters de nombre y apellido
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Logica para ordenar las listas alfabeticamente
    public static ArrayList<Persona> sortPersonas (ArrayList<Persona> listado, String sortBy){
        switch (sortBy) {
            case "nombre" -> listado.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
            case "apellido" -> listado.sort((o1, o2) -> o1.getApellido().compareTo(o2.getApellido()));
            case "apellidoInverso" -> listado.sort((o1, o2) -> o2.getApellido().compareTo(o1.getApellido()));
            default -> {
            }
        }
        return listado;
    }
}
