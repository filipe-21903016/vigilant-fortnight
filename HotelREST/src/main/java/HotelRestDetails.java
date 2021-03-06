
public interface HotelRestDetails {
	String ping();
    String bookRoom(Book book); //returns reservation id
    String listAvailableRooms(String checkInDate, String checkOutDate);
    String cancelReservation(Book book);
    String registerUser(Client client);
    String loginUser(Client client);
    String booksByEmail(Client client);
    String getRoomFloorAndCapacity(int roomId);
}
