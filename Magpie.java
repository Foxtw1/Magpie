public class Magpie{

String name;
String question;


    public Magpie(String name){

        this.name = name;



    }


    public String getName() {

        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String identify(String question){

        this.question = question;

        checkForHow(question);
        checkForWhat(question);
        checkForWhen(question);
        checkForWhy(question);
        checkForGreeting(question);
        checkForBadWord(question);




    }





}