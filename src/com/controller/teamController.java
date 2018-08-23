package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Team;
import com.manager.ITeamManager;

@Controller
public class teamController {
	@Resource
	private ITeamManager teammanager;
	
	
	@RequestMapping("/addnewteam")
	public String addnewTeam(Team team,Model model){
		teammanager.addnewTeam(team);
		model.addAttribute("team", team);
		
		return "index";
	}
}
