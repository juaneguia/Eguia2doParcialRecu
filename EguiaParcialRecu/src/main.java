import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        
        List<Alumno> alumnos = new ArrayList<>();
        Alumno a1 = new Alumno("Juan", 01);
        Alumno a2 = new Alumno("Nicolas", 02);
        Alumno a3 = new Alumno("Betina", 03);
        Alumno a4 = new Alumno("Yesica", 04);
        Alumno a5 = new Alumno("Hernan", 05);
        Alumno a6 = new Alumno("Sol", 06);
        Alumno a7 = new Alumno("Valentino", 07);
        Alumno a8 = new Alumno("Daniel", 10);
        Alumno a9 = new Alumno("Dario", 11);
        Alumno a10 = new Alumno("Ayrton", 12);
        
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);
        alumnos.add(a7);
        alumnos.add(a8);
        alumnos.add(a9);
        alumnos.add(a10);
        
        List<Curso> cursos = new ArrayList<>();
        Curso c1 = new Curso("Base de Datos", "Cristian");
        Curso c2 = new Curso("Estadistica", "Roxana");
        Curso c3 = new Curso("Matematica", "Lujan");
        Curso c4 = new Curso("Practica", "Sergio");
        Curso c5 = new Curso("Ingles", "Angie");
        
        cursos.add(c1);
        cursos.add(c2);
        cursos.add(c3);
        cursos.add(c4);
        cursos.add(c5);
        
        List<Inscripcion> inscripciones = new ArrayList<>();
        Inscripcion i1 = new Inscripcion(a1, c1, 7, "A determinar");
        Inscripcion i2 = new Inscripcion(a2, c2, 6, "A determinar");
        Inscripcion i3 = new Inscripcion(a3, c3, 2, "A determinar");
        Inscripcion i4 = new Inscripcion(a4, c4, 5, "A determinar");
        Inscripcion i5 = new Inscripcion(a5, c5, 2, "A determinar");
        Inscripcion i6 = new Inscripcion(a6, c1, 9, "A determinar");
        Inscripcion i7 = new Inscripcion(a7, c2, 10, "A determinar");
        Inscripcion i8 = new Inscripcion(a8, c3, 6, "A determinar");
        Inscripcion i9 = new Inscripcion(a1, c4, 4, "A determinar");
        Inscripcion i10 = new Inscripcion(a2, c5, 2, "A determinar");
        
        inscripciones.add(i1);
        inscripciones.add(i2);
        inscripciones.add(i3);
        inscripciones.add(i4);
        inscripciones.add(i5);
        inscripciones.add(i6);
        inscripciones.add(i7);
        inscripciones.add(i8);
        inscripciones.add(i9);
        inscripciones.add(i10);
        
        for (int i=0; i<inscripciones.size();i++) {
        	System.out.println(inscripciones.get(i).toString());
         } 
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("Dime el nombre del alumno que desea buscar");
        String nombreAlumno = leer.next(); 
        
        boolean encontrado = false;
        int i=0;
        while(!encontrado && i<alumnos.size()) {
    	   
    	   if (alumnos.get(i).getNombreAlumno().equals(nombreAlumno)) {	
       		System.out.println(alumnos.get(i).toString());
       		encontrado = true;
       }
    	  i++; 
       }
        if (!encontrado) {
        	System.out.println("No se encontro alumno"); //Esto es para mostrar en el caso que no encuentre vendedor en el for
        }
        
        int cantidadAprobados = 0;
        int cantidadDesaprobados = 0;
        
        for (int j=0; j<inscripciones.size();j++) {
        	inscripciones.get(j).determinarCondicion();
        if(inscripciones.get(j).getCondicion().equals("Aprobado"))  {
        		cantidadAprobados++;
        }
        else {
        	cantidadDesaprobados++;
        }
       } 
       
        System.out.println("Cantidad de aprobados = " + cantidadAprobados);
        System.out.println("Cantidad de desaprobados = " + cantidadDesaprobados);
      
        
	}

}
