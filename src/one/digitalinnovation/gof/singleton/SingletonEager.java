package one.digitalinnovation.gof.singleton;

// Singleton permite que apenas tenha 1 instancia,e não permite que se instancie mais vezes.

public class SingletonEager {

//Singleton possui uma instancia dele mesmo.
//SingletonEager já instancia no momento da criação
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }
//Apenas retorna 'instancia'
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
