
public class Alumno {
	
	private String nombreAlumno;
	private int idAlumno;
	public Alumno(String nombreAlumno, int idAlumno) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.idAlumno = idAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	@Override
	public String toString() {
		return "Alumno: " + nombreAlumno + ", ID: " + idAlumno;
	}
	
	

}
