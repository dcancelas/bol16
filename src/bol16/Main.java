package bol16;

public class Main {

    public static void main(String[] args) {
        IPodeCantar persoa = new Persoa();
        persoa.cantar();
        IPodeCantar canario = new Canario();
        canario.cantar();
        IPodeCantar galo = new Galo();
        galo.cantar();
    }
}
