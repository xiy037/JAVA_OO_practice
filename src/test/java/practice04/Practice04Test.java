/**写一个Person类，要有name，age属性，要有一个introduce方法，
 introduce方法返回一个字符串形如：

 >My name is Tom. I am 21 years old.

 再写一个Student类继承Person类，除了name，age属性，还有要有klass属性。也有一个introduce方法，
 introduce方法返回一个字符串形如：

 >My name is Tom. I am 21 years old. I am a Student. I am at klass 2.


 再写一个Worker类继承Person类，只有name，age属性。也有一个introduce方法，
 introduce方法返回一个字符串形如：

 >My name is Tom. I am 21 years old. I am a Worker. I have a job.


 所有这三个类的这段文字：

 >My name is Tom. I am 21 years old.

 应该调用Person的basicIntroduce来返回。
 */


package practice04;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Practice04Test {
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
  public void shouldReturnWorkerIntro() {
    Worker tom = new Worker("Tom", 21);
    assertEquals("My name is Tom. I am 21 years old. I am a Worker. I have a job.", tom.introduce());

  }
}
