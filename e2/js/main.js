function init(){
    console.log("JS cargado");
    let numP = getNesimoPrimo(1001);
    document.getElementById("primo").innerHTML = numP;
}

function getNesimoPrimo(num){
    let i = 0;
    let numP = 0;
    do{
        numP++;
        if(esPrimo(numP)){
            i++;
        }
    }while(num !== i);
    return numP;
}

function esPrimo(num){
    for(let i = 2; i < num; i++){
        if(num % i === 0)
            return false;
    }
    return num!==1;
}

window.onload = init;