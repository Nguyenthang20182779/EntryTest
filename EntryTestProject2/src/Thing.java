public class Thing{

    public static void main(String[] args) {

        Video v = new Video();
        v.setSerial();
        System.out.println("Serial of Video: ");
        v.getSerial();

        Furniture f = new Furniture();
        f.setSerial();
        System.out.println("Serial of Furniture: ");
        f.getSerial();

        BookOnTape b = new BookOnTape();
        b.setSerial();
        System.out.println("Serial of Book on tape: ");
        b.getSerial();

    }


}


