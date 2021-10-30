const mongoose = require('mongoose');

const express = require('express');


const DB = 'mongodb://localhost:27017/userdb';

mongoose.connect(DB, {
    useNewUrlParser: true,
    useCreatedIndex: true,
    useUnifiedTopology: true,
    useFindAndModify: false




}).then(() => {

    console.log('connected succeffulyy');
}).catch((err) => console.log("not yet connected"));
