document.getElementById("Procesar").addEventListener('click',function(){

    let Cantidad = parseInt(document.getElementById("_Cantidad").value);

    let importeC = Cantidad * 20;

    let descuento = 0;

    let importeCD = 0;

    if(Cantidad >10){

        descuento = importeC * 0.15;
    }
    else {
        descuento = importeC * 0.05;
    }

    let importeN = importeC - descuento;

    if( importeN>200){

        document.getElementById("resultado").value = "El importe de la compra es de: " + importeC + " soles \n" 
        + "El descuento correspondiente: " + descuento + " soles \n" +
        "Precio total a pagar: " + importeN + " soles y se le regala una agenda";
    }
    else {
     
        document.getElementById("resultado").value = "El importe de la compra es de: " + importeC + " soles \n" 
        + "El descuento correspondiente: " + descuento + " soles \n" +
        "Precio total a pagar: " + importeN + " soles y se le regala un cuaderno";
    }


},false);