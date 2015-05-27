
function Move() { 
        window.opener.top.location.href="연결할파일"; 
        window.close(); 
} 

// user
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


function userInfoPop(userInfoForm) {
	var popUrl = "userInfo"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=640, height=900, resizable=no, scrollbars=no, status=no;"; // 팝업창

	window.open("", "userInfoPop", popOption);
	
	userInfoForm.action=popUrl;
	userInfoForm.target="userInfoPop";
	userInfoForm.submit();
}

//farmInfo
function FarmInfoAddPop() {

	var popUrl = "farmInfoAdd"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=700, height=700, resizable=no, scrollbars=no, status=no;"; // 팝업창
																						// 옵션(optoin)
	window.open(popUrl, "", popOption);
}

function farmInfoModifyPop(farmInfoModifyForm) {

	var popUrl = "farmInfoModify"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=620, height=500, resizable=no, scrollbars=no, status=no;"; // 팝업창
																						// 옵션(optoin)
	window.open("", "farmInfoModifyPop", popOption);
	
	farmInfoModifyForm.action="farmInfoModify";
	farmInfoModifyForm.target="farmInfoModifyPop";
	farmInfoModifyForm.submit();
}


function farmInfoInfoPop(farmInfoInfoForm) {
	var popUrl = "farmInfoInfo"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=640, height=900, resizable=no, scrollbars=no, status=no;"; // 팝업창

	window.open("", "farmInfoInfoPop", popOption);
	
	farmInfoInfoForm.action=popUrl;
	farmInfoInfoForm.target="farmInfoInfoPop";
	farmInfoInfoForm.submit();
}

//farmCultivateInfo
function FarmCultivateInfoAddPop() {

	var popUrl = "farmCultivateInfoAdd"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=700, height=700, resizable=no, scrollbars=no, status=no;"; // 팝업창
																						// 옵션(optoin)
	window.open(popUrl, "", popOption);
}

function farmCultivateInfoModifyPop(farmCultivateInfoModifyForm) {

	var popUrl = "farmCultivateInfoModify"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=620, height=500, resizable=no, scrollbars=no, status=no;"; // 팝업창
																						// 옵션(optoin)
	window.open("", "farmCultivateInfoModifyPop", popOption);
	
	farmCultivateInfoModifyForm.action="farmCultivateInfoModify";
	farmCultivateInfoModifyForm.target="farmCultivateInfoModifyPop";
	farmCultivateInfoModifyForm.submit();
}


function farmCultivateInfoInfoPop(farmCultivateInfoInfoForm) {
	var popUrl = "farmCultivateInfoInfo"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=640, height=900, resizable=no, scrollbars=no, status=no;"; // 팝업창

	window.open("", "farmCultivateInfoInfoPop", popOption);
	
	farmCultivateInfoInfoForm.action=popUrl;
	farmCultivateInfoInfoForm.target="farmCultivateInfoInfoPop";
	farmCultivateInfoInfoForm.submit();
}

function farmCultivateInfoHistPop(farmCultivateInfoHistForm) {

	var popUrl = "farmCultivateInfoHist"; // 팝업창에 출력될 페이지 URL
	var popOption = "width=620, height=500, resizable=no, scrollbars=no, status=no;"; // 팝업창
																						// 옵션(optoin)
	window.open("", "farmCultivateInfoHistPop", popOption);
	
	farmCultivateInfoHistForm.action="farmCultivateInfoHist";
	farmCultivateInfoHistForm.target="farmCultivateInfoHistPop";
	farmCultivateInfoHistForm.submit();
}

 