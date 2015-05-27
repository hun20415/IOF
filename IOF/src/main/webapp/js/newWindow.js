function SignUpPop() {

	var popUrl = "signUp"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=620, height=500, resizable=no, scrollbars=no, status=no;"; // 팝업창
																						// 옵션(optoin)
	window.open(popUrl, "", popOption);
}


function Move() { 
        window.opener.top.location.href="연결할파일"; 
        window.close(); 
} 

function userInfoPop() {
	var popUrl = "userInfo"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=620, height=500, resizable=no, scrollbars=no, status=no;"; // 팝업창
a
	window.open("userInfo", "userInfoPop", popOption);
	
	document.userInfoForm.action="userInfo";
	document.userInfoForm.target="userInfoPop";
	document.userInfoForm.submit();
	
		
	
		
}
 