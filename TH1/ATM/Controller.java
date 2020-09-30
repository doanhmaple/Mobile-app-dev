public class Controller {

  String process(Model model, int action, String[] data) {

    String message;
    switch (action) {
      case 1:
        // Goi ham login o Model
        String user = data[0];
        String pass = data[1];
        boolean ok = model.login(user, pass);
        message = (ok) ? "Login successfully!" : "Login failed!";
        break;
      default:
        message = "Invalid operation. Try again.";
        break;
    }
    return message;
  }

}