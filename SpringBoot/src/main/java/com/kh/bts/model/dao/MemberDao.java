package com.kh.bts.model.dao;

import java.util.List;

import com.kh.bts.dto.MemberDto;

public interface MemberDao {
	
	String namespace= "member.";
	
	public MemberDto login(String member_id);
	public List<MemberDto> selectList();
	public MemberDto selectone(int member_no);
	public int insert(MemberDto dto);
	public int update(MemberDto dto);
	public int delete(int member_no);
	

}
