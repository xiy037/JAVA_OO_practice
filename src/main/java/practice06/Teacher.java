package practice06;

public class Teacher extends Person {
  private Klass klass = new Klass(0);

  public Teacher(String x, int y, Klass z) {
    super(x, y);
    this.klass = z;
  }
  public Teacher(String x, int y) {
    super(x, y);
  }

  public Klass getKlass() {
    return klass;
  }

  @Override
  public String introduce() {
    String temp = (this.getKlass().getNumber() == 0) ? "no klass" : "klass 2";
    return super.introduce() + " I am a Teacher. I teach " + temp + ".";
  }

  public String introduceWith(Student studentName) {
    String temp = (this.getKlass().getNumber() == studentName.getKlass().getNumber()) ? " I teach " : " I don't teach ";
    return super.introduce() + " I am a Teacher." + temp + studentName.getName() + ".";
  }

}
