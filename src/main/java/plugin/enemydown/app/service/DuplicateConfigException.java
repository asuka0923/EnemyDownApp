package plugin.enemydown.app.service;

public class DuplicateConfigException extends Exception{

  public DuplicateConfigException() {
    super();
  }

  public DuplicateConfigException(String message) {
    super(message);
  }

  public DuplicateConfigException(String message, Throwable cause) {
    super(message, cause);
  }

  public DuplicateConfigException(Throwable cause) {
    super(cause);
  }
}
