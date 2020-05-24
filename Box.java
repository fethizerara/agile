package agilite;

import java.util.ArrayList;

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
}
