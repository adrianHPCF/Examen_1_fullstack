package examen.fullstack.examen.model;

import jakarta.validation.constraints.NotNull;

public class ArtistaDTO {
	@NotNull
	Integer id;
	String Nombre;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public ArtistaDTO(Integer id, String nombre) {
		super();
		this.id = id;
		Nombre = nombre;
	}
	public ArtistaDTO() {
		super();
	}
	
}
