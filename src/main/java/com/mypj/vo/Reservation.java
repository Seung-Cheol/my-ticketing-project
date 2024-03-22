package com.mypj.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Reservation {
  private int id;
  private Date createdAt;
  private int memberId;
  private int scheduleId;

}
