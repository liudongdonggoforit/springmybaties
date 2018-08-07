package org.cj.service.demo;

import javax.annotation.Resource;

import org.cj.dao.auto.TestMapper;
import org.cj.entity.auto.Test;
import org.springframework.stereotype.Service;



@Service
public class TestService
{
	@Resource
	private TestMapper testMapper;
	
	public void insertData()throws Exception
	{
		try
		{
			Test record=new Test();
			record.setName("张三");
			testMapper.insert(record);
		}catch(Exception e)
		{
			throw e;
		}
	}
}
