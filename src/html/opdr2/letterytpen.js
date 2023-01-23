fonts=["Arial","Helvetica","Verdana",
    "Calibri","Noto","Lucida Sans",
    "Gill Sans","Century Gothic",
    "Candara","Futara","Franklin Gothic Medium"
    ,"Trebuchet MS","Geneva","Segoe UI",
    "Optima","Avamta Garde"];


function getRandomInt(min,max) {

    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min) + min);
}

function getRandomFont(){
    return fonts[getRandomInt(0,fonts.length)]
}

let element=document.getElementById("change");
let content=element.textContent;


let list=content.split("");

list=list.map(function (char){
    let font=getRandomFont();


    return `<span style="font-family: ${font}">${char}</span>`;

})

element.innerHTML=list.toString();




