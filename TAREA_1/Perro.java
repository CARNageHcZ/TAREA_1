/**
 * El perro jajaja
 * 
 * @author CARNageHcZ
 * @version 1.0.0
 */
import java.util.Scanner;
public class Perro
{
    /**
     * los atributos
     */
  private String nombre;
  private String tamanio;
  private int edad;
  private String raza;
     
  public Perro(String nombre, String tamanio, int edad, String raza)
  {
      this.nombre = nombre;
      this.tamanio = tamanio;
      this.edad = edad;
      this.raza = raza;
  }
  public Perro()
  {
      nombre = "Osvaldo";
      tamanio = "chiquito";
      edad = 7;
      raza = "autobot";
  }
  public String saludar()
  {
      String Guauf;
      
      Guauf = "Hola mundo";
      return Guauf;
  }
  public void LevantarCola(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
    boolean EstaFeliz;
    
    System.out.println("El perro está feliz  (escribe true o false)");
    EstaFeliz = entrada.nextBoolean();
    
    if(EstaFeliz==true)
    {
        System.out.println("El perro ha levantado la cola"); 
    }
    else
    {
        System.out.println("El perro no ha levantado la cola");
        
    }
    
  }
  
  
  public String getNombre()
  {
      return nombre;
  }
  public String getTamanio()
  {
      return tamanio;
  }
  public int getEdad()
  {
      return edad;
  }
   public String getRaza()
  {
      return raza;
  }
  
  
  public void setNombre(String nombre)
  {
     this.nombre = nombre;   
  }
  public void setTamanio(String tamanio)
  {
      this.nombre = tamanio;
  }
  public void setEdad(int edad)
  {
      this.edad = edad;
  }
  public void setRaza(String raza)
  {
     this.raza = raza;
  }
  
}