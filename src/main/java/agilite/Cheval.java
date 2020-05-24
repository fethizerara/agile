package agilite;


/**
 * Décrivez votre classe Cheval ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Cheval 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int id;
    private int age;
    private Box box; 
    
    /**
     * Constructeur d'objets de classe Cheval
     */
    public Cheval(int _numero,int _age)
    {
        // initialisation des variables d'instance
        this.id = _numero;
        this.age = _age;
        this.box = null;
    }


    public Box getBox() {
    	return this.box;
    }
    
    public void setBox(Box _box) {
    	this.box = _box;
    }
    
    
    
    public int getId (){
        
        return this.id;
    }
    
    
    public void setId(int _numero){
     this.id = _numero;
    }
    
    public int getAge (){
        
        return this.age;
    }
    
    
    public void setAge(int _age){
     this.age = _age;
    }
    
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String statutCheval()
    {
        // Insérez votre code ici
        return "le statut du cheval "+ this.id + " : age => "+this.age; 
    }
}
