package patternObserver;


import java.util.ArrayList;

public class DataCompress {

    private DataCompressionStrategy dcs;

    private ArrayList<DataObserver> dataObservers = new ArrayList<DataObserver>();
    public DataCompress(DataCompressionStrategy dcs) {
        this.dcs = dcs;
    }

    public void addDataObserver(DataObserver dataObserver){
        dataObservers.add(dataObserver);
    }
    public void setDataCompressionStrategy(DataCompressionStrategy dcs) {
        this.dcs = dcs;
    }

    public String compressData(Data data){
        String s = dcs.processData(data);
        notifyobservers(data);
        return s;
    }
    public void notifyobservers(Data data){
        for (int i = 0; i < dataObservers.size(); i++) {
            dataObservers.get(i).update(data.getFile().getPath());
        }

    }
}
