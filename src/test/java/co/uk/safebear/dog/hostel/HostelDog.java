package co.uk.safebear.dog.hostel;

public class HostelDog extends Dog{

    int roomNumber;
    String bedType;

    public void setRoomAndBed(int _roomNumber, String _bedType){
        this.roomNumber = _roomNumber;
        this.bedType = _bedType;
    }

    public String getDogBedType(){
        return this.bedType;
    }


}
