import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * Framework Colecciones Java
 * 
 * INTEFACES
 * 		
 * 
 * CLASES
 * 		Vector
 * 		Que
 * 		Deque
 * 		Stack
 * 
 */

public class Prueba {

	public static void main(String[] args) {
		ArrayList<Integer> numeros=new ArrayList<>();
		
		numeros.add(10);
		numeros.add(4);
		numeros.add(-9);
		numeros.add(32);
		numeros.add(-1);
		
		System.out.println("ORDENAMIENTO EN COLECCIONES DE NUMEROS");
		System.out.println();
		System.out.println("	ORIGINAL: "+numeros.toString());
		//MergeSort
		Collections.sort(numeros);
		System.out.println("	ORDENADO: "+numeros.toString());
		System.out.println();
		System.out.println();
		System.out.println(Collections.binarySearch(numeros, -1));
		System.out.println();
		System.out.println();
		
		ArrayList<String> nombres=new ArrayList<>();
		
		nombres.add("Luke");
		nombres.add("Leia");
		nombres.add("Anakyn");
		nombres.add("Obi Wan Kenobi");
		
		ArrayList<String> copiaNombres=(ArrayList<String>) nombres.clone();
		
		System.out.println("ORDENAMIENTO EN COLECCIONES DE CADENAS");
		System.out.println();
		System.out.println("	ORIGINAL: "+nombres.toString());
		//MergeSort
		Collections.sort(nombres);
		System.out.println("	ORDENADO: "+nombres.toString());
		System.out.println();
		System.out.println();
		
		System.out.println("ORDENAMIENTO INVERSO EN COLECCIONES");
		System.out.println();
		System.out.println("	ORIGINAL: "+copiaNombres.toString());
		//MergeSort
		Collections.sort(copiaNombres, Collections.reverseOrder());
		System.out.println("	ORDENADO: "+copiaNombres.toString());
		System.out.println();
		System.out.println();
		
		class Alumno implements Comparable<Alumno>, Comparator<Alumno> {
			String nombre;
			String numControl;
			Integer edad;
			
			public Alumno(String nombre, String numControl, int edad){
				this.nombre=nombre;
				this.numControl=numControl;
				this.edad=edad;
			}
			
			public String getNombre() {
				return nombre;
			}
			public String getNumControl() {
				return numControl;
			}
			public Integer getEdad() {
				return edad;
			}
			
			@Override
			public String toString() {
				return "Alumno [nombre=" + nombre + ", numControl=" + numControl + ", edad=" + edad + "]\n		 ";
			}

			@Override
			public int compareTo(Alumno o) {
				return nombre.compareTo(o.nombre);
			}
			
			/*
			@Override
			public int compareTo(Alumno o) {
				return numControl.compareTo(o.numControl);
			}
			*/
			
			/*
			@Override
			public int compareTo(Alumno o) {
				return edad.compareTo(o.edad);
			}
			*/

			@Override
			public int compare(Alumno a1, Alumno a2) {
				return a1.getEdad() - a2.getEdad(); 
			}
		}
		
		Alumno a1=new Alumno("Pedro", "01", 20);
		Alumno a2=new Alumno("Juan", "02", 19);
		Alumno a3=new Alumno("Andres", "03", 22);
		Alumno a4=new Alumno("Mario", "04", 17);
		Alumno a5=new Alumno("Pablo", "05", 25);
		
		ArrayList<Alumno> alumnos=new ArrayList<>();
		
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		
		System.out.println("ORDENAMIENTO EN COLECCIONES DE OBJETOS");
		System.out.println();
		System.out.println("	ORIGINAL: "+alumnos.toString());
		Collections.sort(alumnos);
		System.out.println("	ORDENADO: "+alumnos.toString());
		System.out.println();
		System.out.println();
		
		//TAREA: APLICAR BYNARY SEARCH EN COLECCCIONES ALUMNOS
		
		/*
		 *			REFERENCIAS
		 *
		 *	rpw. (2012). Implementar búsqueda binaria en objetos.
		 *	2018, de stackoverrun.com
		 *	Sitio web: https://stackoverrun.com/es/q/153957
		 */
		
		System.out.println("BUSQUEDA EN COLECCIONES DE OBJETOS");
		System.out.println();
		int index = Collections.binarySearch(alumnos, new Alumno("Pedro", null, 0));
		System.out.println("	Buscando a Pedro...\n");
		if(index >=0) 
		    System.out.println("	El alumno buscado si existe, es : "+alumnos.get(index)); 
		else 
		    System.out.println("	*El alumno no existe en la lista"); 
		System.out.println();
		
		index = Collections.binarySearch(alumnos, new Alumno("Pancho", null, 0));
		System.out.println("	Buscando a Pancho...\n");
		if(index >=0) 
		    System.out.println("	El alumno buscado si existe, es : "+alumnos.get(index)); 
		else 
		    System.out.println("	*El alumno no existe en la lista."); 
		System.out.println();
		System.out.println();
		
		index = Collections.binarySearch(alumnos, new Alumno("Mario", null, 0));
		System.out.println("	Buscando a Mario...\n");
		if(index >=0) 
		    System.out.println("	El alumno buscado si existe, es : "+alumnos.get(index)); 
		else 
		    System.out.println("	*El alumno no existe en la lista"); 
		System.out.println();
	}
}