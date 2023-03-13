public class Main {
    public static void main(String[] args) {
        System.out.println("Hello fadel!");

        String color="gris";
        String prgramingLang= "python";
        String hobbi="learn";

        String nom="citroyen";
        String model="C4";
        int annee=2222;


        Fadel fadel=new Fadel();
        fadel.phrase(color, hobbi,prgramingLang);


        Voiture firstCar =new Voiture();
        firstCar.annee=2343;
        firstCar.presentation(nom,model,annee);


//        FOR THE PRIVATECLASS
        PrivateClass ps =new PrivateClass();
      ps.setNomPerson("bamaba");

        System.out.println(ps.getNomPerson());

        ps.showName(ps.setNomPerson("fatou"));

    }


}