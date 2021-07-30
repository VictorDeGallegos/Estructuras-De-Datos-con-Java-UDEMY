# Implementacion de la ordenacion por burbuja

Reutilizando la clase [Arreglo.java](https://github.com/VictorDeGallegos/Estructuras-De-Datos-con-Java-UDEMY/blob/main/Ejercicios/src/arreglos/Arreglo.java) Arreglo.java que utilizaste en la seccion 3.Arreglos y cambia el nombre de la clase por ArregloBurbuja.java e implementa el metodo public void ordenacionBurbuja()

Posteriormente crear una clase ArregloBurbujaMain.java donde se ponga a prueba el funcionamiento del programa

El problema: calcular el maximo y el minimo valor de un conjunto de N datos

- 1. Declara una variable tipo long que guarde los valores ingresados por el teclado

- 2. Declaramos instancia de la clase Scanner para ingresar datos por la consola y de este modo solicitar al usuarip ingrese la cantidad de datos a analizar

- 3. Crea una instancia de la clase ArregloBurbuja (pasamos la variable tamaño al constructor)

- 4. leemos los datos numericos ingresados por teclado

- 5. Mostramos el arreglo antes de estar ordenado.

- 6. Ordenamos el arreglo

- 7. Mostramos el menor valor y el mayor valor

# Implementacion de la ordenacion por seleccion

Implementa una clase ArreglosSeleccion.java contendrá los mismos métodos que la clase de [ArregloBurbuja.java](https://github.com/VictorDeGallegos/Estructuras-De-Datos-con-Java-UDEMY/blob/main/Ejercicios/src/ordenacion/ArregloBurbuja.java)

Solamente vamos a sustituir el método de ordenacionBurbuja() por el método de ordenación por selección.

Posteriormente crea una clase ArreglosSeleccionMain.java y
Dado un conjunto de valores enteros, retornar todos las pares de números cuya diferencia sea igual a dos. El resultado deberá estar en orden ascendente de valores. Si se ingresan valores enteros duplicados solo se considerarán una vez para el cálculo de las diferencias.

Y se debe mostrar el conjunto de caracteres ordenandolos en pares de elementos

# Implementacion de la ordenacion por insercion

Reutilizando la clase [ArregloBurbuja.java](https://github.com/VictorDeGallegos/Estructuras-De-Datos-con-Java-UDEMY/blob/main/Ejercicios/src/ordenacion/ArregloBurbuja.java) la cual renombraremos por ArregloInsercion.java y crea un arreglo que inicie con 0 elementos e implementa los siguientes metodos:

public boolean buscar(long dato): Metodo que busca un valor especifico en arreglo el argumento dato especifica el valor del elemento a borrar.

public void insertar(long dato): Inserta un nuevo elemento en el arreglo

public boolean eliminar(long dato): borra elemento del arreglo que sea igual al valor del argumento dato desplazando los valores del arreglo una celda hacia abajo

public void mostrarElementos():recorre todos los elementos del arreglo imprime cada elemento del arreglo en consola

public long valorElemento(int i): muestra el valor del elemento en la posicion i del arreglo

public void ordenacionInsercion(): metodo que ordena arreglo usando el metodo de ordenacion por insercion

public void mostrarElementosMenoresA(int valor):metodo que imprime los valores menores al valor ingresado como

Posteriormente crea una clase ArregloInsercionMain.java y crea una instancia de la clase ArregloInsercion con una capacidad para almacenar 10 elementos (inserta 6 valores de tu eleccion al arreglo), solicita al usuario el valor para el cual queremos averiguar los numeros en el arreglo menores a el, muestra los elementos insertados e imprime los valores menores al valor de la variable valor
