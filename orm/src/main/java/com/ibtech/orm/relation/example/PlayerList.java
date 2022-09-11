package com.ibtech.orm.relation.example;

import java.util.List;

import com.ibtech.orm.relation.entity.Player;
import com.ibtech.orm.relation.repository.BaseRepository;
import com.ibtech.orm.relation.repository.PlayerRepository;

public class PlayerList {
	public static void main(String[] args) {

		PlayerRepository playerRepository = new PlayerRepository();
		
		List<Player> playerList = playerRepository.getList();
		
		for(Player player : playerList) {
			System.out.println(player.getPlayerId()+" "
					+player.getPlayerName()+" "
					+player.getAverageScore());
		}
		
	}
}
