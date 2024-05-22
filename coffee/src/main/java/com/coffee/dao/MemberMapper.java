package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Member;

public interface MemberMapper {
	public int getTotalCount();
	public List<Member> getMemberList();
	public Member getMember(int bno);
	public void insMember(Member member);
	public void upMember(Member member);
	public void delMember(int bno);
	public void vcntCount(int bno);
}