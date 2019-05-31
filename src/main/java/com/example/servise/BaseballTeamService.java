package com.example.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.BaseballTeam;
import com.example.repository.BaseballTeamRepository;

/**
 * 野球チーム表示のservice.
 * 
 * @author koichi.nagata
 *
 */
@Service
@Transactional
public class BaseballTeamService {
	@Autowired
	private BaseballTeamRepository baseballteamRepository;

	/**
	 * リポジトリーでチームリスト取得の操作をする.
	 * 
	 * @return チーム名のリスト
	 */
	public List<BaseballTeam> showList() {
		List<BaseballTeam> teamList = baseballteamRepository.showList();
		return teamList;
	}

	/**
	 * リポジトリーでチーム詳細を取得の操作をする.
	 * @param teamName チーム名
	 * @return チーム詳細のリスト
	 */
	public BaseballTeam showDetail(String teamName) {
		BaseballTeam teamDetail = baseballteamRepository.showDetail(teamName);
		return teamDetail;
	}
}
