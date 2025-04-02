import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();

        notas.add(1);
        notas.add(123123);

        System.out.println(notas);
    }

    //Listas: tamaño dinamico, ordenada, permite duplicados

    //ArrayList: arma un arreglo, cuando se esta por quedar sin espacio,
    // crea un array nuevo mas grande y copia el contenido del array original
    //agregar elemento lento, acceder via indice rapido
    //Eliminar es mas lento, pq tengo q crear un nuevo array

    //LinkedList: nodos enlazados, cada nodo con su dato y su referencia al siguiente nodo
    //agregar elemento rapido, acceder via indice lento
    //eliminar es mas rapido pq solo tengo q cambiar las referencias


    //Vector
    //Para situaciones de concurrencia

    //--------------------------------------------------------------------------------
    //Sets: tamaño dinamico, ordenada (*), NO PERMITE DUPLICADOS

    //Hash Set: No es ordenado

    //TreeSet: Ordenado Natural o por un comparador que hay que crear

    //LinkedHashSet: Ordenado por insercion


    //-----------------------------------------------------------------------------------
    //Maps -- Diccionario: CLAVE VALOR, key value
    //{("hola", 1)} clave, valor

    //HashMap No es ordenado
    //TreeMap Ordenado Natural o por comparador
    //LinkedHashMap Ordenado por Insercion
    //ConcurrentHashMap para casos de concurrencia. No mantiene el orden pero es thread-safe



    //Clave valor? si -> Map Ordenado?? --------
    //Permite duplicado? si -> List Ordenado?? -----
    //no permite duplicados -> Set Ordenado?? -----

}