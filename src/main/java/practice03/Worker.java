package practice03;
import practice01.Person;

public class Worker extends Person {
  public Worker(String x, int y) {
    super(x, y);
  }

  @Override
  public String introduce() {
    return "I am a Worker. I have a job.";
  }
}
