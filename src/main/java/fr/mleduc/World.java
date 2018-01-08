package fr.mleduc;

public class World {

  private final Hello hello = new Hello();

  public String world() {
    return "world";
  }

  public String helloWorld() {
    return hello.hello() + " " + world();
  }

  private String dead() {
    return "dead";
  }
}
