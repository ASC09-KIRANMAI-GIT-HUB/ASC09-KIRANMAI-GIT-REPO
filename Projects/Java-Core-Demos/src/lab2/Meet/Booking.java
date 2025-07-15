package lab2.Meet;

public class Booking {
    private Employee employeeId;
    private Meeting meetingId;
    private String meetingDate;
    private String meetingTime;
    private String duration;

    public Booking(Employee employeeId, Meeting meetingId, String meetingDate, String meetingTime, String duration){
        this.employeeId = employeeId;
        this.meetingId = meetingId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;

    }

    public Employee getEmployeeId(){
        return employeeId;
    }

    public Meeting getMeetingId(){
        return meetingId;
    }

    public String getMeetingDate(){
        return meetingDate;
    }

    public String getMeetingTime(){
        return meetingTime;
    }

    public String getDuration(){
        return duration;
    }

    @Override
    public String toString(){
        return "Booking for Employee ID: " + employeeId +
                ", Meeting ID:" + meetingId +
                ", Date: " + meetingDate +
                ", Time: " + meetingTime +
                ", Duration: " + duration;
    }

}
