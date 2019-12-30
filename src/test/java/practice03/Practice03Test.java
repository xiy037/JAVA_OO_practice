/**
 *
 再写一个Worker类继承Person类，只有name，age属性。也有一个introduce方法，
 introduce方法返回一个字符串形如：

 >I am a Worker. I have a job.
 */

package practice03;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Practice03Test {
  @Test
  public void shouldReturnWorkerDescription() {
    Worker john = new Worker("John", 26);
    assertEquals("I am a Worker. I have a job.", john.introduce());
  }
}
