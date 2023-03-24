package patternObserver;


public class DataCompress {

    private DataCompressionStrategy dcs;

    private DataObserver dataO;
    public DataCompress(DataCompressionStrategy dcs) {
        this.dcs = dcs;
    }

    public void addDataObserver(DataObserver dataO){
        this.dataO = dataO;
    }
    public void setDataCompressionStrategy(DataCompressionStrategy dcs) {
        this.dcs = dcs;
    }

    public String compressData(Data data){
        String s = dcs.processData(data);
        dataO.update(data.getFile().getPath());
        return s;
    }
}
