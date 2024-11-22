public class CuentaBancaria {
    
    //Atributos
    private String iban;
    private String titular;
    private double saldo;
    private Movimiento [] movimientos;
    private int nMovientos;

    //Constructores
    public CuentaBancaria (String iban1, String titular1, double saldo) {

        this.iban = iban1;
        this.titular = titular1;
        this.saldo = 0;
        this.movimientos = new Movimiento[100];
        this.nMovientos = 0;
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo () {
        return saldo;
    }
    public int getnMovientos() {
        return nMovientos;
    }

    public String informacionCuenta(){
        String info = String.format("Informacion de tu cuenta - IBAN %s, Titular de la cuenta - %s Saldo de la cuenta - %s", this.iban, this.titular, this.saldo);

        return info;
    }

    public String informacionIban(){
        String getIban = String.format("Tu IBAN es: " + this.iban);
        return getIban;
    }

    public String informacionTitular(){
        String getTitular = String.format("Titular de la cuenta: " + this.titular);
        return getTitular;
    }

    public String informacionSaldo(){
        String getSaldo = String.format("Saldo actual: " + this.saldo);
        return getSaldo;
    }

    //Meter dinero en la cuenta
    public boolean ingresarDinero (Movimiento m1) {
        boolean isAdd = false;
        if (m1 != null) {
            this.movimientos[nMovientos] = m1;
            this.nMovientos++;

            saldo += m1.getCantidad() + saldo;
            isAdd = true;
        }
        return ingresarDinero(m1);
    }

    //Sacar dinero en la cuenta
    public boolean sacarDinero (Movimiento m1) {
        boolean isAdd = false;
        if (m1 != null) {
            if (this.saldo - m1.getCantidad() < 0) {
                System.out.println("AVISO: Saldo negativo" + this.saldo);
                if (this.saldo - m1.getCantidad() < -50) {
                    System.out.println("El saldo no puede ser menor inferior a -50€");
                }
                else {
                    if (m1.getCantidad() > 3000) {
                        System.out.println("AVISO: Notificar a hacienda");
                    }   

                    this.movimientos[nMovientos] = m1;
                    this.nMovientos++;
        
                    this.saldo -= m1.getCantidad(); 
                    isAdd = true;
                }
            }
            else {
                if (m1.getCantidad() > 3000) {
                    System.out.println("AVISO: Notificar a hacienda");
                }   

                this.movimientos[nMovientos] = m1;
                this.nMovientos++;

                this.saldo -= m1.getCantidad();
                isAdd = true;
            }
        }
        return sacarDinero(m1);
    }
    
    public String informacionMovimiento (){
        String infoMovimientos = "";
        for(int i = 0; i < nMovientos; i++){
            infoMovimientos += movimientos [i].infoMovimiento();
        }
        return infoMovimientos;
    }
    
}





    

