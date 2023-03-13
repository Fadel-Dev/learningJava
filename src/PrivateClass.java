public class PrivateClass {
    private  String nomPerson;

    public String getNomPerson() {
        return nomPerson;
    }

    public String setNomPerson(String nomPerson) {
        this.nomPerson = nomPerson;
        return nomPerson;
    }

    public void showName(String nomPerson)
    {
        System.out.println("My name is "+ nomPerson);
    }
}
