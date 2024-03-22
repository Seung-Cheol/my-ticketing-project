package com.mypj.vo;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Performance {
  private int id;
  private String name;
  private String content;
  private Date startDate;
  private Date endDate;

}
