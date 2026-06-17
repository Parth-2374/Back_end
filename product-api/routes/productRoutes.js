const express = require("express");

const router = express.Router();

const Product = require("../models/Product");
router.post("/", async (req, res) => {

    try {

        const product =
            await Product.create(req.body);

        res.status(201).json(product);

    } catch (err) {

        res.status(500).json({
            message: err.message
        });

    }
});

router.get("/", async (req, res) => {

    try {

        const products =
            await Product.find();

        res.json(products);

    } catch (err) {

        res.status(500).json({
            message: err.message
        });

    }
});

router.delete("/:id", async (req, res) => {

    try {

        await Product.findByIdAndDelete(
            req.params.id
        );

        res.json({
            message: "Deleted Successfully"
        });

    } catch (err) {

        res.status(500).json({
            message: err.message
        });

    }
});

router.put("/:id", async (req, res) => {

    try {

        const product =
            await Product.findByIdAndUpdate(

                req.params.id,

                {
                    $set: {
                        description:
                            req.body.description
                    }
                },

                {
                    new: true
                }
            );

        res.json(product);

    } catch (err) {

        res.status(500).json({
            message: err.message
        });

    }
});

router.patch("/:id/stock", async (req, res) => {

    try {

        const product =
            await Product.findByIdAndUpdate(

                req.params.id,

                {
                    $inc: {
                        stock: req.body.quantity
                    }
                },

                {
                    new: true
                }
            );

        res.json(product);

    } catch (err) {

        res.status(500).json({
            message: err.message
        });

    }
});
router.get("/report/category", async (req, res) => {

    try {

        const report =
            await Product.aggregate([

                {
                    $group: {

                        _id: "$category",

                        totalStock: {
                            $sum: "$stock"
                        },

                        totalValue: {
                            $sum: {
                                $multiply: [
                                    "$price",
                                    "$stock"
                                ]
                            }
                        }
                    }
                }

            ]);

        res.json(report);

    } catch (err) {

        res.status(500).json({
            message: err.message
        });

    }
});
module.exports = router;