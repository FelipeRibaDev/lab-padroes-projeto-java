package one.digitalinnovation.gof.singleton;


 // Singleton permite que apenas tenha 1 instancia,e não permite que se instancie mais vezes.
// SingletonLazyHolder é a forma mais segura de criar o Singleton ' https://stackoverflow.com/a/24018148 '

public class SingletonLazyHolder {

//Essa classe incapsula a instancia deixando mais seguro.
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
