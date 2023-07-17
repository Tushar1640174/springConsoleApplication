package com.spring.orm.Service;

import com.spring.orm.Dao.PlayersDaoImpl;
import com.spring.orm.Entity.Players;

public class PlayersServiceDaoIMPL implements PlayersServiceDAO {

	private PlayersDaoImpl playersDaoIMPL;
	
	public PlayersDaoImpl getPlayersDaoIMPL() {
		return playersDaoIMPL;
	}

	public void setPlayersDaoIMPL(PlayersDaoImpl playersDaoIMPL) {
		this.playersDaoIMPL = playersDaoIMPL;
	}

	public int insert(Players player) {
		
		int i=playersDaoIMPL.insert(player);
		return i;
	}

	public void remove(int rollno) {
		// TODO Auto-generated method stub

	}

	public void update(int rollno, String name) {
		// TODO Auto-generated method stub

	}

	public Players getinfo(int rollno) {
		// TODO Auto-generated method stub
		return null;
	}

}
