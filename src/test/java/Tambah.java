import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tambah {
    @Test
    public void sum(){
        Calculator cal = new Calculator();
        int result1 = cal.sum(2, 3);
        int result2 = cal.sum(5, 5);
        int result3 = cal.sum(4, 3);

        Assertions.assertEquals(5, result1);
        Assertions.assertEquals(10, result2);
        Assertions.assertEquals(7, result3);
    }

    /*@Test
    public void testPenjumlahan(){
        System.out.println("Diekseskusi di dalam test penjumalahan");
        Assertions.assertEquals(10, 5 + 5);
    }*/
}
