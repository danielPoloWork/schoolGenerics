package enums;

public enum ENPersonRole {
  // DECLARATION
  NULL(""),
  STUDENT("Student"),
  TEACHER("Teacher");


  private String label;

  // CONSTRUCTOR
  ENPersonRole(String labelArg) {
    this.label = labelArg;
  }

  // SELECT
  public String getLabel() {
    return this.label;
  }

  // INSERT
  public void setLabel(String labelArg) {
    this.label = labelArg;
  }
}
