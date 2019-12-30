/**
 * 再写一个Student类继承Person类，除了name，age属性，还有要有klass属性。也有一个introduce方法，
 * introduce方法返回一个字符串形如：
 *
 * >I am a Student. I am at Klass 2.
 */

package practice02;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Practice02Test {
  @Test
  public void shouldReturnStudentDescription() {
    Student tom = new Student("Tom", 21, 2);
    assertEquals("I am a Student. I am at Klass 2.", tom.introduce());
  }

}
