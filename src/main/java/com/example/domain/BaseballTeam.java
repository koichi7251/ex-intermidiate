package com.example.domain;

/**
 * 野球チーム詳細のクラス.
 * 
 * @author koichi.nagata
 *
 */
public class BaseballTeam {
	/** ID(主キー) */
	private Integer id;
	/** リーグ名 **/
	private String leagueName;
	/** チーム名 */
	private String teamName;
	/** 本拠地 */
	private String headquarters;
	/** 発足日 */
	private String inauguration;
	/** 歴史 */
	private String history;

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final String getLeagueName() {
		return leagueName;
	}

	public final void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public final String getTeamName() {
		return teamName;
	}

	public final void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public final String getHeadquarters() {
		return headquarters;
	}

	public final void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public final String getInauguration() {
		return inauguration;
	}

	public final void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}

	public final String getHistory() {
		return history;
	}

	public final void setHistory(String history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "BaseballTeamDomain [id=" + id + ", leagueName=" + leagueName + ", teamName=" + teamName
				+ ", headquarters=" + headquarters + ", inauguration=" + inauguration + ", history=" + history + "]";
	}

}
