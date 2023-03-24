package patternObserver;

import antipattern.FileWriter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AudioObserver implements DataObserver{
    @Override
    public void update(String fileName) {
        if (fileName.contains("/wav/")) {
            LocalTime now = LocalTime.now();

            // Formater l'heure dans le format souhaité (hh:mm:ss)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = now.format(formatter);
            String content = formattedTime;


            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Observation des audios...");

            content += " ::Fichier compressé : " + fileName;
            FileWriter.writeToFile("./data/compressed/wav/AudioCompressionObserver.txt", content);
            System.out.println("-----------------------------------------------------------------------");

        }
    }
}
