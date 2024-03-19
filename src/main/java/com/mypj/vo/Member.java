package com.mypj.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
  private int member_id;
  private String nickname;
  private String email;
  private String password;
  private int auth;
  private Date created_at;
  private String image;

}
