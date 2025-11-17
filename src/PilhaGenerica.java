public class PilhaGenerica<T> {
    
    private static int TAM_MAX = 1000;
    private T valores[];
    private int topo;

    @SuppressWarnings("unchecked")
    public PilhaGenerica() {
        this.valores = (T[]) new Object[TAM_MAX];
        this.topo = 0;
    }

    public boolean vazio() {
        return this.topo == 0;
    }

    public boolean cheio() {
        return this.topo == TAM_MAX;
    }

    public int inserir(T x) {
        if (this.cheio() == false) {
            valores[topo] = x;
            topo++;
            return 1;
        }
        return 0;
    }

    public int inserirVarios(T... x) {
        int tamanho = x.length;

        if ((tamanho + topo) > TAM_MAX) {
            return 0;
        }
        
        for (T valor : x) {
            valores[topo] = valor;
            topo++;
        }
        return 1;
    }

    public int copia(PilhaGenerica<T> p) {
        if ((topo + p.topo) > TAM_MAX) {
            return 0;
        }
        for (int i = 0; i < p.topo; i++) {
            valores[topo] = p.valores[i];
            topo++;
        }
        return 1;
    }

    public T remove() {
        if (vazio())
            return null;

        topo--;
        T x = valores[topo];
        valores[topo] = null;
        return x;
    }

    public void desempilha(int x) {
        if (x > topo)
            topo = 0;

        for (int i = 0; i < x; i++) {
            this.remove();
        }
    }

    public T valorTopo() {
        if (vazio())
            return null;

        return valores[topo - 1];
    }

    public void imprimir() {
        System.out.print("Pilha: ");
        for (int i = 0; i < topo; i++) {
            System.out.print(valores[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
}