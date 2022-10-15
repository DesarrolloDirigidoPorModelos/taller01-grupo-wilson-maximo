/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 1 "clases.ump"
public class Cliente
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Cliente Attributes
  private String identificacion;
  private String nombres;

  //Cliente Associations
  private List<Medidor> medidors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cliente(String aIdentificacion, String aNombres)
  {
    identificacion = aIdentificacion;
    nombres = aNombres;
    medidors = new ArrayList<Medidor>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIdentificacion(String aIdentificacion)
  {
    boolean wasSet = false;
    identificacion = aIdentificacion;
    wasSet = true;
    return wasSet;
  }

  public boolean setNombres(String aNombres)
  {
    boolean wasSet = false;
    nombres = aNombres;
    wasSet = true;
    return wasSet;
  }

  public String getIdentificacion()
  {
    return identificacion;
  }

  public String getNombres()
  {
    return nombres;
  }
  /* Code from template association_GetMany */
  public Medidor getMedidor(int index)
  {
    Medidor aMedidor = medidors.get(index);
    return aMedidor;
  }

  public List<Medidor> getMedidors()
  {
    List<Medidor> newMedidors = Collections.unmodifiableList(medidors);
    return newMedidors;
  }

  public int numberOfMedidors()
  {
    int number = medidors.size();
    return number;
  }

  public boolean hasMedidors()
  {
    boolean has = medidors.size() > 0;
    return has;
  }

  public int indexOfMedidor(Medidor aMedidor)
  {
    int index = medidors.indexOf(aMedidor);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMedidors()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Medidor addMedidor(String aMarca, String aDireccion, double aCosto)
  {
    return new Medidor(aMarca, aDireccion, aCosto, this);
  }

  public boolean addMedidor(Medidor aMedidor)
  {
    boolean wasAdded = false;
    if (medidors.contains(aMedidor)) { return false; }
    Cliente existingCliente = aMedidor.getCliente();
    boolean isNewCliente = existingCliente != null && !this.equals(existingCliente);
    if (isNewCliente)
    {
      aMedidor.setCliente(this);
    }
    else
    {
      medidors.add(aMedidor);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMedidor(Medidor aMedidor)
  {
    boolean wasRemoved = false;
    //Unable to remove aMedidor, as it must always have a cliente
    if (!this.equals(aMedidor.getCliente()))
    {
      medidors.remove(aMedidor);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMedidorAt(Medidor aMedidor, int index)
  {  
    boolean wasAdded = false;
    if(addMedidor(aMedidor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMedidors()) { index = numberOfMedidors() - 1; }
      medidors.remove(aMedidor);
      medidors.add(index, aMedidor);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMedidorAt(Medidor aMedidor, int index)
  {
    boolean wasAdded = false;
    if(medidors.contains(aMedidor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMedidors()) { index = numberOfMedidors() - 1; }
      medidors.remove(aMedidor);
      medidors.add(index, aMedidor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMedidorAt(aMedidor, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=medidors.size(); i > 0; i--)
    {
      Medidor aMedidor = medidors.get(i - 1);
      aMedidor.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "identificacion" + ":" + getIdentificacion()+ "," +
            "nombres" + ":" + getNombres()+ "]";
  }
}