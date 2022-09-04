package pitman.api.db;

public @interface Database {
  DatabaseType type();

  String ip();

  String port();

  String username();

  String password();

  String schema();
}
