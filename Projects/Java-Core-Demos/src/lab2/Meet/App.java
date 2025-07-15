package lab2.Meet;
import lab2.Meet.Booking;
import lab2.Meet.Employee;
import lab2.Meet.Meeting;
import lab2.Meet.ZoomMeeting;

import java.util.*;

public class App {
    private static List<Booking> bookings = new ArrayList<>();

    public static void addBooking(Booking booking){
        bookings.add(booking);
    }

    public static void showBookingsByDate(String date){
        for (Booking b : bookings){
            if (b.getMeetingDate().equals(date)){
                System.out.println(b);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee("E101","Kiranmai");
        Meeting room1 = new Meeting("MR1",10,"2nd Floor");
        ZoomMeeting zoomRoom = new ZoomMeeting("ZR1",8,"3rd Floor","Z123","zoom@corp.com");


        System.out.println("Select a meeting room: 1.Regular 2.Zoom");
        int choice = sc.nextInt();
        sc.nextLine();

        Meeting selectedRoom = (choice == 1) ? room1 : zoomRoom;

        //String selectedRoomId;
        //if (choice == 1){
          //  selectedRoomId = room1.getMeetingId();
        //}else{
        //    selectedRoomId = zoomRoom.getMeetingId();
        //}

        System.out.println("Enter Booking Details: ");
        System.out.println("Employee Id: ");
        String empId = e1.getEmployeeId();

        System.out.println("Meeting Room Id: ");
        String roomId = zoomRoom.getMeetingId();

        System.out.println("Meeting Date (yyyy-mm-dd): ");
        String date = sc.nextLine();

        System.out.println("Meeting Time(hh:mm): ");
        String time = sc.nextLine();

        System.out.println("Duration: ");
        String duration = sc.nextLine();



        System.out.print(" \nEnter date to search bookings: ");
        String searchDate = sc.nextLine();
        showBookingsByDate(searchDate);

        sc.close();
    }
}