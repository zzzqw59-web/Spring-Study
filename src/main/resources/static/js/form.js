const form = document.querySelector("#exam03Form");
const nameInput = document.querySelector("#name");
const ageInput = document.querySelector("#age");
const emailInput = document.querySelector("#email")

const exam01Btn = document.querySelector("#exam01Btn");
const exam02Btn = document.querySelector("#exam02Btn");

const exam04ArrayForm = document.querySelector("#exam04ArrayForm");
const exam04ArrayBtn = document.querySelector("#exam04ArrayBtn");

function validateForm() {
    if (nameInput.value.trim() === "") {
        alert("이름을 입력하세요");
        nameInput.focus();
        return;
    }

    if (ageInput.value.trim() === "") {
        alert("나이를 입력하세요");
        ageInput.focus();
        return;
    }

    if (isNaN(ageInput.value.trim())) {
        alert("나이를 숫자로 입력하세요");
        ageInput.focus();
        return false;
    }

    return true;
}

exam01Btn.addEventListener("click", function() {
    if (!validateForm()) {
        return;
    }

    form.method = "get";
    form.action = "/example/exam05";
    form.submit();
});

exam02Btn.addEventListener("click", function () {
    if (!validateForm()) {
        return;
    }

    form.method = "post";
    form.action = "/example/exam04";
    form.submit();
});

exam04ArrayBtn.addEventListener("click", function() {
    const checkedHobbyies = document.querySelectorAll('input[name="hobby"]:checked');

    if (checkedHobbyies.length === 0) {
        alert("취미를 하나 이상 입력하세요.");
        return;
    }

    exam04ArrayForm.method = "post";
    exam04ArrayForm.action = "/example/exam04Array";

    exam04ArrayForm.submit();
});