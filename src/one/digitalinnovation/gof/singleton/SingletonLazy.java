package one.digitalinnovation.gof.singleton;

// Singleton permite que apenas tenha 1 instancia,e não permite que se instancie mais vezes.

public class SingletonLazy {

//Singleton possui uma instancia dele mesmo
    private static SingletonLazy instancia;

//Para garantir que não vai ser possível instanciar externamente, criamos o construtor com 'PRIVATE'
    private SingletonLazy() {

        super();
    }
//Garante que será instanciado apenas quando ainda for 'NULL', ou seja, qdo for a primeira vez. Numa próxima chamada apenas retornará a p´ropria instancia
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}

