package com.ibtech.orm.relation.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.ibtech.orm.Employee;
import com.ibtech.orm.relation.entity.Player;
import com.ibtech.orm.relation.entity.Team;

public class TestInsert2 {
	public static void main(String[] args) {
		
		long teamId = 1;

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		String jpql = "select p from Player p where p.team.teamId = :teamId";
		TypedQuery<Player> query = manager.createQuery(jpql, Player.class);
		query.setParameter("teamId", teamId);
		
		List<Player> players = query.getResultList();
	
		manager.close();
		factory.close();
		
		for(Player player: players) {
			System.out.println(player.getPlayerId()+" "
					+player.getPlayerName()+" "
					+player.getAverageScore());
		}
	}
}
