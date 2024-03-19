package com.mypj.vo;

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Schedule {
  private int schedule_id;
  private int limited_seat_count;
  private Date start_at;
  private Date end_at;
  private int performance_id;
  private int place_id;


}
