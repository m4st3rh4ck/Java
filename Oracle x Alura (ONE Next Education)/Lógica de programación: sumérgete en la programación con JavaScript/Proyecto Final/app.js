alert("Hola Mundo");
/*alert muestra un texto en una ventana flotante en 
la pagina web, console.log muestra un mensaje pero en 
la consola de la pagina web*/
//let numeroIntroducido = prompt("Igresa un numero:");


/*prompt() muestra una ventana emergente en el navegador que 
le pide al usuario que ingrese un texto. Este texto ingresado por 
el usuario puede ser capturado y utilizado en tu código.*/
let numeroSecreto = Math.floor(Math.random()*10)+1;
let numeroIntroducido = 0;
let intentos = 1;
let intentosMaximos = 3;
while (numeroIntroducido != numeroSecreto) {
    numeroIntroducido = parseInt(prompt("Igresa un numero:"));
    console.log(numeroIntroducido);
    if (numeroIntroducido == numeroSecreto) {
        alert(`Acertaste, el numero es ${numeroSecreto}, Lo hiciste en el intento ${intentos}`);
    } else {
        if (numeroIntroducido > numeroSecreto) {
            alert("El numero secreto es menor");
        } else {
            alert("El numero secreto es mayor");
            alert("No acertaste el numero");
        }
        intentos = intentos + 1;
        if(intentos > intentosMaximos){
            alert(`Numero maximo de intentos permitido (${intentosMaximos})`);
            break;
        }
    }
}