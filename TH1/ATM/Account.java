public class Account {
  private String user;
  private String pass;

  public Account(String user, String pw) {
    this.user = user;
    this.pass = pw;
  }

  public boolean checkLogin(String user, String pw) {
    // Kiem tra Dang nhap
    return user.equals(this.user) && pw.equals(this.pass);
  }
}