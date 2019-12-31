package practice10;

public class Teacher extends Person {
  private Klass[] klasses = {};

  public Teacher(int i, String x, int y, Klass[] z) {
    super(i, x, y);
    this.klasses = z;
    setKlassTeacher();
  }
  public Teacher(int i, String x, int y) {
    super(i, x, y);
  }

  public Klass[] getKlass() {
    return klasses;
  }

  public void setKlassTeacher() {
    for (Klass x : klasses) {
      x.setTeacher(this);
    }
  }

  public void announceMember(Student studentName) {
    String str = "I am " + this.getName() + ". I know " + studentName.getName()
            + " has joined Klass " + studentName.getKlass().getNumber() + ".";
    System.out.println(str);
  }

  public void announceLeader(Student studentName) {
    String str = "I am " + this.getName() + ". I know " + studentName.getName()
            + " has become Leader of Klass " + studentName.getKlass().getNumber() + ".";
    System.out.println(str);
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
