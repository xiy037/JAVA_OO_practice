package practice02;
import practice01.Person;

public class Student extends Person {
  private int klass;

  public Student(String aName, int aAge, int aKlass) {
    super(aName, aAge);
    this.klass = aKlass;
  }

  public int getKlass() {
    return klass;
  }

  @Override
  public String introduce() {
    return "I am a Student. I am at Klass " + this.getKlass() + ".";
  }
}
