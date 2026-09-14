package main.beans;

public class AirportBean {

    private PlaneBean place1, place2;

    public void state(){
        System.out.print("Place1=");
        if(place1!=null){
            System.out.println(place1.getName());
        }
        else {
            System.out.println("vide");
        }

        System.out.print("Place2=");
        if(place2!=null){
            System.out.println(place2.getName());
        }
        else {
            System.out.println("vide");
        }
    }

    public String park(PlaneBean plane, int position){

        if(position == 1) {
            if(place1 != null) {
                return "La place 1 est occupée";
            }
            place1 = plane;
            return "ok";
        }
        else if(position == 2) {
            if(place2 != null) {
                return "La place 2 est occupée";
            }
            place2 = plane;
            return "ok";
        }
        else {
            return "Position incorrecte";
        }
    }

    public int nextFreePlace(){
        if (place1 == null) {
            return 1;
        }
        else if(place2 == null){
            return 2;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        AirportBean airportBean = new AirportBean();
        PlaneBean a1 = new PlaneBean();
        a1.setName("A1");
        PlaneBean a2 = new PlaneBean();
        a2.setName("A2");

        int nextPLace = airportBean.nextFreePlace();
        System.out.println(airportBean.park(a2, nextPLace));
        System.out.println(airportBean.park(a2, nextPLace));

        nextPLace = airportBean.nextFreePlace();
        System.out.println(airportBean.park(a1, nextPLace));

        airportBean.state();
        System.out.println(airportBean.nextFreePlace());

    }


}
