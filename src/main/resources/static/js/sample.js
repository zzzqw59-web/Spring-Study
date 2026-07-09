const messageButton = document.querySelector("#messageButton");
const messageResult = document.querySelector("#messageResult");

messageButton.addEventListener("click", function () {
    fetch("/sample/message")
        .then(response => response.text())
        .then(data => {
            messageResult.textContent = data;
        })
        .catch(error => {
            console.log("에러 발생", error);
            messageResult.textContent = "메세지를 가져오는 도중 오류가 발생했습니다.";
        });
});

const textButton = document.querySelector("#textButton");
const textResult = document.querySelector("#textResult");

textButton.addEventListener("click", function() {
    fetch("/example/exam01")
        .then(response => response.text())
        .then(data => {
            textResult.textContent = data;
        })
        .catch(error => {
            console.log("에러 발생", error);
            textResult.textContent = "메세지 가져오는 도중 에러 발생";
        })
})

const memberButton = document.querySelector("#memberButton");
const memberResult = document.querySelector("#memberResult");

memberButton.addEventListener("click", function () {
    fetch("/sample/member")
        .then(response => response.json())
        .then(data => {
            memberResult.innerHTML = `
                회원명: ${data.name} <br>
                회원이메일: ${data.email} <br>
                회원전화번호: ${data.phone}
            `;
        })
        .catch(error => {
            console.log("에러 발생: ", error);
            memberResult.textContent = "회원 정보를 조회할 수 없습니다.";
        });
});