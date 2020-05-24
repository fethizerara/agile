package agilite;

import java.util.ArrayList;

import cucumber.api.PendingException;

/**
 * Décrivez votre classe Box ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Box
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList<Cheval> chevaux;
    private int numero;
    

    /**
     * Constructeur d'objets de classe Box
     */
    public Box()
    {
        // initialisation des variables d'instance
        this.chevaux = new ArrayList<Cheval>();
        this.numero = 0;
    }
     
    public Box(ArrayList<Cheval> _chevaux, int _numero)
    {
        // initialisation des variables d'instance
        this.chevaux = _chevaux;
        this.numero = _numero;
    }

    
    public void setNumero(int num){
        this.numero = num;
    }
    
    public int getNumero(){
        return this.numero;
    }
    

    
    public ArrayList<Cheval> getChevaux (){
    	return this.chevaux;
    }
    
    // Ajouter un cheval au Box en mettant a jour l'information du cheval 
    
     public void addCheval(Cheval c){
        this.chevaux.add(c);
        if (c.getBox()==null) {
        	c.setBox(this);
        }
    }
     
     // supprimer un cheval du Box en mettant a jour l'information du cheval 
     
    // public boolean removeCheval(Cheval c){
    //	 if(c.getBox().equals(this)) {
    //		 c.setBox(null);
    //		 chevaux.remove(c);	 
    //		 return true;
    //	 }    
    //	 return false;
   //  }
     
     
     
     public boolean removeCheval(Cheval c){
    	return (this.removeCheval(c.getId()));
     }

     // supprimer un cheval du Box en mettant a jour l'information du cheval 
     public boolean removeCheval(int id){
    	 Cheval c = null ;
    	 for (int i =0; i<chevaux.size();i++) {
    		 if(chevaux.get(i).getId()== id) {
    			 c = chevaux.get(i);
    			 if(c.getBox().equals(this)) {
    	    		 c.setBox(null);
    	    		 chevaux.remove(c);	 
    	    		 return true;
    	    	 }  	 
    		 }
	 	
    	 }
		 return false;

     }
     
     
     
     @Override
     public boolean equals(Object o) {
    	 if (this==o) return true;
    	 if(!(o instanceof Box)) return false;
    	 Box box = (Box) o;
    	 return numero == box.getNumero();
     }
     
     
     
     
     public Cheval getCheval(int index) {
    	  return this.chevaux.get(index);
     }
 
    
    public String boxResumeCheval(int index){
    	if(index <= chevaux.size())
        return "le box numero : " + this.numero + " Contient le cheval : " + chevaux.get(0).getId() + " et son age est " + chevaux.get(0).getAge();
    	else
    	return " l'index en argument dépasse le size du box ou le cheval n'apartient pas au box";
    }
    
    
    
   // @Given("^User wants to empty the box$")
    public static void  user_wants_to_empty_the_box(Box box) {
    	if(the_box_is_not_empty(box)) {
    		empty_the_box(box);
        	System.out.println("The box has been cleared");
    	}
    	else 
    	System.out.println("The box is already empty");
    }

    //@When("^The box is not empty$")
    public static boolean the_box_is_not_empty(Box box)  {
        return box.getChevaux().size()>0;
    }

   // @Then("^Empty the box$")
    public static void empty_the_box(Box box)  {
    	for(int i=0;i<box.getChevaux().size();i++) {
    		box.getChevaux().get(i).setBox(null);
    	}	
       box.getChevaux().removeAll(box.getChevaux());    	
   
    }

    
    
  //  @Given("^User wants to take the yougest hourse from the box$")
    public void user_wants_to_take_the_yougest_hourse_from_the_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

   // @When("^the box is filled$")
    public void the_box_is_filled() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

 //   @Then("^get the yougest hourse$")
    public void get_the_yougest_hourse() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
