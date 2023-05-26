package consustraction;

public class RoadConstructionDemo {
    public static void main(String[] args) {
        Roadconstrucation selectedvender = releaseTenderAndSelectContractor();

        String experiance = selectedvender.experiance();
        System.out.println("Experiance is " + experiance);

        float budget = selectedvender.budget();
        System.out.println("budget is " + budget);

        selectedvender.setlocation("Location");
        selectedvender.takeroadspecs("Length= 18km, width= 5m");
        System.out.println(selectedvender.toString());
    }
        private static Roadconstrucation releaseTenderAndSelectContractor(){
            Roadconstrucation vender1= (Roadconstrucation) new DefLtdLoadBuilder("DefLtdLoadBuilder");
            Roadconstrucation vender2= new AbcLtdRoadBuilder("Abc Limited");
            Roadconstrucation vender3= new Roadconstrucation() {
                @Override
                public String experiance() {
                    return null;
                }

                @Override
                public float budget() {
                    return 0;
                }

                @Override
                public void takeroadspecs(String spec) {

                }

                @Override
                public void setlocation(String location) {

                }

                @Override
                public String getprogram() {
                    return null;
                }
            };
                return vender1;


        }

    }


