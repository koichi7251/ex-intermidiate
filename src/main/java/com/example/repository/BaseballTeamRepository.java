package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.BaseballTeam;

/**
 * 野球チーム表示のrepository.
 * 
 * @author koichi.nagata
 *
 */
@Repository
public class BaseballTeamRepository {
	/** BaseballTeamのローマッパー */
	public static final RowMapper<BaseballTeam> BASEBALLTEAM_ROW_MAPPER = (rs, i) -> {
		BaseballTeam baseballTeam = new BaseballTeam();
		baseballTeam.setId(rs.getInt("id"));
		baseballTeam.setLeagueName(rs.getString("league_name"));
		baseballTeam.setTeamName(rs.getString("team_name"));
		baseballTeam.setHeadquarters(rs.getString("headquarters"));
		baseballTeam.setInauguration(rs.getString("inauguration"));
		baseballTeam.setHistory(rs.getString("history"));
		return baseballTeam;
	};

	@Autowired
	private NamedParameterJdbcTemplate template;

	/**
	 * チーム名一覧を取得する.
	 * 
	 * @return チームリスト
	 */
	public List<BaseballTeam> showList() {
		String sql = "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams ORDER BY inauguration";
		List<BaseballTeam> teamList = template.query(sql, BASEBALLTEAM_ROW_MAPPER);
		return teamList;
	}

	/**
	 * チーム詳細を取得する.
	 * 
	 * @param teamName チーム名
	 * @return チーム情報
	 */
	public BaseballTeam showDetail(String teamName) {
		String sql = "SELECT id,league_name, team_name, headquarters, inauguration, history FROM teams where team_name = :teamName";
		SqlParameterSource param = new MapSqlParameterSource().addValue("teamName", teamName);

		BaseballTeam team = template.queryForObject(sql, param, BASEBALLTEAM_ROW_MAPPER);

		return team;
	}
}
