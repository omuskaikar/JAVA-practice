package Exp5;
class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String e) {
        System.out.println(e);
    }
}

class Result {
    String Name;
    int seatno;
    String date;
    int centerno;
    int marks;

    public Result(String Name, int seatno, String date, int centerno, int marks) {
        this.Name = Name;
        this.seatno = seatno;
        this.date = date;
        this.marks = marks;
        this.centerno = centerno;
    }

    public void getResult(){
        System.out.println("Name :" + Name); 
        System.out.println("Date: "+date); 
        System.out.println("Seat No: "+seatno); 
        System.out.println("Center No: "+centerno); 
        try {
            if (marks > 100 || marks < 0) {
                throw new MarksOutOfBoundsException("marks out of bounds");
            }
            else {
                System.out.println("Center No: "+marks);
            }
        } catch (MarksOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
public class E1q4 {
    public static void main(String[] args) {
        Result r = new Result("om", 0, "12/12/12", 112, 234);
        r.getResult();
    }
    
}
