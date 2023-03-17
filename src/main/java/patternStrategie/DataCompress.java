package patternStrategie;


import antipattern.FileWriter;
import antipattern.*;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataCompress {

    private DataCompressionStrategy dcs;

    public DataCompress(DataCompressionStrategy dcs) {
        this.dcs = dcs;
    }

    public void setDataCompressionStrategy(DataCompressionStrategy dcs) {
        this.dcs = dcs;
    }

    public String compressData(Data data){
        return dcs.processData(data);
    }
}
