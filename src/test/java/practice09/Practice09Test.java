package practice09;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Practice09Test {
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
  public void shouldReturnTeacherIntro_teach_klass2() {
    Klass[] klasses = {klass};
    Teacher tom = new Teacher(1,"Tom", 21, klasses);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach klass 2.", tom.introduce());
  }

  @Test
  public void shouldReturnTeacherIntro_teach_klass2_and_3() {
    Klass klass3 = new Klass(3);
    Klass[] klasses = {klass, klass3};
    Teacher tom = new Teacher(1,"Tom", 21, klasses);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach klass 2, 3.", tom.introduce());
  }


  @Test
  public void shouldReturnTeacherIntro_teach_no_klass() {
    Teacher tom = new Teacher(1,"Tom", 21);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach no klass.", tom.introduce());
  }

  @Test
  public void shouldReturn_is_teaching_student() {
    Klass klass3 = new Klass(3);
    Klass[] klasses = {klass, klass3};
    Teacher tom = new Teacher(1,"Tom", 21, klasses);
    Student jerry = new Student(2, "Jerry", 20, klass3);
    assertEquals(true, tom.isTeaching(jerry));
  }

  @Test
  public void shouldReturn_is_not_teaching_student() {
    Klass klass3 = new Klass(3);
    Klass klass5 = new Klass(5);
    Klass[] klasses = {klass, klass3};
    Teacher tom = new Teacher(1,"Tom", 21, klasses);
    Student jerry = new Student(2, "Jerry", 20, klass5);
    assertEquals(false, tom.isTeaching(jerry));
  }

  @Test
  public void shouldReturnTeacherIntroduceWith_teach_student() {
    Klass klass3 = new Klass(3);
    Klass[] klasses = {klass, klass3};
    Teacher tom = new Teacher(1,"Tom", 21, klasses);
    Student jerry = new Student(2, "Jerry", 20, klass3);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.", tom.introduceWith(jerry));
  }

  @Test
  public void shouldReturnTeacherIntroduceWith_dont_teach_student() {
    Klass klass3 = new Klass(3);
    Klass klass5 = new Klass(5);
    Klass[] klasses = {klass, klass3};
    Teacher tom = new Teacher(1,"Tom", 21, klasses);
    Student jerry = new Student(2, "Jerry", 20, klass5);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.", tom.introduceWith(jerry));
  }

}
