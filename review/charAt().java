class SecurityChecker {
  public static void main(String[] args) {
    String url = "https://www.datacamp.com";
    int charPosition = 4; //<--

    System.out.println("s means secure : ");
    System.out.println(url.charAt(charPosition)); //<--returns pos 
  }
}
