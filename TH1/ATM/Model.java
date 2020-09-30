public class Model {
  Account ac;

  void start() {
    // Tao tai khoan
    ac = new Account("jackeylove", "1234");
  }

  boolean login(String user, String pass) {
    return ac.checkLogin(user, pass);
  }

}