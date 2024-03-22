package com.mypj.vo;

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Schedule {
  private int id;
  private int limitedSeatCount;
  private Date startDate;
  private Date endDate;
  private int performanceId;
  private int placeId;


}
