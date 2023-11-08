package examen.fullstack.examen.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.fullstack.examen.model.ArtistaDTO;
import examen.fullstack.examen.model.ObraDTO;
import examen.fullstack.examen.exceptions.CreacionObraException;

@Service
public class ObraServiceImp implements ObraService {
	ArrayList<ObraDTO> obras = new ArrayList<ObraDTO>();

	ObraDTO ar = new ObraDTO(1, "Titulo1", "hola soy la descripción uno", 1);

	ObraDTO ar2 = new ObraDTO(2, "Titulo2", "hola soy la descripción dos", 2);

	ObraDTO ar3 = new ObraDTO(3, "Titulo3", "hola soy la descripción tres", 1);

	ObraDTO ar4 = new ObraDTO(4,"Titulo4", "hola soy la descripción cuatro",3);
	public ObraServiceImp(){
		obras.add(ar);
	
		obras.add(ar2);
	
		obras.add(ar3);
	
		obras.add(ar4);
	}
	@Autowired//inyeccion de dependencia para poder usar el id del artista
	ArtistaService AS;
	@Override
	public ArrayList<ObraDTO> VerObras() {
		// TODO Auto-generated method stub
		return obras;
	}

	@Override
	public void CrearObra(ObraDTO obra) {
		ArtistaDTO a;
			a = AS.getArtistabyid(obra.getArtistid());
        if(obra.getArtistid() == a.getId()) {
            obras.add(obra);
        }
        else {
        	throw new CreacionObraException("el artista no esta comprendido entre la élite");

		
	}

}
}
