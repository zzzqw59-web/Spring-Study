const projectInput = document.querySelector(".projectInput");
const join = document.querySelector("#join");
const login = document.querySelector("#login");
const board = document.querySelector("#board");
const comment = document.querySelector("#comment");
const file = document.querySelector("#file");
const checkButton = document.querySelector(".checkButton");
const form = document.querySelector(".form");

function validate() {
    if (projectInput === "") {
        alert("프로젝트명을 입력하시오.");
        projectInput.focus();
        return;
    }
}