package com.ibtech.orm.relation.example;

import com.ibtech.orm.relation.entity.Player;
import com.ibtech.orm.relation.repository.PlayerRepository;

public class PlayerFind {
	public static void main(String[] args) {
		long playerId = 1;
		PlayerRepository playerRepository = new PlayerRepository();
		
		Player player = playerRepository.find(playerId);
		
		System.out.println(player.getPlayerId()+" "
				+player.getPlayerName()+" "
				+player.getAverageScore()+" "
				+player.getTeam().getTeamName());
	}
}
