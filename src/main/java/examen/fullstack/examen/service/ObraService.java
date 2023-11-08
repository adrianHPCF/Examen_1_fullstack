package examen.fullstack.examen.service;

import java.util.ArrayList;

import examen.fullstack.examen.model.ObraDTO;

public interface ObraService {
	ArrayList <ObraDTO> VerObras();
	void CrearObra(ObraDTO obra);
	
	
	
}
