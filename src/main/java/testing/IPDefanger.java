package testing;

public class IPDefanger {
  /**
   * Реалізуй метод defangIPAddress(), який приймає рядок з дійсною IPv4-адресою address і повертає змінену версію цієї IP-адреси.
   *
   * У зміненій IP-адресі кожна крапка '.' замінена на "[.]".
   *
   * Приклади:
   *
   * defangIPAddress("1.1.1.1") == "1[.]1[.]1[.]1"
   * defangIPAddress("255.100.50.0") == "255[.]100[.]50[.]0"
   * */
  public static String defangIPAddress(String address) {
    return address.replaceAll("\\.", "[.]");
  }

  public static void main(String[] args) {
    System.out.println(defangIPAddress("1.1.1.1"));
  }
}
