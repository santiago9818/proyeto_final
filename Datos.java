# proyeto_final
import java.io.Serializable;

public class Datos implements Serializable{
    // atributos
        private int id;
        private String nombre;
        private int cedula;
	private String carrera;
	private String jornada;
        private String semestre;
	public Datos vacio=null;
       
	// constructor
	public Datos(){}
	//constructor
	public Datos(int  id,String nombre ,int cedula, String carrera, String jornada,String semestre )
	{
            // instancias
                this.id=id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.carrera = carrera;
                this.jornada=jornada;
                this.semestre=semestre;
		
	}
// metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    

	
	
	// metodo para retornar el orden de la impresion 
	public String toString()
	{
		return  this.id + "," +  this.nombre  + ","
	        + this.cedula+ "," + this.carrera +  "," + 
                        this.jornada + ","  + this.semestre  + "\n";
	}
