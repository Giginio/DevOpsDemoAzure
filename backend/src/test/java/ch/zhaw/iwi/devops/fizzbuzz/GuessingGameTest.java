package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GuessingGameTest {
    @Test
    public void GuessingGameCorrect() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Das ist korrekt!", test.guess(10));
    }    
    
    @Test
    public void GuessingGameToohigh() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Deine Schätzung ist zu hoch", test.guess(13));
    }

    @Test
    public void GuessingGameToolow() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Deine Schätzung ist zu tief", test.guess(2));
    }

    @Test
    public void GuessingGameDefault() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Das ist nicht die korrekte Eingabe", test.guess(1));
    }  
        
}
