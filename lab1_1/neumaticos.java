class neumaticos {
 int cantN;
 double pago;

 public neumaticos (int cantN)
 {
    this.cantN = cantN;
 }
 void PrecioP(int cantN)
 {
    if( cantN <3)
    {
        pago = cantN * 145;
        System.out.println("La cantidad a pagar es de: " + pago);
    }
    else if (cantN <5 && cantN>=3)
    {
        pago = cantN  * 138;
        System.out.println("La cantidad a pagar es de: " + pago);
    }
    else{
        pago= cantN *135;
        System.out.println("La cantidad a pagar es de: " + pago);
    }
 }
}