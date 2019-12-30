package practice06;

public class Student extends Person {
  private Klass klass;

  public Student(String x, int y, Klass z) {
    super(x, y);
    this.klass = z;
  }
  public Klass getKlass() {
    return klass;
  }


  @Override
  public String introduce() {
    return super.introduce() + " I am a Student. I am at klass " + this.getKlass().getNumber() + ".";
  }
}

