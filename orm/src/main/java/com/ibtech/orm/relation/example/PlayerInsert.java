package com.ibtech.orm.relation.example;

import com.ibtech.orm.relation.entity.Player;
import com.ibtech.orm.relation.repository.BaseRepository;
import com.ibtech.orm.relation.repository.PlayerRepository;

public class PlayerInsert {
	public static void main(String[] args) {
		Player player = new Player(0,"okan ünlü",26.8);
		PlayerRepository playerRepository = new PlayerRepository();
		
		playerRepository.insert(player);
		
		System.out.println(player.getPlayerId());
		
		
	}
}
