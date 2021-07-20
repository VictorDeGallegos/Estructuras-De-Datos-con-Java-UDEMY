package Ejercicios.src.arreglos;

public class Arreglo {
    private long[] arr; // referencia al arreglo
    private int numElems; // numero de items en el arreglos

    // constructor
    public Arreglo(int tam) {
        arr = new long[tam]; // Crear arreglo
        numElems = 0; // Arreglo inicia con 0 elementos
    }

    // -----------------------------------------------------------------
    // metodo que busca un valor especifico en un arreglo
    // el argumento dato especifica el valor del elemento
    public boolean buscar(long dato) {
        int j;
        for (j = 0; j < numElems; j++) {
            if (arr[j] == dato) { // Se encontro item
                break;
            }
        }
        if (j == numElems) { // llego al final del arreglo
            return false; // no se encontro el elemento
        } else {
            return true; // se encontro y retorna true
        }
    }

    // -----------------------------------------------------------------
    // inserta un nuevo elemento en un arreglo
    public void insertar(long dato) {
        arr[numElems] = dato; // inserta dato en el arreglo
        numElems++; // inccrementa en uno el numero de elementos del arreglo
    }

    // -----------------------------------------------------------------
    // borra el elemento del arreglo con valor dato
    // desplazando valores de arreglo
    public boolean eliminar(long dato) {
        int j;

        for (j = 0; j < numElems; j++) { // busca elemento en arreglo
            if (arr[j] == dato) { // se encontro el valor buscado
                break;
            }
        }

        if (j == numElems) { // no se encontro el valor buscado
            return false;
        } else { // valor encontrado en arreglo
            for (int k = j; k < numElems - 1; k++) { // desplaza elementos superiores al indice j
                arr[k] = arr[k + 1];
            }
            numElems--;
            return true;
        }
    }

    // -----------------------------------------------------------------
    // imprime en pantalla el contenido del arreglo
    public void mostrarElementos() {
        for (int j = 0; j < numElems; j++) { // recorre todos los elementos del arreglo
            System.out.print(arr[j] + " "); // imprime cada elemento del arreglo en consola
        }

        System.out.println(""); // imprime linea en blanco
    }

    // --------------------------------------------------------------------
    // muestra el valor del elemento en la posicion i del arreglo
    public long valorElemento(int i) {
        return arr[i]; // retorna el valor del elemento en la posicion i del arreglo
    }
}
