const mongoose = require('mongoose');

const express = require('express');

const app = express();

require('./db/conn');
//linking routers   
app.use(require('./routers/userRouter'));

//const USer = require('./models/users');




const middleware = (req, res, next) => {

    console.log('middle');
}

middleware();

app.get('/', (req, res) => {

    res.send("hello from sever");

});



app.get('/index.html', (req, res) => {

    res.send("hi doctor");

});


app.get('/', (req, res) => {

    res.send("hello from sever");

});

app.listen(3000, () => {

    console.log("3000 at sever ");
})



[
    
{
Name: "Professor Dr. M S I Mullick",
Qualification :" MBBS, Phd, FCPS, MRC Psyc ( London ) , DCAP"
Designation : "Professor & Chairman, Department of Pshychiatric"
Expertise : "Psychiatry"
Organization: "Bangabandhu Sheikh Mujib Medical University (BSMMU), Shahbagh, Dhaka"
Chamber: "Labaid Hospital Ltd"
Location: House # 1, Road # 4, Dhanmondi, Dhaka – 1205
Phone: + 880-2-8610793-8, 9670210-3 ( Chamber )
    

},
{


},

]
