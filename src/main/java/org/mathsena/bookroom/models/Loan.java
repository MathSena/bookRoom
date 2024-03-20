package org.mathsena.bookroom.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "loans")
public class Loan {
  @Id private String id;
  private Book book;
  private User user;
  private String status;
  private Date loanDate;
  private Date returnDate;
}
