package practice04;

class Person {
  private String name;
  private int age;
  public Person(String x, int y) {
    this.name = x;
    this.age = y;
  }

  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public String introduce() {
    return "My name is " + this.getName() + ". I am " + this.getAge()+ " years old.";
  }
}

class Student extends Person {
  private int klass;

  public Student(String x, int y, int z) {
    super(x, y);
    this.klass = z;
  }
  public int getKlass() {
    return klass;
  }

  @Override
  public String introduce() {
    return super.introduce() + " I am a Student. I am at klass " + this.getKlass() + ".";
  }
}

public class Worker extends Person{
  public Worker(String x, int y) {
    super(x, y);
  }

  @Override
  public String introduce() {
    return super.introduce() + " I am a Worker. I have a job.";
  }
}
