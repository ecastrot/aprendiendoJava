const { Router } = require("express");
const Pelicula = require("../models/Pelicula");
const router = Router();

let peliculas = [
  { codigo: "P001", nombre: "Pelicula 1", estado: "Disponible" },
  { codigo: "P002", nombre: "Pelicula 2", estado: "Disponible" },
  { codigo: "P003", nombre: "Pelicula 3", estado: "Disponible" },
];

router.get("/", (request, response) => {
  response.json(peliculas);
  //   response.json({
  //     codigo: "P-001",
  //     nombre: "Pelicula 1",
  //     estado: "Disponible",
  //     actores: [
  //       {
  //         nombre: "Actor A",
  //         edad: 10,
  //       },
  //       {
  //         nombre: "Actor B",
  //         edad: 25,
  //       },
  //       {
  //         nombre: "Actor C",
  //         edad: 20,
  //       },
  //     ],
  //   });
});

router.post("/", async (request, response) => {
  const { codigo, nombre, estado } = request.body;
  //   const codigo = request.body.codigo;
  //   const nombre = request.body.nombre;
  //   const estado = request.body.estado;

  //Obtengo la información de la pelicula del request y la pongo en una variable.
  const infoPeliculaRecibida = { codigo, nombre, estado };

  if (!nombre) {
    response.status(400).json({
      error: "Nombre de la pelicula no recibido",
    });
    return;
  }

  try {
    const pelicula = new Pelicula(infoPeliculaRecibida);
    await pelicula.save();
    response.status(201).json({
      mensaje: "La pelicula se creo correctamente",
      pelicula: infoPeliculaRecibida,
    });
  } catch (error) {
    response.status(500).json({
      mensaje: "No se pudo guardar la pelicula",
      error: error,
    });
  }

  // //Agrego un nuevo objeto a mi lista, con la información que llego en el body del request que me mando el cliente
  //  peliculas.push(infoPeliculaRecibida);

  //   response.status(201).json({
  //     mensaje: "La pelicula se creo correctamente",
  //     pelicula: infoPeliculaRecibida
  //   });
});

router.delete("/", (request, response) => {
  response.json({
    mensaje: "deletePelicula",
  });
});

router.put("/", (request, response) => {
  response.json({
    mensaje: "putPelicula",
  });
});

module.exports = router;
