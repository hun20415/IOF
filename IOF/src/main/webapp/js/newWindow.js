function SignUpPop() {

	var popUrl = "signUp"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=620, height=500, resizable=no, scrollbars=no, status=no;"; // 팝업창
																						// 옵션(optoin)
	window.open(popUrl, "", popOption);
}
function userModifyPop(userModifyForm) {

	var popUrl = "userModify"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=620, height=500, resizable=no, scrollbars=no, status=no;"; // 팝업창
																						// 옵션(optoin)
	window.open("", "userModifyPop", popOption);
	
	userModifyForm.action="userModify";
	userModifyForm.target="userModifyPop";
	userModifyForm.submit();
}


function Move() { 
        window.opener.top.location.href="연결할파일"; 
        window.close(); 
} 

function userInfoPop(userInfoForm) {
	var popUrl = "userInfo"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=640, height=900, resizable=no, scrollbars=no, status=no;"; // 팝업창

	window.open("", "userInfoPop", popOption);
	
	userInfoForm.action=popUrl;
	userInfoForm.target="userInfoPop";
	userInfoForm.submit();
}


 