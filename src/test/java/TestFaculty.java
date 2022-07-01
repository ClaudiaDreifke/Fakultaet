import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 public class TestFaculty {

      @Test
     void testFaculty10(){

         //given
         int num = 10;

         //when
         int actual = Faculty.faculty(num);

         //then
         Assertions.assertEquals(3628800, actual);
     }

     @Test
     void testFaculty2_10(){

         //given
         int num = 10;

         //when
         int actual = Faculty.faculty2(num);

         //then
         Assertions.assertEquals(3628800, actual);
     }


 }

