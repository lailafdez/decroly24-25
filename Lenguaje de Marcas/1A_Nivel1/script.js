//Ejercicio1
const ejercicio1 = document.getElementById('boton1');

ejercicio1.addEventListener('click', () => {
    mensaje1.textContent= 'Buenos dias';
})

//Ejercicio2
const ejercicio2 = document.getElementById('boton2');
const lado = 5;
const area = lado*lado;

ejercicio2.addEventListener('click', () => {
    mensaje2.textContent = 'El area de un cuadrado de lado 5 es ' + area;
})

//Ejercicio3
const ejercicio3 = document.getElementById('boton3');

ejercicio3.addEventListener('click', () => {
    let lado1 = Number;
    lado1 = prompt('Escribe el lado del cuadrado');
    const area1 = lado1*lado1;
    mensaje3.textContent = 'El area de un cuadrado de lado ' + lado1 + 'es ' + area1;
})

//Ejercicio4
const ejercicio4 = document.getElementById('boton4');

ejercicio4.addEventListener('click', () => {
    let numero1 = Number;
    let numero2 = Number;
    numero1 = prompt('Escribe un numero');
    numero2 = prompt('Escribe otro numero');
    const suma = numero1 + numero2;
    const resta = numero1 - numero2;
    const multiplicacion = numero1 * numero2;
    const division = numero1 / numero2;
    mensaje4.textContent = 'La suma total de los numeros es ' + suma + ', la resta es ' + resta + ', la multiplicacion es ' + multiplicacion + ' y la division es ' + division;
})

//Ejercicio5
const ejercicio5 = document.getElementById('boton5');

ejercicio5.addEventListener('click', () => {
    let radio = Number;
    const pi = 3.14;
    radio = prompt('Escribe el radio de la circunferencia');
    const longitud = 2 * pi * radio;
    const areaCirculo = pi * (radio * radio);
    const volumenCirculo = 1.3 * pi * (radio * radio * radio);
    mensaje5.textContent = 'Si el radio de la circunferencia es ' + radio + ', la longitud es ' + longitud + ', el area es ' + areaCirculo + ' y el volumen es ' + volumenCirculo;
})

//Ejercicio6 
const ejercicio6 = document.getElementById('boton6');

ejercicio6.addEventListener('click', () => {
    let precioConDescuento = Number;
    let precioSinDescuento = Number;
    precioConDescuento = prompt ('Escribe el precio de venta con descuento');
    precioSinDescuento = prompt ('Escribe el precio de venta sin el descuento');
    const descuento = (precioSinDescuento - precioConDescuento) / precioSinDescuento;
    mensaje6.textContent = 'El total descuento que tiene este articulo es de ' + descuento;
})