package pl.jkan.credit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAllowsToAssignCreditLimit(){
        //Arrange / Given
        CreditCard creditCard = new CreditCard();
        //A Act   / When
        creditCard.assignLimit(BigDecimal.valueOf(1000));

        //Assert  / Then / Expected
        assertEquals(BigDecimal.valueOf(1000), creditCard.getBalance());
        //creditCard.getSaldo().equals(BigDecimal.valueOf(1000));

    }
    @Test
    void itAllowsToAssignCreditLimit1(){
        //Arrange / Given
        CreditCard creditCard = new CreditCard();
        //A Act   / When
        creditCard.assignLimit(BigDecimal.valueOf(1000));

        //Assert  / Then / Expected
        assertEquals(BigDecimal.valueOf(1000), creditCard.getBalance());
        //creditCard.getSaldo().equals(BigDecimal.valueOf(1000));

    }
    @Test
    void itDenyToAssignLimitTwiceV1(){
        CreditCard creditCard = new CreditCard();
        creditCard.assignLimit(BigDecimal.valueOf(2000));

        try {
            creditCard.assignLimit(BigDecimal.valueOf(2000));
            fail ("It should throw exception");}
        catch (CantAssignLimitTwiceException e){
            assertTrue( true);

        }
    }

    @Test
    void itDenyToAssignLimitTwiceV2(){
        CreditCard creditCard = new CreditCard();
        creditCard.assignLimit(BigDecimal.valueOf(2000));

        assertThrows(CantAssignLimitTwiceException.class, () ->{
                creditCard.assignLimit(BigDecimal.valueOf(2000));

        });
    }
}
