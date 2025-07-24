/*Pregunta al usuario qué día de la semana es. 
Si la respuesta es "Sábado" o "Domingo", muestra "¡Buen fin de semana!".
 De lo contrario, muestra "¡Buena semana!".*/
 let dia = prompt("¿Que dia de la semana es?: ");
 if(dia == "Sabado" || "Domingo"){
    alert("¡Buen fin de semana!");
 } else{
    alert("¡Buena semana!");
 }

/*Verifica si un número ingresado por el usuario es positivo o negativo.
 Muestra una alerta informativa.*/
 let numero = prompt("Ingresa un numero: ");
if(numero > 0){
    alert(`${numero} es positivo`);
} else{
    alert(`${numero} es negativo`);
}

/*Crea un sistema de puntuación para un juego. Si la puntuación es mayor o 
igual a 100, muestra "¡Felicidades, has ganado!". En caso contrario,
 muestra "Intentalo nuevamente para ganar."*/

let puntuacion = 100;
if(puntuacion >= 100){
    alert("¡Felicidades, has ganado!");
}else{
    alert("Intentalo nuevamente para ganar.");
}

/*Crea un mensaje que informe al usuario sobre el saldo de su cuenta, 
utilizando un template string para incluir el valor del saldo.*/
let saldoCuenta = prompt("Introduce tu saldo de cuenta");
alert(`Tu saldo de cuenta es ${saldoCuenta}`);

/*Pide al usuario que ingrese su nombre mediante un prompt. Luego, 
muestra una alerta de bienvenida usando ese nombre.*/
let nombreUsuario = prompt("Ingresa tu nombre: ");
alert(`Bienvenido ${nombreUsuario}`);