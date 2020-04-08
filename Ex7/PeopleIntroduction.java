class Person{

    private String name;

    public Person(String name){
	this.name=name;
    }

    public String introduction(){
	return "My name is " + name + ".";
    }
}

class Student extends Person {
    
    public String id;
    
    public Student(String name, String id){
	super(name);
	this.id = id;
    }
    
    public String getID() { return id; }

    public String introduction() {

	return "I am a student. " +
        
	    super.introduction() + " My ID is "+ id + ".";

    }
}

class EnglishPerson extends Person{

    public EnglishPerson(String name){
	super(name);
    }

    public String introduction() {

	return "How do you do? " +
        
	    super.introduction();

    }
}

class EnglishStudent extends Student{
    
    public EnglishStudent(String name, String id){
	super(name,id);
    }
    
    public String getID() { return id; }

    public String introduction() {

	return "How do you do? " +
        
	    super.introduction();

    }
}

class JapanesePerson extends Person{

    public JapanesePerson(String name){
	super(name);
    }

    public String introduction() {

	return "Hajime mashite. " +
        
	    super.introduction();

    }
}

class JapaneseStudent extends Student{
    
    public JapaneseStudent(String name, String id){
	super(name,id);
    }
    
    public String getID() { return id; }

    public String introduction() {

	return "Hajime mashite. " +
        
	    super.introduction();

    }
}

class PeopleIntroductionDemo{

    public static void main(String[] args){

	m(new Person("testman"));
        m(new Student("testman2","s1111111"));
	m(new EnglishPerson("testman3"));
	m(new EnglishStudent("testman4", "s2222222"));
	m(new JapanesePerson("testman5"));
	m(new JapaneseStudent("testman6", "s3333333"));

    }

    public static void m(Person x){  
	System.out.println(x.introduction());
    }
}
