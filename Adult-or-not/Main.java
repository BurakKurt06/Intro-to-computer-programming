public class Main{
  public String name;
  public int age;
  public boolean isAdult;

  public Main() {
    name = "Burak";
    age = 15;
    isAdult = false;
  }
  public main (String name, int age, boolean isAdult);

  public void setName (String name1) {
    name1 = name;
    }
  public void setAge (int age1) {
    age1 = age;
    }
  public void setisAdult (boolean isAdult1) {
    isAdult1 = isAdult;
    }
    public String getName() {
      return name;
    }
    public int getAge() {
      return age;
    }
    public boolean getisAdult() {
      return isAdult;
    }
    public String toString() {
      return name + "is" + age + "years old. It is" + isAdult + "that he is an adult";
    }
    public static void main (String[] args) {
      Main person1 = new Main("Burak", 15, false);
System.out.println(person1);
    }
}