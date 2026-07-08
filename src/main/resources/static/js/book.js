document.querySelector("#insertBtn").addEventListener("click", function () {
    if (!chkData("#title", "책제목을")) {
        return;
    } else if (!chkData("#title", "책제목을")) {
        return;
    } else if (!chkData("#title", "책제목을")) {
        return;
    } else if (!chkData("#title", "책제목을")) {
        return;
    } else if (!chkData("#title", "책제목을")) {
        return;
    } else {
        formSubmit("insertForm", "post", "/book/bookInsert");
    }
});

document.querySelector("#cancelBtn").addEventListener("click", function () {
    formReset("insertForm");
});

document.querySelectorAll(".deleteBtn").forEach(deleteButton => {
    deleteButton.addEventListener("click", function (event) {
        event.preventDefault();

        const row = event.target.closest("tr");
        const bookId = row.dataset.bookId;

        if (confirm("책 정보를 삭제하시겠습니까?")) {
            locationProcess(`/book/bookDelete?bookId=${bookId}`);
        }

    });
});

const insertForm = document.querySelector("#insertForm");
const insertBtn = document.querySelector("#insertBtn");
const cancelBtn = document.querySelector("#cancelBtn");

const bookIdInput = document.querySelector("#bookId");
const titleInput = document.querySelector("#title");
const authorInput = document.querySelector("#author");
const publisherInput = document.querySelector("#publisher");
const publishDateInput = document.querySelector("#publishDate");
const priceInput = document.querySelector("#price");

function changeUpdateMode() {
    insertBtn.textContent = "수정완료";
    cancelBtn.textContent = "수정취소";
}

function resetInsertMode() {
    formReset("insertForm");

    bookIdInput.value = 0;
    insertBtn.textContent = "책정보등록";
    cancelBtn.textContent = "다시입력";
}

insertBtn.addEventListener("click", function () {
    if (!chkData("#title", "책제목을")) {
        return;
    } else if (!chkData("#author", "책저자를")) {
        return;
    } else if (!chkData("#publisher", "출판사를")) {
        return;
    } else if (!chkData("#publishDate", "출간일을")) {
        return;
    } else if (!chkData("#price", "가격을")) {
        return;
    }

    const isNew = bookIdInput.value === "0" || bookIdInput.value === "";
    const actionURL = isNew ? "/book/bookInsert" : "/book/bookUpdate";

    formSubmit("insertForm", "post", actionURL);
});

document.querySelectorAll(".deleteBtn").forEach(deleteButton => {
    deleteButton.addEventListener("click", function (event) {
        event.preventDefault();

        const row = event.target.closest("tr");
        const bookId = row.dataset.bookId;

        if (confirm("책정보를 삭제하시겠습니까?")) {
            locationProcess(`/book/bookDelete?bookId=${bookId}`);
        }
    });
});

document.querySelectorAll(".updateBtn").forEach(updateButton => {
    updateButton.addEventListener("click", function (event) {
        event.preventDefault();

        const row = event.target.closest("tr");
        const cell = row.querySelectorAll("td");

        bookIdInput.value = row.dataset.bookId;
        titleInput.value = cells[0].textContent.trim();
        authorInput.value = cells[1].textContent.trim();
        publisherInput.value = cells[2].textContent.trim();
        publishDateInput.value = cells[3].textContent.trim();
        priceInput.value = cells[4].textContent.trim();

        changeUpdateMode();
    });
});