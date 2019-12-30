package practice07;

public class Student extends Person {
  private Klass klass;

  public Student(int i, String x, int y, Klass z) {
    super(i, x, y);
    this.klass = z;
  }
  public Klass getKlass() {
    return klass;
  }


  @Override
  public String introduce() {
    String temp = (this.klass.getLeader() == this.getId()) ? "I am Leader of klass " + this.getKlass().getNumber()
            : "I am at klass " + this.getKlass().getNumber() ;
    return super.introduce() + " I am a Student. " + temp + ".";
  }
}

