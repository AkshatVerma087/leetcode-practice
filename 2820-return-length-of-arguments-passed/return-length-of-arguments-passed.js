/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    var size = 0;

    for(let num of args){

        size++;
    }

    return size;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */