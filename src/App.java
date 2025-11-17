public class App {
    public static void main(String[] args) throws Exception {

        //pilha de int
        Pilha p = new Pilha();
        p.inserirVarios(10,20,30);
        p.imprimir();
        int x = p.remove();
        System.out.println("Removeu: " + x);
        int y = p.remove();
        System.out.println("Removeu: " + y);
        System.out.println("valor do topo: " + p.valorTopo());
        System.out.println(" ");


        //pilha generica com string
        PilhaGenerica<String> pilhaDeNomes = new PilhaGenerica<String>();
        pilhaDeNomes.inserir("Ana");
        pilhaDeNomes.inserir("Bruno");
        pilhaDeNomes.inserirVarios("Carla", "Daniel");

        pilhaDeNomes.imprimir();

        String nome = pilhaDeNomes.remove();
        System.out.println("Removeu: " + nome);
        
        pilhaDeNomes.imprimir();
    }
}
