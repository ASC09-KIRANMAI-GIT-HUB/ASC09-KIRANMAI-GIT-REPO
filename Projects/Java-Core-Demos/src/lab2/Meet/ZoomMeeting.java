package lab2.Meet;

public class ZoomMeeting extends Meeting{
    private String deviceId;
    private String accountId;

    public ZoomMeeting(String meetingId, int capacity, String floorLocation, String deviceId, String accountId) {
        super(meetingId, capacity, floorLocation);
        this.deviceId = deviceId;
        this.accountId = accountId;

    }

    public String getDeviceId(){
        return deviceId;
    }

    public String getAccountId(){
        return accountId;
    }

    @Override
    public String toString(){
        return super.toString() + " , Zoom Device ID: " + deviceId + " , Zoom Account Id: " + accountId;
    }



}
