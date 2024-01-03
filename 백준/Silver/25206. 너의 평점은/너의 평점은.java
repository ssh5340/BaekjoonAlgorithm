import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double result = 0;
        double scoreSum = 0;

        for (int i = 0; i < 20; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String code = st.nextToken();
            double grade = "A+".equals(code) ? 4.5 : "A0".equals(code) ? 4.0 : "B+".equals(code) ? 3.5 : "B0".equals(code) ? 3.0 : "C+".equals(code) ? 2.5 : "C0".equals(code) ? 2.0 : "D+".equals(code) ? 1.5 : "D0".equals(code) ? 1.0 : 0.0;
            if (!("P".equals(code))) {
                double multi = score * grade;
                result += multi;
                scoreSum += score;
            }
        }

        double print = result / scoreSum;
        bw.write(String.format("%.6f", print));
        bw.flush();
        bw.close();
        br.close();
    }
}