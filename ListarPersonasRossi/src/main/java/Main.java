import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        //Se crean los 5 objetos Persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();

        //Se agregan los objetos a un array list
        ArrayList<Persona> listado = new ArrayList<>();
        listado.add(persona1);
        listado.add(persona2);
        listado.add(persona3);
        listado.add(persona4);
        listado.add(persona5);

        System.out.println( "Listado inicial: " +
            listado.get(0).getNombre() +" "+ listado.get(0).getApellido() + " - " +
            listado.get(1).getNombre() +" "+ listado.get(1).getApellido() + " - " +
            listado.get(2).getNombre() +" "+ listado.get(2).getApellido() + " - " +
            listado.get(3).getNombre() +" "+ listado.get(3).getApellido() + " - " +
            listado.get(4).getNombre() +" "+ listado.get(4).getApellido() + " . " );

       //Se crea una lista ordenanda por orden alfabetico del nombre y se imprime en consola
        ArrayList<Persona> ordenadoPorNombre = Persona.sortPersonas(listado, "nombre");

        System.out.println( "Listado ordenado alfabeticamente por nombre: " +
            ordenadoPorNombre.get(0).getNombre() + " " + ordenadoPorNombre.get(0).getApellido() + " - " +
            ordenadoPorNombre.get(1).getNombre() + " " + ordenadoPorNombre.get(1).getApellido() + " - " +
            ordenadoPorNombre.get(2).getNombre() + " " + ordenadoPorNombre.get(2).getApellido() + " - " +
            ordenadoPorNombre.get(3).getNombre() + " " + ordenadoPorNombre.get(3).getApellido() + " - " +
            ordenadoPorNombre.get(4).getNombre() + " " + ordenadoPorNombre.get(4).getApellido() + " . " );


        //Se crea una lista ordenanda por orden alfabetico del apellido y se imprime en consola
        ArrayList<Persona> ordenadoPorApellido = Persona.sortPersonas(listado,"apellido" );

        System.out.println( "Listado ordenado alfabeticamente por apellido: " +
            ordenadoPorApellido.get(0).getNombre() + " " + ordenadoPorApellido.get(0).getApellido() + " - " +
            ordenadoPorApellido.get(1).getNombre() + " " + ordenadoPorApellido.get(1).getApellido() + " - " +
            ordenadoPorApellido.get(2).getNombre() + " " + ordenadoPorApellido.get(2).getApellido() + " - " +
            ordenadoPorApellido.get(3).getNombre() + " " + ordenadoPorApellido.get(3).getApellido() + " - " +
            ordenadoPorApellido.get(4).getNombre() + " " + ordenadoPorApellido.get(4).getApellido() + " . " );


        //Se crea una lista ordenanda por orden alfabetico inverso del apellido y se imprime en consola
        ArrayList<Persona> ordenadoPorApellidoInverso = Persona.sortPersonas(listado, "apellidoInverso");

        System.out.println( "Listado ordenado alfabeticamente inverso por apellido: " +
            ordenadoPorApellidoInverso.get(0).getNombre() + " " + ordenadoPorApellidoInverso.get(0).getApellido() + " - " +
            ordenadoPorApellidoInverso.get(0).getNombre() + " " + ordenadoPorApellidoInverso.get(1).getApellido() + " - " +
            ordenadoPorApellidoInverso.get(0).getNombre() + " " + ordenadoPorApellidoInverso.get(2).getApellido() + " - " +
            ordenadoPorApellidoInverso.get(0).getNombre() + " " + ordenadoPorApellidoInverso.get(3).getApellido() + " - " +
            ordenadoPorApellidoInverso.get(0).getNombre() + " " + ordenadoPorApellidoInverso.get(4).getApellido() + " . " );
    }

}
