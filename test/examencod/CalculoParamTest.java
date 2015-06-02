package examencod;


import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
/**
 *
 * @author rzarzafernandez
 */

@RunWith(Parameterized.class)
public class CalculoParamTest {

    
   private int result;
   Calculo cal= new Calculo();
    
    
   @Before
   public void initialize() {
      
   }

   public CalculoParamTest(Calculo cal, int result) {
      this.cal = cal;
      this.result = result;
 
    }

   @Parameterized.Parameters
   public static Collection MCDnumbers() {
      return Arrays.asList(new Object[][] {
         {new Calculo (50,10,"correcto"), 10},
         {new Calculo (2,6,"correcto"), 2},
         {new Calculo (1,1,"correcto"), 1},
         {new Calculo (2,3,"correcto"), 3}                      
      });
   }
   @Test
   public void testMCDnumbersChecker() {
      System.out.println("Parameterized  is : " +result);
      assertEquals(result, cal.obtenerMCD(cal.getNumero1(), cal.getNumero2()));
   }
}