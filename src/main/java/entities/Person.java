package entities;

import enums.ENPersonRole;

public class Person {
  private final String id;
  private final String name;
  private final String surname;
  private final String birthDate;
  private final ENPersonRole role;

  public Person(String id, String name, String surname, String birthDate, ENPersonRole roleArg) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.birthDate = birthDate;
    this.role = roleArg;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getBirthDate() {
    return this.birthDate;
  }

  public ENPersonRole getRole() {return this.role;  }

  @Override
  public String toString() {
    StringBuilder string = new StringBuilder();
    return string.append("{\"").append(this.name)
        .append('.').append(this.surname)
        .append("\",\"").append(this.birthDate)
        .append("\",\"").append(this.role)
        .append("\"}").toString();
  }
}
