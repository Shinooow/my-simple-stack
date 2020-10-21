package deqo.mdem.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item itemTest;

    @Before
    public void before(){
        itemTest = new Item("Item 1");
    }

    @Test
    public void getName() {
        assertEquals("Ne renvoie pas le nom de l'item", "Item 1", itemTest.getName());
    }

    @Test
    public void getFauxName(){
        assertNotEquals("Renvoie le mauvais nom", "Item 2", itemTest.getName());
    }

    /*
    @Test
    public void fakeNameTest(){
        assertEquals("Ne renvoie pas le nom de l'item", "Item 2", itemTest.getName());
    }
    */

}