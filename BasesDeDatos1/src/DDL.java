import java.io.File;
import java.util.ArrayList;

public class DDL 
{
	public void createDatabase(String nombre)
	{
		File directorio = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" +nombre);
		boolean success = directorio.mkdir();
		if(success)
			System.out.println("Se ha creado la Base de Datos exitosamente");
		else
			System.out.println("Error al crear la Base de Datos");
	}
	
	public void showDatabases()
	{
		File folder = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos");
		File[] listOfDB = folder.listFiles();
		System.out.println("Bases de Datos actuales");
		
		for(int i = 0; i < listOfDB.length; i++)
		{
			if (listOfDB[i].isDirectory())
			{
				System.out.println("- " + listOfDB[i].getName());
			}
		}
	}
	
	public ArrayList<String> getNames()
	{
		File folder = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos");
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> nameOfFiles = new ArrayList<String>();
		for(int i = 0; i < listOfFiles.length; i++)
		{
			nameOfFiles.add(listOfFiles[i].getName());
		}
		return nameOfFiles;
	}
	
	public void alterDatabase(String oldName, String newName)
	{
		ArrayList<String> names = getNames();
		File oldDir = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + oldName);
		File newDir = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + newName);
		if(!names.contains(oldName))
		{
			System.out.println("La Base de Datos que intenta renombrar no existe");
		}
		else if(names.contains(newName) == true)
		{
			System.out.println("No se puede renombrar ya que existe una Base de Datos con ese nombre");	
		}  
		else if(oldDir.isDirectory())
		{
			oldDir.renameTo(newDir);
			System.out.println("listo, LLEGUE AQUI");
			showDatabases();
		}  
	}
	

	public String useDatabase(String nombre){
		ArrayList<String> names = getNames();
		String newDirectory = "";
		if(!names.contains(nombre)){ 
			System.out.println("La Base de Datos no existe");
			newDirectory = null;
		}
		else {
			newDirectory = ("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + nombre + "/");
		}
		System.out.println(newDirectory);
		return newDirectory;
	}
	
	public ArrayList<Column> crearColumnas(ArrayList<String> nombres, ArrayList<String> tipos)
	{
		ArrayList<Column> columnas = new ArrayList<Column>();
		Column nombresColumnas = new Column();
		if(nombres.size()==tipos.size())
		{
			for(int i=0; i<nombres.size(); i++)
			{
				nombresColumnas.setNombre(nombres.get(i));
				nombresColumnas.setTipo(tipos.get(i));
			}
			columnas.add(nombresColumnas);	
		}
		return columnas;
	}
	
	public Table crearTabla(String path, String nombre, ArrayList<Column> columnas) //FALTA ArrayList<Constraint> constraints
	{
		Table Tabla = new Table();
		File archivo = new File(path +nombre);
		if(!archivo.exists())
		{
			Tabla.setNombre(nombre);
			Tabla.setColumnas(columnas);
			//Tabla.setConstraints(constraints);
		}
		return Tabla;	
	}
	
	public void dropDatabase(String nombre)
	{
		File database = new File("C:/Users/Sophia/Documents/DBMS/Bases de Datos/" + nombre);
		File[] archivos = database.listFiles();
		for(int i = 0; i < archivos.length; i++)
		{
			if(archivos[i].isFile())
			{
				archivos[i].delete();
			}
		}
		database.delete();
		System.out.println("Se han borrado " + Integer.toString(archivos.length) + " exitosamente.\n Se ha eliminado la Base de Datos " + nombre + " exitosamente.");
	}
	
	
}
