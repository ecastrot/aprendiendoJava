const express = require("express");
const {dbConnection} = require ("./database/config")

// Crear servidor de express
const app = express();

dbConnection();

/**Configurar la app para interpretar */
app.use(express.json());

app.get("/", (request, response) => {
    response.json({
        mensaje:"appCargo"
    })
});

/** Rutas */
app.use('/api/pelicula', require("./routes/pelicula"))
// app.use('/api/galeria', require("./routes/galeria"))

// Levanto el servidor y lo pongo a escuchar por el puerto que yo quiero.
app.listen(3000, () => {
    console.log('Servidor arriba y esta escuchando por el puerto 3000');
});