
import java.rmi.*;

public interface HotelServerIntf extends Remote{
    public String ping() throws RemoteException;
    public String bookRoom(String checkInDate, String checkOutDate
            , String clientEmail, int numberOfPeople, int roomId) throws RemoteException; //return reservation id
    public String[] listAvailableRooms(String checkInDate, String checkOutDate) throws RemoteException; //return list of rooms
    public boolean cancelReservation(String reservationId) throws RemoteException; //cancels booking
    public boolean registerUser(String email, String password) throws RemoteException; //register user
    public boolean loginUser(String email, String password) throws RemoteException; //login user
    public String[] bookingsByUser(String email) throws RemoteException;
    public String reservationDetails(String id) throws RemoteException;
    public String getFloorAndCapacity(int roomId) throws RemoteException;
}
