import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Main hello = new Main();
    hello.execute();
  }

  public void execute() {
    String ten;
    int tuoi;
    String gioitinh;
    String sdt;

    System.out.println("~ Hello darkness my old friend ~");

    // Nhap ten
    Scanner scan = new Scanner(System.in);
    System.out.print("Nhap Ten cua ban: ");
    ten = scan.next();

    // Nhap so tuoi (int)
    System.out.print("Nhap Tuoi cua ban: ");
    tuoi = scan.nextInt();

    // Nhap gioi tinh (Nam/Nu)
    System.out.print("Nhap Gioi tinh (Nam/Nu): ");
    gioitinh = scan.next();

    // Nhap so dien thoai
    System.out.print("So dien thoai cua ban: ");
    sdt = scan.next();

    // Xuat thong tin
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Chao " + ten + "!");
    System.out.println("~ Thong tin cua ban ne ~");
    System.out.println("\tTuoi         : " + tuoi);
    System.out.println("\tGioi tinh    : " + gioitinh);
    System.out.println("\tSo dien thoai: " + sdt);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    scan.close();
  }
}