package agilite;



import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChevalTest
{
    private Cheval cheval1;
    private Box box1;

    /**
     * Constructeur de la classe-test ChevalTest
     */
    public ChevalTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        cheval1 = new Cheval(333, 8);
        ArrayList<Cheval> chevaux = new ArrayList<Cheval>();
        chevaux.add(cheval1);				
        box1 = new Box(chevaux, 2);
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testStatut()
    {
        Cheval cheval1 = new Cheval(323, 7);
        Cheval cheval2 = new Cheval(333, 8);
        assertEquals("le statut du cheval 333 : age => 8", cheval2.statutCheval());
        assertEquals(8, cheval2.getAge());
        assertEquals(333, cheval2.getId());
    }

    
    
    @Test
    public void testRemoveCheval()
    {
        Cheval cheval1 = new Cheval(323, 7);
        Box box1 = new Box ();
        box1.addCheval(cheval1);
        assertEquals(box1.getCheval(0), cheval1);
        box1.removeCheval(cheval1);
        assertEquals(cheval1.getBox(), null);

    }

    
    @Test
    public void testAddCheval()
    {
        Cheval cheval1 = new Cheval(323, 7);
        Box box1 = new Box ();
        box1.addCheval(cheval1);
        assertEquals(box1.getCheval(0), cheval1);
        assertEquals(cheval1.getBox(), box1);

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
 //   @Test
 //   public void testBoxAndCheval()
  //  {
  //      Cheval cheval1 = new Cheval(333, 8);
   //     ArrayList<Cheval> chevaux = new ArrayList<Cheval>();
   //     chevaux.add(cheval1);
   //     Box box1 = new Box (chevaux,2);
   //     assertEquals("le box numero : 2 Contient le cheval numero : 333 et son age est 8", box1.boxResumeCheval(0));
   // }
}


