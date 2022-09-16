let p = new Promise((resolve, reject) => {
    resolve('Success')
    reject('Failed')
})
p.then((data) => console.log("This is in the then : " + data))
p.catch((err) => console.log("This is in the catch : " + err))
