package ef.danielatoche.service;

import java.util.List;

import ef.danielatoche.dto.HospedajeDTO;


public interface HospedajeService {

	
	List<HospedajeDTO> listar();
	HospedajeDTO obtenerporId(Integer id);
	void guardar(HospedajeDTO a);
	void eliminar(Integer id);
	void actualizar(HospedajeDTO alumno);
}
