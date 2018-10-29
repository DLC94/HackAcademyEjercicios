function init(){
    console.log("JS cargado");

    let sum = getSumBelow(1000);
    document.getElementById("suma").innerHTML = sum;
    console.log(sum);
}

function getSumBelow(num){
    var suma = 0;
    for(let i = 0; i < num ; i++){
        if(isMultiple(i,3) || isMultiple(i,5)){
            suma+=i;
        }
    }
    return suma;
}

function isMultiple(num,div){
    if(num%div)
        return false
    return true
}

window.onload = init;