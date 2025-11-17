public class Pilha{
    private static int TAM_MAX = 1000;
    private int valores[];
    private int topo;

    public Pilha(){
        this.valores = new int[TAM_MAX];
        this.topo = 0; 
    }

    public boolean vazio(){
        if(this.topo == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean cheio(){
        if(this.topo == TAM_MAX){
            return true;
        }else{
            return false;
        }
    }

    public int inserir(int x){
        if(this.cheio() == false){
            valores[topo] = x;
            topo++;
            return 1;
        }

        return 0;
    }

    public int inserirVarios(int... x){
        int tamanho = x.length;

        if((tamanho + topo) >= TAM_MAX){
            return 0;
        }
        for(int valor : x){
            valores[topo] = valor ;
            topo++;
        }

        return 1;
    }

    public int copia(Pilha p){
        if((topo + p.topo) >= TAM_MAX){
            return 0;
        }

        for(int i = 0; i < p.topo; i++){
            valores[topo] = p.valores[i];
            topo++;
        }

        return 1;
    }

    public int remove(){
        if(vazio())
            return -999999999;

        int x;
        x = valores[topo-1];
        topo--;
        return x;
    }

    public void desempilha(int x){
        if(x > topo)
            topo = 0;

        for(int i = 0; i < x; i++){
            this.remove();
        }
    }

    public int valorTopo(){
        if(vazio())
            return -999999999;
        
        return valores[topo-1];
    }

    public void imprimir(){
        System.out.print("Pilha: ");
        for(int i = 0; i < topo; i++){
            System.out.print(valores[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

}
