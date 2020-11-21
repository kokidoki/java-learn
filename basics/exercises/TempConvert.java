public class TempConvert {
  public static void main(String[] args) {
    double userInput = Double.valueOf(args[0]);
    double celsius = userInput;
    double fahrenheit = (celsius * 1.8) + 32;
    System.out.println(fahrenheit);
  }
}
