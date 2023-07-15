import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for (int i = 1; i < n + 1; i++) {
            String q = bf.readLine();

            String[] qL = q.split(" ");
            int a = Integer.parseInt(qL[0]);
            int b = Integer.parseInt(qL[1]);

            int result = a + b;

            bw.write("Case #" + i +": "+ result + "\n");
        }
        bw.flush();
        bf.close();
        bw.close();
    }
}