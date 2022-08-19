document.getElementById("check").addEventListener('click', showBible);
document.getElementById("change").addEventListener('click', closeBible);
		
function showBible() {
	$.ajax({
	  url : "/verse",
	  type : "GET", 			  			 
	  success : function (data) {
	       if(data.code == "1"){
	    	   document.getElementById("verseBox").style.display = "block";
	    	   var text = data.book + " " + data.chapter + "장 " + data.verse + "절 ";
	    	   var text2 = data.content;
	    	   document.getElementById("verse").innerText = text;
	    	   document.getElementById("verse2").innerText = text2;
	    	   document.getElementById("check").style.display = "none";
	           
	       } else {
	           alert("error!")
	       }           
	  }
	});  //ajax      
}
 
function closeBible() {
	document.getElementById("verseBox").style.display = "none";
	document.getElementById("verse").innerText = "";
	document.getElementById("verse2").innerText = "";
	document.getElementById("check").style.display = "block";
}