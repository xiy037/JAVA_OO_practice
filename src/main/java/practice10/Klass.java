package practice10;

public class Klass {
  private int number = 0;
  private int leader = 0;
  private Teacher teacher;
  public Klass(int x) {
    this.number = x;
  }

  public int getNumber() {
    return this.number;
  }

  public void assignLeader(Student aStudent) {
    if (aStudent.getKlass().equals(this)) {
      this.leader = aStudent.getId();
    } else {
      System.out.println("It is not one of us.");
    }
    if (this.teacher != null) {
    this.teacher.announceLeader(aStudent);
    }
  }

  public void appendMember(Student aStudent) {
    aStudent.setKlass(this);
    if (this.teacher != null) {
    this.teacher.announceMember(aStudent);
    }
  }

  public int getLeader() {
    return this.leader;
  }

  public boolean isIn(Klass[] array) {
    for (Klass x: array) {
      if (x.equals(this)) {
        return true;
      }
    }
    return false;
  }

  public void setTeacher(Teacher aTeacher) {
    this.teacher = aTeacher;
  }
}
