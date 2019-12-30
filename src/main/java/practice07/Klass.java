package practice07;

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
    this.leader = aStudent.getId();
  }

  public int getLeader() {
    return this.leader;
  }
}
