const nameInput = document.querySelector(".nameInput");
const courseInput = document.querySelector(".courseInput");
const levelInput = document.querySelector("#levelInput");
const submitButton = document.querySelector(".submitButton");
const form = document.querySelector(".form");

function validateFrom() {
    if (nameInput.value === "") {
        alert("이름을 입력하세요.");
        nameInput.focus();
        return;
    }

    if (courseInput.value === "") {
        alert("과목을 입력하세요.");
        courseInput.focus();
        return;
    }

    if (levelInput.value === "") {
        alert("난이도를 설정하세요.");
        levelInput.focus();
        return;
    }

    return true;
}

submitButton.addEventListener("click", function() {
    if (!validateFrom()) {
        return;
    }

    form.method = "post";
    form.action = "/example/course";
    form.submit();
})