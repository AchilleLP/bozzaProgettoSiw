package it.uniroma3.validator;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import it.uniroma3.model.Opera;

public class ValidatorOpera {

	public boolean validate(HttpServletRequest request) {
		boolean valido;
		String titolo = request.getParameter("titolo");
		String tecnica = request.getParameter("tecnica");
		String dimensione = request.getParameter("dimensione");
		Opera nuovaOpera = (Opera) request.getAttribute("opera");
		String dataRealizzazione = request.getParameter("dataRealizzazione");
		valido = check(titolo) && check(tecnica) && check(dimensione) && check(dataRealizzazione);
		if(valido){
			nuovaOpera.setTitolo(titolo);
			nuovaOpera.setTecnica(tecnica);
			nuovaOpera.setDimensione(dimensione);
			nuovaOpera.setDataRealizzazione(Integer.parseInt(dataRealizzazione));
		}		
		return valido;
	}
	private boolean check(String s){
		return s!= null && !s.equals("");
	}

}
