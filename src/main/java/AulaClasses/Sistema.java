package AulaClasses;

public class Sistema {

    public static void main(String[] args) {

        Pessoa ser = new Pessoa("Hagna");
        ser.setIdade(32);

        ser.fazaniversario();
        ser.fazaniversario();
        ser.fazaniversario();

        System.out.println("nome: " + ser.getNome());
        System.out.println("idade atual: " + ser.getIdade());

    }
}
