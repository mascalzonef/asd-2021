package it.unical.inf.asd.restex.core.exception;

public class EmployeeNotFoundException extends EmployeeException {

  public EmployeeNotFoundException(Long id) {
    super(String.format("Employee [%s] not found", id));
  }
}
