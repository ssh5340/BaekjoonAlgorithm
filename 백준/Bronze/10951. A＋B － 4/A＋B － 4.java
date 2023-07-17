import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        // 문제 이해가 어려워 해석 참고
        // StringBuilder, StringTokenizer 복습으로 사용법 익힐 겸
        // 참고한 소스로 정답 제출
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while( (str=br.readLine()) != null ){

            st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");

        }
        System.out.print(sb);
    }
}