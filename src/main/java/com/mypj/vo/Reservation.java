package com.mypj.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Reservation {
  private int reservation_id;
  private Date created_at;
  private int member_id;
  private int schedule_id;

}
