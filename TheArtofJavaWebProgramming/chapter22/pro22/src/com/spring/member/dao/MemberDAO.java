package com.spring.member.dao;

import com.spring.member.vo.MemberVO;
import java.util.List;
import org.springframework.dao.DataAccessException;

public interface MemberDAO {
    public List selectAllMembers() throws DataAccessException;
    public int addMember(MemberVO memberVO) throws DataAccessException ;
}
