import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        if (n <= 1) {
            bw.write(""+"\n");
        } else {
            ArrayList<Integer> primeNumberList = new ArrayList<>();
            
            
            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    primeNumberList.add(i);
                    n /= i;
                }
            }
            
           
            if (n > 1) {
                primeNumberList.add(n);
            }
            
            
            Collections.sort(primeNumberList);
            for (int primeNumber : primeNumberList) {
                bw.write(primeNumber + "\n");
            }
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}