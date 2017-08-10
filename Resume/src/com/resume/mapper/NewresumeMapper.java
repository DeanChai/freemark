package com.resume.mapper;

import java.util.List;

import com.resume.model.Basic_info;
import com.resume.model.Educational_info;
import com.resume.model.Work_info;
/**
 * 新建一个简历
 *
 */
public interface NewresumeMapper {
	//插入基础信息
	public void insertbasic(Basic_info basicinfo);
	//添加教育信息
	public void addEducational(Educational_info edu);
	//添加工作信息
	public void addWork(Work_info work);
	//添加自我介绍
	public void addIntroduce(Basic_info intro);
	//查找基本信息
	public List<Basic_info> selectBasic_info(int userid);
	//查找教育信息
	public List<Educational_info>  selectEducational_info(int userid);
	//查找工作信息
	public List<Work_info>  selectWork_info(int userid);
	

}
