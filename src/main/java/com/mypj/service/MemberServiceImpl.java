package com.mypj.service;

import com.mypj.repository.MemberRepository;
import com.mypj.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

  private final MemberRepository memberRepository;

  public void join(Member member) {
    memberRepository.add(member);
  }

}
