package entities;

import enums.ENSubjectType;
import interfaces.INEntity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public class Lesson implements INEntity {

  // DECLARATION
  private final String id;
  private final String dateTimeEnd;
  private final String dateTimeStart;
  private final ENSubjectType subject;
  private final List<String> students;
  private final String teacherId;
}
