package practice06;

public class Person {
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
