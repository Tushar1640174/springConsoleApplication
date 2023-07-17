package com.spring.orm.Dao;

import com.spring.orm.Entity.Players;

public interface PlayersDao

{
public int insert(Players player);
public void remove(int rollno);
public void update(int rollno, String name);
public Players getinfo(int rollno);

}
