package practice08;

public class Person {
  private int id;
  private String name;
  private int age;
  public Person(int i, String x, int y) {
    this.id = i;
    this.name = x;
    this.age = y;
  }

  public int getId() {
    return this.id;
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
