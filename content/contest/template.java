public class Template {
  static BufferedReader  br;
  static PrintWriter out;
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new BufferedWriter(new OutputStreamWriter(System.out));
    // br = new BufferedReader(new FileReader("in.txt"));
    // out = new BufferedWriter(new FileWriter("out.txt"));
    // out.close();
  }
  static String next() throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }
  static long readLong() throws IOException { return Long.parseLong(next()); }
  static int readInt() throws IOException { return Integer.parseInt(next()); }
  static double readDouble() throws IOException { return Double.parseDouble(next()); }
  static char readCharacter() throws IOException { return next().charAt(0); }
  static String readLine() throws IOException { return br.readLine().trim(); }
}