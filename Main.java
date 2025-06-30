import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] sift = {"田中", "秋山", "三浦", "坂口", "山田", "原口", "木村", "古口", "大田"};
        String[] taime = {"8時～16時半", "8時半～17時", "8時半～12時半"};

        Random rand = new Random();
        for (int i = 0; i < sift.length; i++) {
            int t = rand.nextInt(taime.length);
            System.out.println(sift[i] + taime[t]);
        }
    }
}