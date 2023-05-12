package consustraction;

public class AbcLtdRoadBuilder implements Roadconstrucation{

    private String roadSpecs;
    private String location;
    private String vender;
    private String name;

    public AbcLtdRoadBuilder(String name){
        this.name=name;    }


    @Override
    public String experiance() {
        return "constructed 10 roads";
    }

    @Override
    public float budget() {
        return 2000000;
    }

    @Override
    public void takeroadspecs(String spec) {
        this.takeroadspecs(spec);
    }

    @Override
    public void setlocation(String location) {
        this.setlocation(location);
    }

    @Override
    public String getprogram() {
        return "20% completed";

    }
    @Override
    public String toString() {
        return "abcLtdRoadBuilder{" +
                "roadSpecs='" + roadSpecs + '\'' +
                ", location='" + location + '\'' +
                ", vender='" + vender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
