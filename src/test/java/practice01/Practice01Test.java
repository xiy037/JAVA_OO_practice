/**
 * 写一个Person类，要有name，age属性，要有一个introduce方法，
 * introduce方法返回一个字符串形如：
 *
 * >My name is Tom. I am 21 years old.
 */

package practice01;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Practice01Test {
  @Test
  public void shouldReturnNameAndAge () {
    Person person = new Person("Tom", 21);
    assertEquals("Tom", person.getName());
    assertEquals(21, person.getAge());
  }

  @Test
  public void shouldReturnDescription() {
    Person person = new Person("Tom", 21);
    assertEquals("My name is Tom. I am 21 years old.", person.getDescription());
  }
}
