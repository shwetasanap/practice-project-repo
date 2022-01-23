class Animal
{
	protected float  height;
	protected float weight;
	protected String type;
	protected String bloodtype;
	
	public Animal() {
		
		this.height = 0;
		this.weight = 0;
		this.type = "unknown";
		this.bloodtype = "unknown";
	}

	public String show() {
		return "Animal [height=" + height + ", weight=" + weight + ", type=" + type + ", bloodtype=" + bloodtype
				+ "]";
	}
	
	
	
	

}

class Reptile extends Animal
{
	protected String skin;
	protected boolean backbone;
	protected String eggtype;
	
	public Reptile() {
		
		height = 5;
		weight =20;
		type="Reptile";
		bloodtype="cold";
		this.skin = "Dry skin";
		this.backbone = true;
		this.eggtype = "Soft shelled";
	}
	
	public String show() {
		return "Reptile [skin=" + skin + ", backbone=" + backbone + ", eggtype=" + eggtype + ", height=" + height
				+ ", weight=" + weight + ", type=" + type + ", bloodtype=" + bloodtype + "]";
	}

}


class Fish extends Animal
{
	protected boolean waterbone;
	protected boolean gills;
	
	public Fish() {
		type="Fish";
		this.waterbone = true;
		this.gills = true;
	}

	
	public String show() {
		return "Fish [waterbone=" + waterbone + ", gills=" + gills + ", height=" + height + ", weight=" + weight
				+ ", type=" + type + ", bloodtype=" + bloodtype + "]";
	}
	
}



class Bird extends Animal
{
	protected boolean feather;
	protected boolean canfly;
	
	public Bird() {
		
		this.feather = true;
		this.canfly = true;
	}

	
	public String show() {
		return "Bird [feather=" + feather + ", canfly=" + canfly + ", height=" + height + ", weight=" + weight
				+ ", type=" + type + ", bloodtype=" + bloodtype + "]";
	}
	
}


class Crocodile extends Reptile
{

	public Crocodile() {
		//super();
		eggtype ="Hard shelled";
		// TODO Auto-generated constructor stub
	}

	
	public String show() {
		return "Crocodile [skin=" + skin + ", backbone=" + backbone + ", eggtype=" + eggtype + ", height=" + height
				+ ", weight=" + weight + ", type=" + type + ", bloodtype=" + bloodtype + "]";
	}
	
	
	
}

class Eel extends Fish
{
	private String extrainfo;

	public Eel() {
		//super();
		this.extrainfo="releases electric charge";
		// TODO Auto-generated constructor stub
	}

	
	public String show() {
		return "Eel [extrainfo=" + extrainfo + ", waterbone=" + waterbone + ", gills=" + gills + ", height=" + height
				+ ", weight=" + weight + ", type=" + type + ", bloodtype=" + bloodtype + "]";
	}
	
	
}


class Eagle extends Bird
{

	
	public Eagle() {
		//super();
		type="Bird";
		// TODO Auto-generated constructor stub
	}

	public String show() {
		return "Eagle [feather=" + feather + ", canfly=" + canfly + ", height=" + height + ", weight=" + weight
				+ ", type=" + type + ", bloodtype=" + bloodtype + "]";
	}
	
}



public class ExerciseInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		System.out.println(animal.show());
		
		Reptile r=new Reptile();
		//System.out.println(r.show());

		Crocodile c=new Crocodile();
		System.out.println(c.show());
		
		Fish f=new Fish();
		//System.out.println(f.show());
		
		Eel e=new Eel();
		System.out.println(e.show());

		Bird b=new Bird();
		//System.out.println(b.show());
		
		Eagle ea=new Eagle();
		System.out.println(ea.show());

	}

}
