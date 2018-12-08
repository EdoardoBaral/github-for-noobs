public class Main
{
    public static void main(String[] args)
    {
        Persona p = new Persona();
        p.setNome("Edoardo");
        p.setCognome("Baral");
        p.setEta(27);
        p.setProfessione("Sviluppatore Java");

        System.out.println(p.toString());
    }
}
