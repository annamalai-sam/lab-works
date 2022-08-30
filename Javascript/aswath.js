let reviewData = [];
function onPageload() {
  let exDatas = JSON.parse(localStorage.getItem("reviews"));
  if (exDatas != null) {
    reviewData = exDatas;
  }
  renderDatas();
}
onPageload();


let loggedInusers = JSON.parse(localStorage.getItem("loggedInusers"));
let empty = true;
for(let i of loggedInusers){
  if(loggedInusers == null){
      alert("As you are a new user please register")
      window.location.href = "./../../pages/register.html";
      empty = false;
      break
  }  
}
document.getElementById("userName").innerHTML = loggedInusers.userName;
let month = ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec",];
let date = new Date().getDate();
let mon = month[new Date().getMonth()];
let year = new Date().getFullYear();
document.getElementById("dateDiv").innerHTML = date + "-" + mon + "-" + year;














function onSumbit(event){
  event.preventDefault();
  let loggedInusers = JSON.parse(localStorage.getItem("loggedInusers"))[0]; 
  
  console.log(loggedInusers.userName);
  if(empty){
  let inputData2 = document.getElementById("userInput").value;
  console.log(inputData2);
  let exDatas = JSON.parse(localStorage.getItem("users"));
  let match = false;
  console.log(loggedInusers.userName);
  for (let i of exDatas) {
    if (i.username == loggedInusers.userName) {
      match = true;
      break;
    }
  }
  if (match) {
    let exReviews = JSON.parse(localStorage.getItem("reviews"));
    let equal = false;
    for (let i of exReviews) {
      if (i.userName == loggedInusers.userName) {
        equal = true;
        break;
      }
    }
    if (equal) {
      alert("Your review has been already submitted");
    } 
    else if (!equal) {
      let reviewSource = {
        "userName": loggedInusers.userName,
        "userData": inputData2,
        "date": date + "-" + mon + "-" + year,
      };
      updateDatas(reviewSource);
      renderDatas();
      alert("Your review has been submitted successfully");
    }
  } 
    else if (!match) {
    alert("User does not exist please login");
    window.location.href = "./../../pages/register.html";
  }}
}




















function updateDatas(reviewSource) {
  reviewData.push(reviewSource);
  let reviewDataInString = JSON.stringify(reviewData);
  localStorage.setItem("reviews", reviewDataInString);
}


function renderDatas() {
  let answer = "";
  for (let i of reviewData) {
    let review = i.userData;
    let uName = i.userName;
    let temp = `<li><p class = username>${uName}</p><br><br>${review}</li><p class="date">${date} ${mon} ${year}</p>`;
    answer = answer + temp;
  }
  let ulTag = document.getElementById("list");
  ulTag.innerHTML = answer;
}





{/* <img src=../assets/images/profile.png class=profile_image><img src=../assets/images/reveiwstar.png class=star_img> */}