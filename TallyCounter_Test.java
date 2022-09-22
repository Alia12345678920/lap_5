public class TallyCounter_Test {
    public static void main(String[] args) {
        TallyCounter c= new TallyCounter();
        System.out.println("the value of counter after building "+c.getValue());
        c.click();
        c.click();
        c.click();
        System.out.println("the value of counter after three clicks "+c.getValue());
        c.undo();
        c.undo();
        c.undo();
        c.undo();


        System.out.println("the value of counter after the undo "+c.getValue());
        c.reset();
        System.out.println("the value of counter after reset "+c.getValue());

    }
}
