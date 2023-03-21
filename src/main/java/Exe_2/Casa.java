package Exe_2;

public class Casa {

    public static void main(String[] args) {

        int contador = 0;

        SistemaDaPorta porta1DaCasa = new SistemaDaPorta("azul", 2, 4, 5);

        SistemaDaPorta porta2DaCasa = new SistemaDaPorta("azul", 2, 4, 5);

        SistemaDaPorta porta3DaCasa = new SistemaDaPorta("azul", 2, 4, 5);

        porta1DaCasa.abrirPorta();
        porta2DaCasa.fecharPorta();
        porta3DaCasa.fecharPorta();


       porta1DaCasa.pintarPorta("Vermelho");
       porta2DaCasa.pintarPorta("roxo");
       porta3DaCasa.pintarPorta("rosa");

       porta1DaCasa.statusSimplesdaPorta();
       porta2DaCasa.statusSimplesdaPorta();
       porta3DaCasa.statusSimplesdaPorta();

       if (porta1DaCasa.Aportaestaaberta()){
            contador++;
       }


        if (porta2DaCasa.Aportaestaaberta()){
            contador++;
        }


        if (porta3DaCasa.Aportaestaaberta()){
            contador++;
        }

        System.out.println(contador + " Estão abertas");
    }


}
