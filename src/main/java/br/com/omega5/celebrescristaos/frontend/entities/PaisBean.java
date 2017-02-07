package br.com.omega5.celebrescristaos.frontend.entities;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.omega5.celebrescristaos.backend.entities.Pais;

@ManagedBean
@ViewScoped
public class PaisBean {

	public List<Pais> getPaisList() {
		List<Pais> lista = daoCurso.listar();
		return lista;
	}
}
