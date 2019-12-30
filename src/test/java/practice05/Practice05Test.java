/**
 *写一个Person类，要有name，age属性，要有一个introduce方法，
 * introduce方法返回一个字符串形如：
 *
 * >My name is Tom. I am 21 years old.
 *
 * 再写一个Student类继承Person类，除了name，age属性，还有要有klass属性。也有一个introduce方法，
 * introduce方法返回一个字符串形如：
 *
 * >My name is Tom. I am 21 years old. I am a Student. I am at Klass 2.
 *
 * 再写一个Teacher类继承Person类，除了name，age属性，也有klass属性。也有一个introduce方法，
 * introduce方法返回一个字符串形如：
 *
 * >My name is Tom. I am 21 years old. I am a Teacher. I teach Klass 2.
 *
 * 如果klass为空，就会返回：
 *
 * >My name is Tom. I am 21 years old. I am a Teacher. I teach No Klass.
 *
 * 所有Person的子类的这段文字：
 *
 * >My name is Tom. I am 21 years old.
 *
 * 都应该调用Person的introduce方法来获得。
 */


package practice05;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Practice05Test {
  @Test
  public void shouldReturnPersonIntro() {
    Person tom = new Person("Tom", 21);
    assertEquals("My name is Tom. I am 21 years old.", tom.introduce());
  }

  @Test
  public void shouldReturnStudentIntro() {
    Student tom = new Student("Tom", 21, 2);
    assertEquals("My name is Tom. I am 21 years old. I am a Student. I am at klass 2.", tom.introduce());
  }

  @Test
  public void shouldReturnTeacherIntro() {
    Teacher tom = new Teacher("Tom", 21, 2);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach klass 2.", tom.introduce());
  }

  @Test
  public void shouldReturnTeacherIntro2() {
    Teacher tom = new Teacher("Tom", 21);
    assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach no klass.", tom.introduce());
  }
}
