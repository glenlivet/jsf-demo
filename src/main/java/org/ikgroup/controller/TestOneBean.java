package org.ikgroup.controller;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;


@Named
@Scope("view")
public class TestOneBean implements Serializable {

	private static final long serialVersionUID = 1343182908627496962L;
	
	private String attr;

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}
	
	public void cmdTransfer(ActionEvent e){
		Flash f = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		f.put("attr", attr);
	}

}
