package practice08;

public class Teacher extends Person {
  private Klass klass = new Klass(0);

  public Teacher(int i, String x, int y, Klass z) {
    super(i, x, y);
    this.klass = z;
  }
  public Teacher(int i, String x, int y) {
    super(i, x, y);
  }

  public Klass getKlass() {
    return klass;
  }

  @Override
  public String introduce() {
    String temp = (this.getKlass().getNumber() == 0) ? "no klass" : "klass " + this.getKlass().getNumber();
    return super.introduce() + " I am a Teacher. I teach " + temp + ".";
  }

  public String introduceWith(Student studentName) {
    String temp = (this.getKlass().getNumber() == studentName.getKlass().getNumber()) ? " I teach " : " I don't teach ";
    return super.introduce() + " I am a Teacher." + temp + studentName.getName() + ".";
  }

}
