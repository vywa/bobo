package com.bobo.web.score;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.domain.score.LevelChange;
import com.bobo.dto.RequestContent;
import com.bobo.dto.ResponseResult;
import com.bobo.service.score.LevelChangeService;



/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午11:02:29
* 等级变动控制器
*/
@RestController
@RequestMapping("levelchange")
public class LevelChangeController {
	private static final Logger log = LoggerFactory.getLogger(LevelChangeController.class);
	
	@Resource
	private LevelChangeService levelChangeService;
	
	
	/*
	 * 
	 *  添加规则
	 * 
	 * */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	
	public ResponseResult<String> addPost(@RequestBody RequestContent<LevelChange> data,HttpServletRequest request){
		LevelChange subject = data.getData();
		levelChangeService.add(subject);
		 ResponseResult<String> result = new ResponseResult<String>();
		 result.setCode(206);
		 result.setMessage("添加规则成功");
		 return result;
	}

	
	
	/*
	 *  显示所有规则
	 * */
	@RequestMapping(value="/show",method=RequestMethod.POST)
	
	public ResponseResult<LevelChange> showPost(@RequestBody RequestContent<Integer> data){
		 
		 int id = data.getData();
		 LevelChange md = levelChangeService.find(id);
		 ResponseResult<LevelChange> result = new ResponseResult<LevelChange>();
		 result.setCode(206);
		 result.setContent(md);
		 result.setMessage("查询成功");
		 return result;
	}
	
	
	
	
	
	
}
