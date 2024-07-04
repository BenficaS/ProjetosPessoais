import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Questao2 {
    public static void main(String[] args) throws IOException {
        LinkedList<String> pq = new LinkedList<>();


        Scanner ingresso = new Scanner(new File("src/ingressos.txt"));
        while (ingresso.hasNextLine()) {
            pq.add(ingresso.nextLine());
        }
        for (int i = 0; i<10;i++){
            System.out.println(pq.get(i)+" ");
        }
        int soteio = new Random().nextInt(pq.size());
        System.out.println("O numero sorteado foi : \n"+pq.get(soteio));

    }
}
