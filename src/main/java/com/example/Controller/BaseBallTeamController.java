package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.BaseballTeam;
import com.example.servise.BaseballTeamService;

/**
 * 野球チームの一覧、詳細表示の操作をする.
 * 
 * @author koichi.nagata
 *
 */

@Controller
@RequestMapping("/teamList")
public class BaseBallTeamController {
	@Autowired
	private BaseballTeamService baseBallTeamService;

	/**
	 * 野球チーム一覧のページを表示する.
	 * 
	 * @param model モデル
	 * @return チーム一覧ページ
	 */
	@RequestMapping("")
	public String showList(Model model) {
		List<BaseballTeam> teamList = baseBallTeamService.showList();
		model.addAttribute("teamList", teamList);
		return "team-list-page";
	}

	/**
	 * 野球チーム詳細ページを表示する.
	 * 
	 * @param id    ID(主キー)
	 * @param model モデル
	 * @return 詳細表示ページ
	 */

	@RequestMapping("/teamDetail")
	public String showDetail(Integer id, Model model) {
		BaseballTeam teamDetail = baseBallTeamService.showDetail(id);
		model.addAttribute("teamDetail", teamDetail);
		return "team-detail-page";
	}
}
