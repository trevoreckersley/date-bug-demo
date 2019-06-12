package com.example.datebugdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "dates")
public class EntityWithLocalDateTime {

  @Id
  private int id;

  private LocalDateTime date;

  public EntityWithLocalDateTime() { }

  public EntityWithLocalDateTime(int id, LocalDateTime date) {
    this.id = id;
    this.date = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return String.format("{ \"id\": %d, \"date\": \"%s\" }", id, date);
  }

}
