package com.bobo.service.impl.score;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bobo.dao.score.LevelRuleDao;
import com.bobo.domain.score.LevelRule;
import com.bobo.service.score.LevelRuleService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午3:39:17
* 等级规则业务类
*/
@Service
public class LevelRuleServiceImpl implements LevelRuleService{

	@Resource
	private  LevelRuleDao levelRuleDao;
	
	
	@Override
	public int add( LevelRule resource) {
		// TODO Auto-generated method stub
		levelRuleDao.add(resource);
		return 0;
	}

	@Override
	public void addLevelRule( LevelRule roleResource) {
		// TODO Auto-generated method stub
		levelRuleDao.add(roleResource);
	}

	@Override
	public  LevelRule find(int id) {
		// TODO Auto-generated method stub
		return levelRuleDao.queryById(id);
	}

	@Override
	public List< LevelRule> queryAll() {
		// TODO Auto-generated method stub
		return levelRuleDao.queryAll();
	}

	@Override
	public void update( LevelRule resource) {
		// TODO Auto-generated method stub
		levelRuleDao.update(resource);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		levelRuleDao.delete(id);
	}

}
