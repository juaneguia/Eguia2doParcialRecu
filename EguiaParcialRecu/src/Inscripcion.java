
public class Inscripcion {
	
	private Alumno alumno;
	private Curso  curso;
	private int nota;
	private String condicion;
	public Inscripcion(Alumno alumno, Curso curso, int nota, String condicion) {
		super();
		this.alumno = alumno;
		this.curso = curso;
		this.nota = nota;
		this.condicion = condicion;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	
	public String determinarCondicion() {
		if(nota>=4) {
			condicion = "Aprobado";
		}
		else {
			condicion = "Desaprobado";
		}
		return condicion;
		
	}
	@Override
	public String toString() {
		return "Inscripcion: Alumno: " + alumno.getNombreAlumno() + ", Curso: " + curso.getNombreMateria() + ", Profesor: " + curso.getProfesorAsignado();
	}
	
	
	

}
