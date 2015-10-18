(function(){	
	$(document).ready(function(){		
		$(".client-logo-box").each(function(i, obj){			
			$(obj).delay(i*500).animate({opacity: 1}, 2000);			
		});											
	});	
})();