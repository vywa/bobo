package com.bobo.service.impl.message;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bobo.dao.message.MsgDetailDao;
import com.bobo.domain.message.MsgDetail;
import com.bobo.service.message.MsgDetailService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年7月26日 下午1:48:31
* 	消息详情业务类
*/
@Service
public class MsgDetailServiceImpl implements MsgDetailService{

	@Resource
	private MsgDetailDao msgDetailDao;
	
	@Override
	public int add(MsgDetail msgDetail) {
		// TODO Auto-generated method stub
		msgDetailDao.add(msgDetail);
		return 0;
	}

	@Override
	public MsgDetail find(int id) {
		// TODO Auto-generated method stub
		return msgDetailDao.findById(id);
	}

	@Override
	public List<MsgDetail> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MsgDetail msgSubject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
