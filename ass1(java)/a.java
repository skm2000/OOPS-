class Room{
    float length;
    float breadth;
    void getData(float a,float b){
        length=a;
        breadth=b;
    }
}
class RoomArea{
    public static void main(String args[]){
        float area;
        Room room1 = new Room();
        room1.getData(14,10);
        area = room1.length + room1.breadth;
        System.out.println("Area is "+area);
    }
}