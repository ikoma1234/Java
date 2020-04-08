class Shape {
  private String name;
  public Shape(String name) {
    this.name = name;
  }
  public Shape() {
    name = "no name";
  }
  public String getName() {
    return name;
  }
  public String toString() {
    return getClass().getName() + " " + name;
  }
}
