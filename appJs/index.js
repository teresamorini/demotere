const express = require('express')
const app = express()
const port = 8080

app.get('/hello', (req, res) => {
    res.send('Hello from Node.js!');
})

app.get('/hello/v1', (req, res) => {
    res.send('Hello ' + process.env.USER_ID + ' from Node.js!');
})

app.get('/hello/v2', (req, res) => {
    res.send('Hello ' + process.env.APP_OWNER + ' from Node.js!');
})

app.get('/hello/v3', (req, res) => {
    var PropertiesReader = require('properties-reader');
    var properties = PropertiesReader('./config/app.properties');
    res.send('Hello ' + properties.get("APP_OWNER") + ' from Node.js!');
})

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`);
})