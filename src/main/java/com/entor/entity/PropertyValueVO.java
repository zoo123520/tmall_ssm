package com.entor.entity;

public class PropertyValueVO {

	@Override
	public String toString() {
		return "PropertyValueVO [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
	private int id;
	private String name;
	private String value;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
