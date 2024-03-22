package com.mypj.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Place {
  private int place_id;
  private String name;
  private String address;
  private String content;
  private int seatCount;

}
