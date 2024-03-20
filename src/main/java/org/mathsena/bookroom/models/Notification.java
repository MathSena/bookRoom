package org.mathsena.bookroom.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "notifications")
public class Notification {

  @Id private String id;
  private String message;
  private Date sendDate;
  private User recipient;
}
