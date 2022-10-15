/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import proyecto.Cliente;

// line 8 "clases.ump"
public class Medidor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Medidor Attributes
  private String marca;
  private String direccion;
  private BigDecimal costo;

  //Medidor Associations
  private Cliente cliente;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Medidor(String aMarca, String aDireccion, BigDecimal aCosto, Cliente aCliente)
  {
    marca = aMarca;
    direccion = aDireccion;
    costo = aCosto;
    boolean didAddCliente = setCliente(aCliente);
    if (!didAddCliente)
    {
      throw new RuntimeException("Unable to create medidor due to cliente. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMarca(String aMarca)
  {
    boolean wasSet = false;
    marca = aMarca;
    wasSet = true;
    return wasSet;
  }

  public boolean setDireccion(String aDireccion)
  {
    boolean wasSet = false;
    direccion = aDireccion;
    wasSet = true;
    return wasSet;
  }

  public boolean setCosto(BigDecimal aCosto)
  {
    boolean wasSet = false;
    costo = aCosto;
    wasSet = true;
    return wasSet;
  }

  public String getMarca()
  {
    return marca;
  }

  public String getDireccion()
  {
    return direccion;
  }

  public BigDecimal getCosto()
  {
    return costo;
  }
  /* Code from template association_GetOne */
  public Cliente getCliente()
  {
    return cliente;
  }
  /* Code from template association_SetOneToMany */
  public boolean setCliente(Cliente aCliente)
  {
    boolean wasSet = false;
    if (aCliente == null)
    {
      return wasSet;
    }

    Cliente existingCliente = cliente;
    cliente = aCliente;
    if (existingCliente != null && !existingCliente.equals(aCliente))
    {
      existingCliente.removeMedidor(this);
    }
    cliente.addMedidor(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Cliente placeholderCliente = cliente;
    this.cliente = null;
    if(placeholderCliente != null)
    {
      placeholderCliente.removeMedidor(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "marca" + ":" + getMarca()+ "," +
            "direccion" + ":" + getDireccion()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "costo" + "=" + (getCosto() != null ? !getCosto().equals(this)  ? getCosto().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cliente = "+(getCliente()!=null?Integer.toHexString(System.identityHashCode(getCliente())):"null");
  }
}