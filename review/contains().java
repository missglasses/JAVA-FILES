class DomainChecker {
  public static void main(String[] args) {
    String toFind = ".gov";
    String url = "https://www.usa.gov/holidays";


    System.out.println(url.contains(toFind)); //<---contains()
  }
}
