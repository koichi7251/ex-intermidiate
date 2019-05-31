package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.BaseballTeam;
import com.example.servise.BaseballTeamService;

@Controller
@RequestMapping("/teamList")
public class BaseBallTeamController {
	@Autowired
	private BaseballTeamService baseBallTeamService;

	@RequestMapping("/")
	public String showList(Model model) {
		List<BaseballTeam> teamList = baseBallTeamService.showList();
		model.addAttribute("teamList",teamList);
		return "team-list-page";
	}

	@RequestMapping("/teamDetail")
	public String showDetail(String teamName, Model model) {
		BaseballTeam teamDetail = baseBallTeamService.showDetail(teamName);
		model.addAttribute("teamDetail", teamDetail);
		return "team-detail-page";
	}
}
