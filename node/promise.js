
const isItDoneYet = new Promise((resolve, reject) => setTimeout(() => {
    let done = true
    if (done) {
        const workDone = 'Here is the thing I built'
        resolve(workDone)
    } else {
        const why = 'Still working on something else'
        reject(why)
    }
}
), 2000)

isItDoneYet
    .then(ok => {
        console.log(ok)
    })
    .catch(err => {
        console.error(err)
    }).finally(
        console.log("Promise Ended Here")
    )