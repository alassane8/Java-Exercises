/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author Jean-Michel Busca
 */
public class EmployeeInfo {

  private final int id;
  private final String name;
  private final float salary;

  public EmployeeInfo(int id, String name, float salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "EmployeeInfo{" + "id=" + id + ", name=" + name + ", salary=" + salary + "}\n";
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public float getSalary() {
    return salary;
  }
}