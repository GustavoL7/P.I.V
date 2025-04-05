import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class SensorSimulator {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new DataReader(), 0, 2000); // a cada 2 segundos
    }
}

class DataReader extends TimerTask {
    Random random = new Random();

    @Override
    public void run() {
        double temperatura = 20 + random.nextDouble() * 10;  // 20°C a 30°C
        double umidade = 40 + random.nextDouble() * 30;      // 40% a 70%
        int luminosidade = random.nextInt(1024);             // 0 a 1023 (valor analógico do LDR)

        System.out.printf("Temperatura: %.2f°C | Umidade: %.2f%% | Luminosidade: %d\n",
                temperatura, umidade, luminosidade);
    }
}