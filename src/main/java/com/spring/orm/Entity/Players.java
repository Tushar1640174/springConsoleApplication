package com.spring.orm.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="F_C_KIET")
public class Players 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int rollno;
	@Column(name="jersey_name")
private String name;
	@Column(name="farewell_year")
private String passoutyear;
	@Column(name="prefered_position")
private String position;
public Players(String name, String passoutyear, String position) {
	super();
	//this.rollno = rollno;
	this.name = name;
	this.passoutyear = passoutyear;
	this.position = position;
}
public Players() {
	
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassoutyear() {
	return passoutyear;
}
public void setPassoutyear(String passoutyear) {
	this.passoutyear = passoutyear;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "Players [rollno=" + rollno + ", name=" + name + ", passoutyear=" + passoutyear + ", position=" + position
			+ "]";
}


}
