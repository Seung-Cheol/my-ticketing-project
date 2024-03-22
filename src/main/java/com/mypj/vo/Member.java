package com.mypj.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
  private int id;
  private String nickname;
  private String email;
  private String password;
  private int auth;
  private Date createdAt;
  private String image;

}
