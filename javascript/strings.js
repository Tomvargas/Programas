/* 
    Este ejercicio comprende los métodos más utilizados en el estanddard actual
    Te invito a ver mis apuntes donde encontrarás la teoría de todos los temas de Js
    🌎 https://tomvargasd.notion.site/JAVASCRIPT-NOTES-4dbf0da11f364f5f96f8e672e46cd6ca 
    Omitan el ingles mal escrito, estoy aprendiendo 😅
*/
//declaramos una variable const la cual no puede ser modificada y sirve a nivel global
const author = "tomvargas";

//declaramos variables de tipo let (se ejecuta solamente en un bloque
// a diferencia de var o const que sirven a nivel global).
let str1 = "Hola mundo";
let str2 ="Hello world";


//--------------------------------------------------- concatenar cadenas de texto
function contatenar(str1, str2){ // recive dos variables string

    // almacena en la variable newstr el string str1 unido a la cadena ' - es | '
    // todo esto se une a la variable str2 unido a la cadena ' - en'
    let newstr = str1.concat(' - es | '.concat(str2.concat(' - en')));

    return newstr;// devuelve el valor de newstr
}

// el resultado final será "Hola mundo - es | Hello world - en"
console.log(contatenar(str1, str2));
//-------------------------------------------------------------------------------

//------------------------------------------ validar cadenas al inicio o al final
function validar(str1, str2){

    // si str1 comienza con hola y str2 comienza con hello
    if(str1.startsWith('Hola') && str2.startsWith('Hello')){
        return "Ambas cadenas comienzan con Hola";

    // si str1 termina con mundo y str2 termina con world
    }else if(str1.endsWidth('mundo') && str2.endsWidth('world')){
        return "Ambas cadenas terminan con mundo";
    }

    // en el caso que ninguna condición se cumpla, retorna esta cadena
    return "Ninguna cadena empieza con Hola ni termina con mundo";
}

// el resultado al tener las variables "Hola mundo" y "Hello world" será:
// Ambas cadenas comienzan con Hola
console.log(validar(str1, str2));
//-------------------------------------------------------------------------------

// --------------------------------------------------------- buscar en una cadena
function buscar(str1, str2){
    
    // mensaje por defecto
    let msj = "No hay resultados";

    //si str1 incluye la cadena "mundo" y str2 la cadena "world"
    if(str1.includes("mundo") && str2.includes("world")){
        // el mensaje se modifica
        msj = "Se encontró la cadena mundo y world en las variables srt1 y str2 respectivamente.";
    }

    // regresa el mensaje
    return msj;
}

// el resultado es: 
// Se encontró la cadena mundo y world en las variables srt1 y str2 respectivamente.
console.log(buscar(str1, str2));
//-------------------------------------------------------------------------------

// --------------------------------------------------------- proximamente más ...