package lab2.Meet;

public class Meeting {
    private String meetingId;
    private int capacity;
    private String floorLocation;

    public Meeting(String meetingId, int capacity, String floorLocation){
        this.meetingId = meetingId;
        this.capacity = capacity;
        this.floorLocation = floorLocation;
    }

    public String getMeetingId(){
        return meetingId;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getFloorLocation(){
        return floorLocation;
    }

    @Override
    public String toString(){
        return "Room Id: " + meetingId + ", Capacity: " + " , Floor: " + floorLocation;
    }
}
