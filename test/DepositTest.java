import java.util.Scanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Deposit.Deposit;
/**
 *
 * @author Comp
 */
public class DepositTest {
    private static Deposit obj; 
    
    @BeforeClass
     public static void RunT(){
        obj=new Deposit();
        }
     
    @Test
        public void test_depositOne(){
            double months = obj.Persent(5);
            Assert.assertTrue(months==2);
        }
    @Test
        public void test_depositTwo(){
            double months = obj.Persent(15);
            Assert.assertTrue(months==1);
        }
    @Test
        public void test_depositThree(){
            double months = obj.Persent(1);
            Assert.assertTrue(months==10);
        }

}
