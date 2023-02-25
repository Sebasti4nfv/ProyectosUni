document.getElementById("Procesar").addEventListener('click',function(){

    let Ventas = parseInt(document.getElementById("_Precio").value);

    let Comision = Ventas * 0.05;

    let SueldoB = 350.75 + Comision;

    let descuento = SueldoB * 0.15;

    let SueldoN = SueldoB - descuento;

    document.getElementById("resultado").value = "Sueldo básico: 350.75" 
    + "\n" + 
    "La comisión de ventas es de : " + Comision + "\n" +
    "El sueldo bruto es de : " + SueldoB + "\n" +
    "El duento: " + descuento + "\n" +
    "El sueldo neto es : " + SueldoN;

},false);