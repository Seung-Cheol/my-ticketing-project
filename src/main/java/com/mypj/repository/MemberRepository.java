package com.mypj.repository;

import com.mypj.vo.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {
  void add(Member member);

}
