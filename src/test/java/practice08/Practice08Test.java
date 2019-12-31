package practice08;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Practice08Test {
  private Klass klass;
  private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setup() {
    klass = new Klass(2);
    System.setOut(new PrintStream(outContent));
  }
  private String systemOut() {
    return outContent.toString();
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
  public void should_return_not_one_of_us() {
    Student jerry = new Student(2, "Jerry", 20, new Klass(5));
    klass.assignLeader(jerry);
    assertEquals("It is not one of us.\n", systemOut());
  }

  @Test
  public void should_return_leader() {
    Student jerry = new Student(2, "Jerry", 20, new Klass(5));
    klass.appendMember(jerry);
    klass.assignLeader(jerry);
    assertEquals("My name is Jerry. I am 20 years old. I am a Student. I am Leader of klass 2.", jerry.introduce());
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
