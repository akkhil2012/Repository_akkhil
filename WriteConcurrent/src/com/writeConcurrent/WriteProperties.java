package com.writeConcurrent;

import java.io.Serializable;

public class WriteProperties implements Serializable{
	
	String name;
	int id;
	
	
	WriteProperties(String name, int id){
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	public String toString(){
		return "Thread name is: "+name;
	}
	
	
	
	
	
	
	
	
	
}
