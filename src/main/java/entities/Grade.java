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

  public Grade(String id, ENGradeValue grade, ENSubjectType subject, String studentId,
      String teacherId, String createDateTime) {
    this.id = id;
    this.value = grade;
    this.subject = subject;
    this.studentId = studentId;
    this.teacherId = teacherId;
    this.createDateTime = createDateTime;
  }

  public String getId() {
    return id;
  }

  public ENGradeValue getValue() {
    return value;
  }

  public ENSubjectType getSubject() {
    return subject;
  }

  public String getStudentId() {
    return studentId;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public String getCreateDateTime() {
    return createDateTime;
  }
}
