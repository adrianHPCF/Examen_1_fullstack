package examen.fullstack.examen.controllers;
import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import examen.fullstack.examen.model.ObraDTO;
import examen.fullstack.examen.service.ObraService;


@RestController
@RequestMapping("/obras")
public class ObraRestController {
	@Autowired
	ObraService ObraService;
	
	public ObraRestController (ObraService servicio) {
		this.ObraService=servicio;
	}
	@GetMapping()
	public ResponseEntity<ArrayList<?>> VerObras(){
		ArrayList<ObraDTO> array = ObraService.VerObras();
		return ResponseEntity.ok(array);
	}
	@PostMapping()
	public ResponseEntity<ObraDTO> CrearObra(@RequestBody @Validated ObraDTO obraCreada){
		ObraService.CrearObra(obraCreada);
		URI a = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obraCreada.getId()).toUri(); 
		return ResponseEntity.created(a).build();	


	}
	
}
