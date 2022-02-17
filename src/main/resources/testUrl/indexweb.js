
//управление физическим временем
let dt=0.01;
let tOld =0;
let tNow=0;
let tMillis=0;

//значение поворота колеса мышы
let MW_delta = 0.01;
let MW_press = false;

let widthPrev=0;
let heightPrev = 0;

function setup() {
    createCanvas(800,500,P2D);

    //создание элементов управления
    //всех слоев визуализпации
    //dspSetup();
    //menuSetup();
    //gameSetup();
    //workSetup();

    windowResized();

    }//setup



function draw() {

    //определение физического времени
    tMillis = millis();

    tNow = tMillis*0.001;
    dt=tNow-tOld;
    tOld = tNow;

    //dspDraw();

    MW_delta = 0;//reset to sero mouseWheelValue after cicle of draw
    MW_press = false;

    if (width!=widthPrev ||
        height!=heightPrev ) {
                    windowResized();
                    widthPrev = width;
                    heightPrev = height;
                   // UI.rePosition();
                  //  createFon();
                    }

    }//draw




function windowResized() {

    resizeCanvas(windowWidth,windowHeight)

    //if (layerName = "menu") menuUI.rePosition();
    //if (layerName = "game") gameUI.rePosition();
    }//windowResized

function mouseWheel(event){
    MW_delta = event.deltaY;
    }

function mousePressed(event){
    MW_press = true;

    //let s = sendAnyHttp("POST","localhost:8080/users/add","{'login':'log','password':'pass'");
    sendRequest();

}



// taken from StackOverflow
function createCORSRequest(method, url){
    let xhr = new XMLHttpRequest();

    xhr.setRequestHeader('Content-type', 'application/json; charset=UTF-8');
    xhr.send(dataStr);

    if ("withCredentials" in xhr){
        xhr.open(method, url, true);
    } else if (typeof XDomainRequest != "undefined"){
        xhr = new XDomainRequest();
        xhr.open(method, url);
    } else {
        xhr = null;
    }
    return xhr;
}

function sendRequest() {
    let theUrl = "http://localhost:8080/users/add"
        //+ encodeURIComponent("some text input");
    alert(theUrl); // verified this is correct using Postman
    let request = createCORSRequest("POST", theUrl);
    if (request){
        request.onreadystatechange = function() {
            console.log(request); // shows responseText empty
            alert("http returned " + request.responseText);
        };
        request.send();
    }
}
