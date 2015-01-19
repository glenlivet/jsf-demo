package org.ikgroup.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class HelloBean implements Serializable {
	
	private static final long serialVersionUID = 8587749574409590389L;
	
	private String name = "test single page solution!";
	
	private List<String> pages = new ArrayList<String>();
	
	private String curPage = "/test1.xhtml";
	
	@PostConstruct
	public void init(){
		String p1 = "/test1.xhtml";
		String p2 = "/test2.xhtml";
		pages.add(p1);
		pages.add(p2);
	}
	
	/**
	 * 
	 * 
	 * @param e
	 */
//	public void enablePage(ActionEvent e){
//		curPage = (String) e.getComponent().getAttributes().get("page");
//	}

	public String getName() {
		return name;
	}
	
	public String getCurPage() {
		return curPage;
	}

	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}

	public List<String> getPages() {
		return pages;
	}

	public void setPages(List<String> pages) {
		this.pages = pages;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
