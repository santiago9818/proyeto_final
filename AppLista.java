# proyeto_final
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class AppLista
{
//constructores de la clase
  public  boolean encontrado=false;
  public  ArrayList <Datos>  estudiantes = new ArrayList<Datos>();// crear la lista
  public  ArrayList <proyectos>  propuestas = new ArrayList<proyectos>();// crear la lista
  public String archivodatos;// crea una variable de tipo String que guarda el archivo
  public String archivopropuestas;// crea una variable de tipo String que guarda el archivo
  
 public static void main(String[] args) throws FileNotFoundException, IOException 
 {
     
     Datos temporal=new Datos();//objeto de la clase datos
     proyectos temporalpro=new proyectos();//objeto de la clase datos
     AppLista prub=new AppLista();// objeto de la clase
    
     prub.leerdatos();// 
     prub.leerpropuestas();
     prub.mostrardatos();
     prub.mostrarpropuestas();
     prub.archivodatos="datosestudiantes.txt";
     prub.archivopropuestas="datosproyectos.txt";
     Scanner Leer=new Scanner(System.in);// objeto de la clase Scanner
     
    int opcion=1;// variable entera para el menu
    while (opcion !=0)// el ciclo se ejecuta mientras el usuario no dijita 0
    {
     System.out.println("Menu Principal \n 1. Añadir Datos Del Estudiante Al Final \n2. Imprimir Lista De Estudiantes \n3. Editar La Informacion De Un Estudiante Por Su ID \n4. Eliminar Un Estudiante Por Su ID"
    + "\n5. Que Estudiante Desea Buscar \n 6.Añadir propuestas de grado \n 7.Eliminar propuestas de grado \n 8.Evaluar propuestas de grado \n 9.Lista de propuestas de grado \n0. Salir \n Digite la Opcion");// opciones del menu
     opcion = Leer.nextInt();// instruccion para pedir los datos del menu
     switch(opcion)// cambie dependiendo la opcion
     {
       case 1:// ingresar los datos al final 
       prub.adicionarestudiante();
       prub.exportararhivo(prub.archivodatos);
       prub.mostrardatos();
      
      
     break;// fin del caso1
      case 2:// impresion de la lista
      System.out.println("");
      System.out.println("Lista de estudiantes \n");// mensaje
      prub.mostrardatos();
              
      
      break;// fin  del caso2
      case 3://informacion del estudiante para actualizar
       System.out.println("");
       System.out.print("ingrese el ID del estudiante que quiere actualizar");//mensaje
       int Idestudiante= Leer.nextInt();// instruccion para poder digitar cual dato quiere cambiar
       prub.encontrado=false;
      if(prub.editarestudiante(Idestudiante)==true)
      {
        prub.mostrardatos();
        prub.exportararhivo(prub.archivodatos);
      }
      break;// fin caso3
       case 4:// eliminar registro
	System.out.println("");
	System.out.print("ingrese el ID  del estudiante que quiere eliminar");//mensaje
	int idestudiante = Leer.nextInt();// instruccion para eliminar el dato
	 
	System.out.println("");
        System.out.println("Eliminar informacion del estudiante \n"); //mensaje
        if (prub.eliminarestudiante(idestudiante)== true)
        {
         prub.mostrardatos();
         prub.exportararhivo(prub.archivodatos);
        }
	break;//fin caso4
        case 5:// registro de estudiante a buscar
            System.out.println("");
            System.out.println(" que estudiante desea buscar \n");// mensaje
            System.out.println("Digite el ID del estudiante que desea buscar");// mensaje 
             idestudiante=Leer.nextInt();// instruccion para digitar el dato a busar 
            System.out.println("la informacion de los   estudiante  /n");// mensaje 
           prub.buscarestudiante(idestudiante);
        break;// fin caso5*/

        
        case 6:// ingresar los datos al final 
       prub.adicionarpropuesta();
       prub.exportarpropuestas(prub.archivopropuestas);
       prub.mostrarpropuestas();
       break;// fin del caso6
       
       case 7:// eliminar registro
	System.out.println("");
	System.out.print("ingrese el ID  del estudiante que desea eliminar las propuestas");//mensaje
	idestudiante = Leer.nextInt();// instruccion para eliminar el dato
	 
	System.out.println("");
        System.out.println("Eliminar propuestas del estudiante \n"); //mensaje
        if (prub.eliminarpropuesta(idestudiante)== true)
        {
         prub.mostrarpropuestas();
         prub.exportarpropuestas(prub.archivopropuestas);
        }
	break;//fin caso7

       case 8://informacion del estudiante para actualizar
       System.out.println("");
       System.out.print("ingrese el ID del estudiante que desea evaluar");//mensaje
       Idestudiante= Leer.nextInt();// instruccion para poder digitar cual dato quiere cambiar
       prub.encontrado=false;
      if(prub.editarpropuesta(Idestudiante)==true)
      {
        prub.mostrarpropuestas();
        prub.exportarpropuestas(prub.archivopropuestas);
      }
      break;// fin caso8

 case 9:// impresion de la lista
      System.out.println("");
      System.out.println("Lista de propuestas\n");// mensaje
      prub.mostrarpropuestas();

            
                      
      break;// fin  del caso2
     
     }//fin switch
    }//fin while
 }
 //fin main
    
public void leerdatos()// metodo para leer los datos de los estudiantes 
 {
   String archivoTexto="datosestudiantes.txt";// inicializacion de  variable String odnde se garda lo que esta en el archivo
      File archivo= new File(archivoTexto);
      try//intente
      {
       FileReader archivoimportar=new FileReader(archivoTexto); //crear un objeto de la clase fileReader para leer el archivo 
       BufferedReader bufer=new BufferedReader(archivoimportar); // objeto de la clase buffer que lee el archivo generado
       String linea="";// inicializacion de String
       boolean termina= false;// declaracion variable boolean
       while(termina==false)// ciclo para recorrer todas las lineas del archivo
       {
        linea = bufer.readLine();// se iguala linea para leer todas las lineas del archivo
        if(linea==null)// condicional si linea es igual a vacio termina proedimiento 
        {
         termina=true;  // la variable pasa a verdadero
        }
        else// sino esta vacia
        {
         String[] campo=linea.split(",");// guarde en un vector todo lo que esta antes de la coma en una posicion
         estudiantes.add(new Datos(Integer.parseInt(campo[0]),campo[1],Integer.parseInt(campo[2]),campo[3],campo[4],campo[5]));// guardar los datos a la lista 
        }
        
      }
      
          
      }catch(Exception e)// capture
      {
          System.out.println("Arhivo No Encontrado");// impresion si no encuentra el archivo
      } 
      
 }

public void leerpropuestas()// metodo para leeer las propuestas de trabajo
 {
   String archivoTexto="datosproyectos.txt";// inicializacion de  variable String odnde se garda lo que esta en el archivo
      File archivo= new File(archivoTexto);
      try//intente
      {
       FileReader archivoimportar=new FileReader(archivoTexto); //crear un objeto de la clase fileReader para leer el archivo 
       BufferedReader bufer1=new BufferedReader(archivoimportar); // objeto de la clase buffer que lee el archivo generado
       String linea="";// inicializacion de String
       boolean termina= false;// declaracion variable boolean
       while(termina==false)// ciclo para recorrer todas las lineas del archivo
       {
        linea = bufer1.readLine();// se iguala linea para leer todas las lineas del archivo
        if(linea==null)// condicional si linea es igual a vacio termina proedimiento 
        {
         termina=true;  // la variable pasa a verdadero
        }
        else// sino esta vacia
        {
         String[] campo=linea.split(",");// guarde en un vector todo lo que esta antes de la coma en una posicion
         propuestas.add(new proyectos(Integer.parseInt(campo[0]),campo[1],campo[2],Integer.parseInt(campo[3]),campo[4]));// guardar los datos a la lista 
        }
        
        
      }
      
          
      }catch(Exception e)// capture
      {
          System.out.println("Arhivo de propuestas No Encontrado");// impresion si no encuentra el archivo
      } 
      
 }

public void mostrardatos()// metodo que muestra lo que esta en la lista
      {
        for(int i=0;i<estudiantes.size();i++)// ciclo para mistrar los datos de la lista
       {
        System.out.println("ID: " + estudiantes.get(i).toString());// impresion de los datos de la lista 
       }   
      }
public void exportararhivo(String nombrearchivo) throws FileNotFoundException, IOException// mtodo para guardar en el arhivo lo que se ejecute
{
    Datos temporal = new Datos();
    File archivo= new File(nombrearchivo);
   FileOutputStream salida =new FileOutputStream(archivo); 
   
     
      if (!(archivo.exists()))
      {
          archivo.createNewFile();
      }
      for(int i=0;i<estudiantes.size();i++)
      {
          temporal.vacio= estudiantes.get(i);
          byte[] datoSalida=temporal.vacio.toString().getBytes();
          salida.write(datoSalida);
      }
      salida.flush();
      salida.close();
      
}
 public void adicionarestudiante()// metodo para agregar nueva informacion de estudiante
 {
     Datos temporal=new Datos();
     Scanner Leer=new Scanner(System.in);
     System.out.println("Ingrese los datos del Estudiante: ");//mensaje
      // pide los datos al usuario
           System.out.println("ID");
           temporal.setId(Leer.nextInt());
       System.out.println("cedula");
       temporal.setCedula(Leer.nextInt());
       System.out.print("semestre ");
       temporal.setSemestre(Leer.next());
       System.out.print("Nombre ");
       temporal.setNombre(Leer.next());
       System.out.print("jornada ");
       temporal.setJornada(Leer.next());
       System.out.print("carrera ");
       temporal.setCarrera(Leer.next());
      estudiantes.add(new Datos(temporal.getId(),temporal.getNombre(),temporal.getCedula(),// guarda los datos en la lista 
      temporal.getCarrera(),temporal.getJornada() ,temporal.getSemestre() ));
      System.out.println("");
      System.out.println("Añadir estudiante al final \n");// mensaje
    
 }
  public boolean editarestudiante(int idestudiante)//edita el registro de algun estudiante 
  {   
       Datos temporal=new Datos();
     Scanner Leer=new Scanner(System.in);
     
       int i=0,Iencontrado=0;
       boolean encontrado=false;
       while(encontrado==false&&i<estudiantes.size())
       {
          if(estudiantes.get(i).getId()== idestudiante)
          {
           encontrado=true;
           Iencontrado=i;
          }
          i++;
          
       }
          if(encontrado==false)
          {
              System.out.println("el ID  no se encontro");
          }
          else
          {
       System.out.println("Ingrese los datos del estudiante: ");// ingresar los nuevos datos del estudiante 
              System.out.println(idestudiante);
       System.out.println("cedula");// mensaje
       temporal.setCedula(Leer.nextInt());//instruccion
       System.out.print("semestre ");//mensaje
       temporal.setSemestre(Leer.next());//instruccion
       System.out.print("Nombre ");//mensaje
       temporal.setNombre(Leer.next());//instruccion
       System.out.print("jornada ");//mensaje
	temporal.setJornada(Leer.next());//instruccion
	System.out.print("carrera ");//mensaje
        temporal.setCarrera(Leer.next());//instruccion
	estudiantes.set(Iencontrado,new Datos(idestudiante,temporal.getNombre(),temporal.getCedula(),
        temporal.getCarrera(),temporal.getJornada() ,temporal.getSemestre() ));// guardar en la lista la informacion actualizada
        System.out.println("");
	System.out.println("Actualizacion de estudiante \n");//mensaje
        
      
     }
          return encontrado; 
  }
  public boolean eliminarestudiante(int idestudiante)// elimina el registro de algun estudiante
  {
    
  boolean encontrado= false;
     
       int i=0,Iencontrado=0;
       while(encontrado==false&&i<estudiantes.size())
       {
          if(estudiantes.get(i).getId()== idestudiante)
          {
           encontrado=true;
           Iencontrado=i;
          
          }
          i++;
          
       }
       
          if(encontrado==false)
          {
              System.out.println("el ID  no se encontro");
          } 
          else
          {
               estudiantes.remove(Iencontrado);
          }
       
       return encontrado;
  }
  public boolean buscarestudiante(int idestudiante)// busca la informacion de algun estudiante
  {
      int i=0;
      boolean encontrado=false;
       while(i<estudiantes.size())
       {
          if(estudiantes.get(i).getId()== idestudiante)
          {
           encontrado=true;
              System.out.println(estudiantes.get(i).toString());
          
          }
          i++;
          
       }
       
          if(encontrado==false)
          {
              System.out.println("el ID  no se encontro");
          } 
          
       
       return encontrado;
  }
  

 
 public void mostrarpropuestas()
      {
        for(int i=0;i<propuestas.size();i++)// ciclo para mistrar los datos de la lista
       {
        System.out.println("ID: " + propuestas.get(i).mensaje());// impresion de los datos de la lista 
       }   
      }
public void exportarpropuestas(String nombrearchivo) throws FileNotFoundException, IOException// exportar al archivo
{
    proyectos temporal = new proyectos();
    File archivo= new File(nombrearchivo);
   FileOutputStream salida =new FileOutputStream(archivo); 
   
     
      if (!(archivo.exists()))
      {
          archivo.createNewFile();
      }
      for(int i=0;i<propuestas.size();i++)
      {
          temporal.vacio= propuestas.get(i);
          System.out.println(temporal.vacio.mensaje());
          byte[] datoSalida=temporal.vacio.mensaje().getBytes();
          salida.write(datoSalida);
      }
      salida.flush();
      salida.close();
      
}
 
public void adicionarpropuesta()// adiciona en la ultima posicion de la lista una nueva propuesta
 {
     proyectos temporal=new proyectos();
     Scanner Leer=new Scanner(System.in);
     System.out.println("Ingrese los datos de la propuesta: ");//mensaje
      // pide los datos al usuario
           System.out.println("ID");
           temporal.setId(Leer.nextInt());
       System.out.println("nombre de la propuesta");
       temporal.setNombrepro(Leer.next());
       System.out.print("Descripcion de la propuesta  ");
       temporal.setDescripcion(Leer.next());
       temporal.setCalificacion(0);
       temporal.setObservaciones("Pendiente evaluacion");
      
      propuestas.add(new proyectos(temporal.getId(),temporal.getNombrepro(),temporal.getDescripcion(),
      temporal.getCalificacion(),temporal.getObservaciones()));
      System.out.println("");
      System.out.println("Añadir propuesta al final \n");// mensaje
    
 }

public boolean eliminarpropuesta(int idestudiante)// elimina alguna propuesta de la lista
  {
    
  boolean encontrado= false;
     
       int i=0,Iencontrado=0;
       while(encontrado==false&&i<propuestas.size())
       {
          if(propuestas.get(i).getId()== idestudiante)
          {
           encontrado=true;
           Iencontrado=i;
          
          }
          i++;
          
       }
       
          if(encontrado==false)
          {
              System.out.println("el ID  no se encontro");
          } 
          else
          {
               propuestas.remove(Iencontrado);
          }
       
       return encontrado;
  }

public boolean editarpropuesta(int idestudiante)// edita algun dato de las propuestas
  {   
     Scanner Leer=new Scanner(System.in);
     proyectos temporal= new proyectos();
       int i=0,Iencontrado=0;
       boolean encontrado=false;
       while(encontrado==false&&i<propuestas.size())
       {
          if(propuestas.get(i).getId()== idestudiante)
          {
            if (propuestas.get(i).getCalificacion()==0)
            {
             encontrado=true;
             Iencontrado=i;
            }
       
           }
          i++;
       }
       System.out.println("termina");  
          if(encontrado==false)
          {
              System.out.println("el ID  no tiene propuestas para evaluar");
          }
          else
          {
       System.out.println("Ingrese los datos del estudiante: ");// ingresar los nuevos datos del estudiante 
              System.out.println(idestudiante);
       temporal.setId(idestudiante);
       System.out.println("nombre de la propuesta");
       temporal.setNombrepro(propuestas.get(Iencontrado).getNombrepro());
              System.out.println(temporal.getNombrepro());
       System.out.print("Descripcion de la propuesta  ");
       temporal.setDescripcion(propuestas.get(Iencontrado).getDescripcion());
              System.out.println(temporal.getDescripcion());
       System.out.print("calificacion  ");
       temporal.setCalificacion(Leer.nextInt());
       System.out.print("observaciones ");
       temporal.setObservaciones(Leer.next());
      
      propuestas.set(Iencontrado,new proyectos(temporal.getId(),temporal.getNombrepro(),temporal.getDescripcion(),
      temporal.getCalificacion(),temporal.getObservaciones()));// guardar en la lista la informacion actualizada
        System.out.println("");
	System.out.println("Actualizacion de propuestas \n");//mensaje
        
      
     }
          return encontrado; 
  }
  
}
