package com.mypj.controller;


import com.mypj.service.MemberService;
import com.mypj.vo.Member;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

  private static final Log log = LogFactory.getLog(MemberController.class);
  private final MemberService memberService;

  @PostMapping("login")
  public void login() {
  }

  @PostMapping("join")
  public void join(@RequestBody Member member) {
    log.debug(String.format("멤버입니다 : %s",member.getNickname()));
    memberService.join(member);
  }
}
