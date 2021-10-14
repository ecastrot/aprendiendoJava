const mongoose = require("mongoose");

const dbConnection = async () => {
  try {
    await mongoose.connect(
      "mongodb+srv://userapp:userapp@cluster0.tiv5u.mongodb.net/peliculas"
    );
    console.log("Conectado a la base de datos");
  } catch (error) {
    console.log("Fallo la conexión a la base de datos", error);
  }
};

module.exports = { dbConnection };
