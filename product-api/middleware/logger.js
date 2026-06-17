const fs = require("fs");

const logger = (req, res, next) => {

    const log =
        `${new Date().toISOString()} ${req.method} ${req.url}\n`;

    fs.appendFile(
        "access.log",
        log,
        (err) => {
            if (err) {
                console.log(err);
            }
        }
    );

    next();
};

module.exports = logger;