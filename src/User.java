public abstract class User {
  protected String id;
  protected String firstName;
  protected String lastName;
  protected String username;
  protected String password;
  protected String email;
  protected int phone;

  public User() {

  }
  public User(String id, String firstName, String lastName, String username, String password, String email, int phone) {

  }
  public boolean checkUnique(String id, String username, String email) {
    //TODO
    return true;
  }
  protected boolean changePassword(String oldPassword, String newPassword) { //may need to move this method
    //TODO
    return true;
  }
}