package com.mypj.vo;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Performance {
  private int performance_id;
  private String name;
  private String content;
  private Date start_date;
  private Date end_date;

}
