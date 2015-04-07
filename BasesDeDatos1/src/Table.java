import java.util.ArrayList;


public class Table {
	
	private String nombre;
	private ArrayList<Column> columnas;
	private ArrayList<Constraint> constraints;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Column> getColumnas() {
		return columnas;
	}
	public void setColumnas(ArrayList<Column> columnas) {
		this.columnas = columnas;
	}
	
	public ArrayList<Constraint> getConstraints() {
		return constraints;
	}
	public void setConstraints(ArrayList<Constraint> constraints) {
		this.constraints = constraints;
	}
	

}
