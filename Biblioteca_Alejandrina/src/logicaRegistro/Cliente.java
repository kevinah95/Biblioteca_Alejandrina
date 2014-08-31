package logicaRegistro;

import java.util.*;

public class Cliente extends Registro{
	
	/*
	 * Esta clase recibe los par�metros necesarios para la creaci�n de 
	 * un usuario nuevo de la biblioteca.
	 * Cada usuario tiene dos identificadores fundamentales:
	 * -El n�mero de usuario (definido con cant. clientes)
	 * -El tipo de usuario, que es 1, 2 o 3.
	 */
	
	//Constructor para clientes nuevos. 
	public Cliente(String nNombre,
							String nApellido1,
							String nApellido2,
							String nTelefono,
							String nCorreo,
							String nCategoria)
							
	{	cantClientes++;
		setPrestamos(new ArrayList<Articulo>());
		setIdentificadorCliente(cantClientes);
		setNombre(nNombre);
		setApellido1(nApellido1);
		setApellido2(nApellido2);
		setTelefono(nTelefono);
		setCorreo(nCorreo);
		setCategoria(nCategoria);	}
	
	//Setters y Getters.------------------------------------------------------//
	public int getCantClientes() {return cantClientes;} //El equivalente al largo de la lista
	public int getIdentificadorCliente() {return identificadorCliente;}
	public void setIdentificadorCliente(int identificadorCliente) {this.identificadorCliente = identificadorCliente;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getApellido1() {return apellido1;}
	public void setApellido1(String apellido1) {this.apellido1 = apellido1;}
	public String getApellido2() {return apellido2;}
	public void setApellido2(String apellido2) {this.apellido2 = apellido2;}
	public String getTelefono() {return telefono;}
	public void setTelefono(String telefono) {this.telefono = telefono;}
	public String getCorreo() {return correo;}
	public void setCorreo(String correo) {this.correo = correo;}
	public String getCategoria() {return categoria;}	
	public void setCategoria(String categoria) {this.categoria = categoria;}
	public ArrayList<Articulo> getPrestamos() {return prestamos;}
	public void setPrestamos(ArrayList<Articulo> prestamos) {this.prestamos = prestamos;}
	//------------------------------------------------------------------------//
	public String presentarCategoria(){
		if ("1".equals(getCategoria())){return "Estudiante";}
		else if ("2".equals(getCategoria())){return "Colega";}
		else if ("3".equals(getCategoria())){return "Familiar";}
		else {return "Categor�a Desconocida";}}
	
	public void prestar (Articulo prestamo){
		prestamo.setPrestado(true);
		prestamos.add(prestamo);
	}
	
	public String toString (){
		String msj = "Cliente "+getIdentificadorCliente()+":\n";
		msj += "Nombre: " + getNombre()+" "+getApellido1()+" "+getApellido2()+"\n";
		msj += "Tel�fono: "+ getTelefono()+"\n";
		msj += "Correo: "+getCorreo()+"\n";
		msj += "Categoria: "+presentarCategoria()+"\n";
		if (prestamos.size() != 0){
			msj += "   Objetos prestados: \n";
			for (Articulo prestado : prestamos) {
				msj += prestado;}}
		return msj;
	
	}
}
