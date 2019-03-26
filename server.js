const fs = require('fs');
const https = require('https');
const express = require('express');

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

app.post('/notify', function (req, res) {
        res.send ("ClientID: " + req.query.clientID + " Message: " + req.query.message)
})

app.post('/otp', function (req, res) {
        res.send('OTP function')
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
