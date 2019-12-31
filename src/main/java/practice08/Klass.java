package practice08;

public class Klass {
  private int number = 0;
  private int leader = 0;
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
  }

  public void appendMember(Student aStudent) {
    aStudent.setKlass(this);
  }

  public int getLeader() {
    return this.leader;
  }
}
