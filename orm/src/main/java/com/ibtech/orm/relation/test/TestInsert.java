package com.ibtech.orm.relation.test;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ibtech.orm.relation.entity.Player;
import com.ibtech.orm.relation.entity.Team;

public class TestInsert {
	public static void main(String[] args) {
		
		Team teamA = new Team(0,"Godoro Spor");
		teamA.setPlayerList(new ArrayList<Player>());
		
		Player player1 = new Player(0,"Ahmet çelik",17.8);
		player1.setTeam(teamA);
		teamA.getPlayerList().add(player1);
		
		Player player2 = new Player(0,"Mahsun çelik",7.8);
		player1.setTeam(teamA);
		teamA.getPlayerList().add(player2);
		
		Player player3 = new Player(0,"Erkan ocaklı",15.8);
		player1.setTeam(teamA);
		teamA.getPlayerList().add(player3);
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		manager.persist(teamA);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	
		System.out.println(teamA.getTeamId());
	}
}
