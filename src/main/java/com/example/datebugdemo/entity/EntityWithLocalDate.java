package com.example.datebugdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "dates")
public class EntityWithLocalDate {

  @Id
  private int id;

  private LocalDate date;

  public EntityWithLocalDate() { }

  public EntityWithLocalDate(int id, LocalDate date) {
    this.id = id;
    this.date = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return String.format("{ \"id\": %d, \"date\": \"%s\" }", id, date);
  }

}
