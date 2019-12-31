package practice09;

public class Teacher extends Person {
  private Klass[] klasses = {};

  public Teacher(int i, String x, int y, Klass[] z) {
    super(i, x, y);
    this.klasses = z;
  }
  public Teacher(int i, String x, int y) {
    super(i, x, y);
  }

  public Klass[] getKlass() {
    return klasses;
  }

  @Override
  public String introduce() {
    String temp = "";
    int len = klasses.length;
    if (len == 0) {
      temp += "no klass.";
    } else {
      temp += "klass ";
      for (int i = 0; i < len-1; i++) {
        temp += klasses[i].getNumber() + ", ";
      }
      temp += klasses[len-1].getNumber() + ".";
    }
    return super.introduce() + " I am a Teacher. I teach " + temp;
  }

  public boolean isTeaching(Student studentName) {
    return studentName.getKlass().isIn(klasses);
  }

  public String introduceWith(Student studentName) {
    String temp = (this.isTeaching(studentName)) ? " I teach " : " I don't teach ";
    return super.introduce() + " I am a Teacher." + temp + studentName.getName() + ".";
  }

}
