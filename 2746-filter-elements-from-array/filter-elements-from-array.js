/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var ans = [];
    arr.forEach((num, i, arr) => {
        if(fn(arr[i], i)){
            ans.push(num);
        }
    })

    return ans;
};