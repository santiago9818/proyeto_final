# proyeto_final
public class proyectos 
{
    //atributos
    private int id;
    private String nombrepro;
    private String descripcion;
    private int calificacion;
    private String observaciones;
    public proyectos vacio=null;
    //constructores
    public proyectos(){}
    public proyectos(int id, String nombrepro,String descripcion,int calificacion,String observaciones)
    {//instancias
       this.id= id;
       this.nombrepro=nombrepro;
       this.descripcion=descripcion;
       this.calificacion=calificacion;
       this.observaciones=observaciones;
    }
    //metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    // metodo para retornar el orden de ls datos
       public String mensaje()
	{
		return  this.id + "," +  this.nombrepro  + ","
	        + this.descripcion +  "," + this.calificacion +  "," + 
                        this.observaciones+  "\n";
	}     
    
}
