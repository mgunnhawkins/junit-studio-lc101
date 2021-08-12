package test;


import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //1. only brackets returns true
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //2. no brackets should return true
    @Test
    public void noBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //3.  left bracket return false
    @Test
    public void leftBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //4.  right bracket return false
    @Test
    public void rightBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // 5. only one bracket ] with text should return false
    @Test
    public void rightBracketWithTextReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
    // 6. only one bracket [ with text should return false
    @Test
    public void leftBracketWithTextReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    // 7. [ text ] should return true
    @Test
    public void textWithBracketsReturnTrue(){
       assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    // 8. text [ aasetjk ] should return true
    @Test
    public void textWithBalancedMiddleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    // 9. text[] is true
    @Test
    public void textOutsideOfBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    //10. brackets in wrong order should return false
    @Test //TEST DOES NOT PASS
    public void bracketsInWrongOrderNoTextReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //11. TEST DOES NOT PASS
    @Test
    public void textWithOutsideBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    //12. ]text[ is false
    @Test //TEST DOES NOT PASS
    public void insideOutBracketsWithTextReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }
    //  13. text ][ is false
    @Test //TEST DOES NOT PASS
    public void textOutsideBracketsInWrongOrderReturnFalse(){
       assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));
    }









}
