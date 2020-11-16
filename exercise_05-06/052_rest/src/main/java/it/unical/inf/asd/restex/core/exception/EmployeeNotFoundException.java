package it.unical.inf.asd.restex.core.exception;

public class EmployeeNotFoundException extends EmployeeException {

  public EmployeeNotFoundException(Long id) {
    super(String.format("Employee [%s] not found", id));
  }

  public EmployeeNotFoundException(String name) {
    super(String.format("Employee with name [%s] not found", name));
  }
}
