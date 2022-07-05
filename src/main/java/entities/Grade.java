package entities;

import enums.ENGradeValue;
import enums.ENSubjectType;
import interfaces.INEntity;

public class Grade implements INEntity {
  private final String id;
  private final ENGradeValue value;
  private final ENSubjectType subject;
  private final String studentId;
  private final String teacherId;
  private final String createDateTime;

  private String updateDateTime;

  public Grade(String id, ENGradeValue value, ENSubjectType subject, String studentId,
      String teacherId, String createDateTime) {
    this.id = id;
    this.value = value;
    this.subject = subject;
    this.studentId = studentId;
    this.teacherId = teacherId;
    this.createDateTime = createDateTime;
  }

  public String getId() {
    return this.id;
  }

  public ENGradeValue getValue() {
    return this.value;
  }

  public ENSubjectType getSubject() {
    return this.subject;
  }

  public String getStudentId() {
    return this.studentId;
  }

  public String getTeacherId() {
    return this.teacherId;
  }

  public String getCreateDateTime() {
    return this.createDateTime;
  }
}
