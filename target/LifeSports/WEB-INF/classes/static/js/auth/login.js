$(function () {
    $("#signup").click(function() {
        location.href="join";
    });
});

function login() {
    if([
        $("#email").val(),
        $("#password").val().includes("")
    ]) {
        $("#error").html("입력하지 않은 항목이 있습니다!");

        return false;
    }
}