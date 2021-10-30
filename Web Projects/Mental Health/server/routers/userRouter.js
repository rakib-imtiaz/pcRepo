const express = require('express');

const router = express.Router();
require('../db/conn');
const User = require("../models/users");

router.post('/register', async (req, res) => {

        const { name, phoneNumber, email, password, division, district, upzilla, address } = req.body;

        if (!name || !phoneNumber || !email || !password || !division || !district || !upzilla || !address) {
                return res.status(422).json({ error: 'Not All field are filled up' });
        }

        try {
                const userExist = await User.findone({ email: email });

                if (userExist) {
                        return res.status(422).json({ error: 'Email exists' });

                }

                const user = new User({ name, phoneNumber, email, password, division, district, upzilla, address });
                await user.save();

                res.status(201).json({ message: "user registred succefull" });

        }
        catch (err) {

                console.log(err);
        }


         




});

module.exports = router;

