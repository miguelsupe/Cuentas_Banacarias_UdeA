public class Main {
    public static void main(String[] args) {
        Cuentas c = new Cuentas("123456","ahorro",150000);
        System.out.println("saldo minimo: "+c.getSaldoMinimo());
        c.consignar(80000);
        System.out.println("saldo actual : "+c.getSaldoActual());
        c.retirar(200000);
        System.out.println("saldo actual : "+c.getSaldoActual());
        System.out.println("------------------------------");
        Cuentas pedro = new Cuentas("1014","ahorro",5000);
        System.out.println(pedro.toString());
        pedro.setTipo("credito");
        System.out.println(pedro.toString());
        }
    }




