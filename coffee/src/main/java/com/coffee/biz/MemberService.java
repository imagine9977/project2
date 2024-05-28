package com.coffee.biz;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.dao.MemberMapper;
import com.coffee.dto.Member;

@Service
public class MemberService implements MemberBiz {

	private static final Logger log = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	private MemberMapper memberDAO;
	
	@Override
	public List<Member> getMemberList() {
		return memberDAO.getMemberList();
	}

	@Override
	public Member getMember(String id) {
		log.info("Service Before id : {}", id);
		if (id == null || id.isEmpty()) {
	        return null;
	    }
	    
		Member member = null;
		member = memberDAO.getMember(id);
		
		if(member == null) {
			return member;
		}
		
		log.info("Service After id : {}", member.getId());
		return member;
	}

	@Override
	public int memberCount() {
		return memberDAO.memberCount();
	}

	@Override
	public void insMember(Member member) {
		memberDAO.insMember(member);
	}

	@Override
	public void changePw(Member member) {
		memberDAO.changePw(member);
	}

	@Override
	public void changeInfo(Member member) {
		memberDAO.changeInfo(member);
	}

	@Override
	public void changePoint(Member member) {
		memberDAO.changePoint(member);
	}

	@Override
	public void delMember(String id) {
		memberDAO.delMember(id);
	}
}