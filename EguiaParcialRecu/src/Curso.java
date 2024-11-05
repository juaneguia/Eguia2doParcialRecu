
public class Curso {
	
	private String nombreMateria;
	private String profesorAsignado;
	public Curso(String nombreMateria, String profesorAsignado) {
		super();
		this.nombreMateria = nombreMateria;
		this.profesorAsignado = profesorAsignado;
	}
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public String getProfesorAsignado() {
		return profesorAsignado;
	}
	public void setProfesorAsignado(String profesorAsignado) {
		this.profesorAsignado = profesorAsignado;
	}
	
	
	

}
