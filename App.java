public class App{
    public static void main(String args[]){
        ContaCorrente c = new ContaCorrente("xx22");
        c.deposito(100);
        c.retirada(50);
        c.deposito(30);
        System.out.println(c.getSaldo());

        ContaTotDep ct = new ContaTotDep("abc123");
        ct.deposito(100);
        ct.retirada(50);
        ct.deposito(30);
        System.out.println(ct.getSaldo());
        System.out.println(ct.getTotDep());
    }
}