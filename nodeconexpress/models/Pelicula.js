const {Schema, model} = require("mongoose");

const PeliculaSchema = Schema({
    codigo: {
        type: String
    },
    nombre: {
        type: String
    }, 
    estado: {
        type: String
    }
});

module.exports = model("Pelicula", PeliculaSchema);