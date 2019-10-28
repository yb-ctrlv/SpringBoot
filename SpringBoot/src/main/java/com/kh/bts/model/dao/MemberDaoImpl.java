package com.kh.bts.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.bts.dto.MemberDto;
@Repository
public class MemberDaoImpl implements MemberDao {

	private Logger logger = LoggerFactory.getLogger(MemberDaoImpl.class);
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public MemberDto login(String id) {
		MemberDto dto = null;
		try {
			dto =sqlSession.selectOne(namespace+"login", id);
		} catch (Exception e) {
			logger.info("MEMBERDAO LOGIN ERROR");
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public List<MemberDto> selectList() {
		List<MemberDto> list = null;
		
		try {
			list = sqlSession.selectList(namespace+"selectList");
		} catch (Exception e) {
			logger.info("MEMBERDAO SELECTLIST ERROR");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberDto selectone(int member_no) {
		MemberDto dto = null;
		
		try {
			dto = sqlSession.selectOne(namespace+"selectOne",member_no);
		} catch (Exception e) {
			logger.info("MEMBERDAO SELECTONE ERROR");
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insert(MemberDto dto) {
		int res = 0;
		
		
		try {
			res = sqlSession.insert(namespace+"insert",dto);
		} catch (Exception e) {
			logger.debug("MEMBERDAO INSERT ERROR");
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int update(MemberDto dto) {
		int res = 0;
		
		try {
			res = sqlSession.update(namespace+"update",dto);
		} catch (Exception e) {
			logger.info("MEMBERDAO UPDATE ERROR");
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int delete(int member_no) {
		int res = 0;
		
		try {
			res = sqlSession.update(namespace+"delete",member_no);
		} catch (Exception e) {
			logger.info("MEMBERDAO DELETE ERROR");
			e.printStackTrace();
		}
		return res;
	}

}
