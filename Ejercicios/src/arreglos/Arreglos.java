package Ejercicios.src.arreglos;

public class Arreglos {

    public static void main(String[] args) {
        long[] arr; // Referencia al arreglo
        arr = new long[20]; // Creacion arreglo con items del tipo primitivo long
        int numElems; // Variable que almacena el numero actual de items en el arreglo arr
        int j; // Indice del arreglo
        long buscarItem; // item a buscar en el arreglo
        // INSERTAR 10 ITEMS EN EL ARREGLO
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        numElems = 10;

        // Recorrer arreglo------------------------------------------------
        for (j = 0; j < numElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        // Buscar item con valor 66 en el
        // arreglo------------------------------------------------
        buscarItem = 66;
        for (j = 0; j < numElems; j++) {
            if (arr[j] == buscarItem) { // Se encontro item
                break; // Salio del bucle for porque item se encontro
            }
        }
        if (j == numElems) { // Se llego al final del arreglo y no se encontro el item
            System.out.println("No se encontro el item" + buscarItem);
        } else { // Se encontro el item
            System.out.println("Si se encontro el item con valor " + buscarItem);
        }
        // Borrar item con valor 55 en el
        // arreglo------------------------------------------------
        buscarItem = 55;
        for (j = 0; j < numElems; j++) { // buscar item
            if (arr[j] == buscarItem) { // item encontrado al salir del bucle
                break;
            }
        }
        for (int k = j; k < numElems; k++) { // mueve items superiores hacia abajo apartir del indice del item
                                             // encontrado
            arr[k] = arr[k + 1];
        }
        numElems--; // Reduce el numero de items en arreglo en 1
        // Muestra o imprime items------------------------------------------------
        System.out.println(" Se elimino el numero 55: ");
        for (j = 0; j < numElems; j++) {
            System.out.print(arr[j] + " ");

        }
    }
}
