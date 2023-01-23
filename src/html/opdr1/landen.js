const fs= require("node:fs");

var button1=document.querySelector("#o1");
var button2=document.querySelector("#o2");
var button3=document.querySelector("#o3");

const filepath="src/html/opdr1/countries";

const filenames = fs.readdirSync(filepath)

var displayImg=document.getElementById("imagecontainer");

filenames.map((filename) => {
    console.log(filename)
})

var currentImage="";

var pair=[];







