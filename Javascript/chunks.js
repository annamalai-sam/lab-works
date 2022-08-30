function small_array(arr, chunk) {
  while (arr.length > 0) {
    let tempArray;
    tempArray = arr.splice(0, chunk);
    console.log(tempArray);
  }
}

const array = [1, 2, 3, 4, 5, 6, 7, 8];
const chunk = array.length / 2;
small_array(array, chunk);
