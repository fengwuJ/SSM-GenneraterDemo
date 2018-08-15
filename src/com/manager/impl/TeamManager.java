package com.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.TeamMapper;
import com.entity.Team;
import com.manager.ITeamManager;

@Service("teammanager")
public class TeamManager implements ITeamManager {
	
	@Resource
	private TeamMapper teamMapper;
	
	
	@Override
	public void addnewTeam(Team t) {
		// TODO Auto-generated method stub
		int res= teamMapper.insert(t);
		//Team team= teamMapper.selectByPrimaryKey(1);
		//System.out.println(team.getName());
	}

}
