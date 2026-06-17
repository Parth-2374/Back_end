const express = require("express");
const mongoose = require("mongoose");

const logger =
    require("./middleware/logger");

const productRoutes =
    require("./routes/productRoutes");

const app = express();

app.use(express.json());

app.use(logger);
mongoose.connect(
    "mongodb://127.0.0.1:27017/ecommerce"
)
.then(() => {
    console.log("MongoDB Connected");
})
.catch((err) => {
    console.log(err);
});
app.use("/products", productRoutes);
app.use((err, req, res, next) => {

    res.status(500).json({
        success: false,
        message: err.message
    });

});
app.listen(3000, () => {

    console.log(
        "Server Running on Port 3000"
    );

});