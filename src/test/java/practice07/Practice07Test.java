package practice07;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Practice07Test {
  private Klass klass;

  @Before
  public void setup() {
    klass = new Klass(2);
  }

  @Test
  public void shouldReturnPersonIntro() {
    Person tom = new Person(1, "Tom", 21);
    assertEquals("My name is Tom. I am 21 years old.", tom.introduce());
  }

  @Test
  public void shouldReturnStudentIntro() {
    Student tom = new Student(1, "Tom", 21, klass);
    assertEquals("My name is Tom. I am 21 years old. I am a Student. I am at klass 2.", tom.introduce());
  }

  @Test
  public void shouldReturnStduentIntroWithLeader() {
    Student tom = new Student(1, "Tom", 21, klass);
    klass.assignLeader(tom);
    assertEquals("My name is Tom. I am 21 years old. I am a Student. I am Leader of klass 2.", tom.introduce());
  }


  @Test
  public void shouldReturnTeacherIntro() {
    Teacher tom = new Teacher(1,"Tom", 21, klass);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach klass 2.", tom.introduce());
  }

  @Test
  public void shouldReturnTeacherIntro2() {
    Teacher tom = new Teacher(1,"Tom", 21);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach no klass.", tom.introduce());
  }

  @Test
  public void shouldReturnTeacherIntroduceWith() {
    Teacher tom = new Teacher(1,"Tom", 21, klass);
    Student jerry = new Student(1,"Jerry", 8, klass);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.", tom.introduceWith(jerry));
  }
}
