class obrero {
 int horas;
 float pago;
 
 public obrero(int horas)
 {
    this.horas = horas;
 }

 float opPago()
 {
    if (horas<40)
    {
        pago = horas *16;
    }
    else {
        pago =  640 + (horas-40) * 20;
    }
    return pago;
 }
}
