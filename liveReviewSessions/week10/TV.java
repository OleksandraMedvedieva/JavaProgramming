package week10;

public class TV {

    public int channel;
    public int volumeLevel;
    public boolean on;

    public TV(){  // default level
        channel =1;
        volumeLevel =1;
        on = false;
    }

    public void turnOn(){
        on= true;
    }

}
