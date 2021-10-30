import { Schema, model } from 'mongoose';


const userSchema = Schema({
    name:
    {

        type: String,
        required:true,
        minlength:5,
        maxlength:100,
    },
    phoneNumber:{
        type:Number,
        required:true,
       

    },
    email:{
        type:String,
        required:true,
        minlength:8,
        maxlength:255,
        unique: true,


    },
    password:{
        type:String,
        required:true,
        minlength:5,
        maxlength:1024
    },
    division:{
        type:String,
        required:true,
      
    },
    
    district:{
        type:String,
        required:true,
      
    },

    upzilla:{
        type:String,
        required:true,
      
    },


    address:{
        type:String,
        required:true,
      
    },


});

const User = model('RegistrationData',userSchema);

module.exports =User;