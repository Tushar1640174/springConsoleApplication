package com.spring.orm.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.orm.Entity.Players;


@Repository
@Component
public class PlayersDaoImpl implements PlayersDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	public HibernateTemplate getHtemplate() {
		return hibernateTemplate;
	}

	public void setHtemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
	//Inserting new Player
	@Transactional
	public int insert(Players player) {
		int i=(Integer) hibernateTemplate.save(player);
		return i;
	}
	
	//Removing existing player
   @Transactional
	public void remove(int rollno) 
	{
		Players p=this.hibernateTemplate.get(Players.class, rollno);
		this.hibernateTemplate.delete(p);
		System.out.println("Your registration is now removed");
	}
   
   
   //Updating Name for player
    @Transactional
	public void update(int rollno,String name) 
	{
		Players p=this.hibernateTemplate.get(Players.class, rollno);
		p.setName(name);
	   System.out.println("Name is now updated");
	}

    
    //Checking if player already exist
	public Players getinfo(int rollno)
	{
		Players p=this.hibernateTemplate.get(Players.class, rollno);
		return p;
	}

}
