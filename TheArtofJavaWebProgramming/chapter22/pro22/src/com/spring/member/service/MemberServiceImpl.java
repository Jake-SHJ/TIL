package com.spring.member.service;

import com.spring.member.dao.MemberDAO;
import java.util.List;
import org.springframework.dao.DataAccessException;

public class MemberServiceImpl implements MemberService {

    private MemberDAO memberDAO;

    public void setMemberDAO(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public List listMembers() throws DataAccessException {
        List membersList = null;
        membersList = memberDAO.selectAllMembers();
        return membersList;
    }
}
