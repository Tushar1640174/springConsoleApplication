package com.spring.orm.Service;

import com.spring.orm.Entity.Players;

public interface PlayersServiceDAO 
{
	public int insert(Players player);
	public void remove(int rollno);
	public void update(int rollno, String name);
	public Players getinfo(int rollno);
}
