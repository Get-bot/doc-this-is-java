package ch16.sec04;

public class LambdaExample {
  public static void main(String[] args) {
    Person person = new Person();

    //실행문이 두 개 이상일 경우
    person.action((x, y) -> {
      double result = x + y;
      return result;
    });

    //리턴문이 하나만 있을 경우
    person.action((x, y) -> x + y);

    //리턴문이 하나만 있을 경우(메소드호출)
    person.action(Double::sum);
  }
}