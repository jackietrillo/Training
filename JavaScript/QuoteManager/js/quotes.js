/* Connor Cheng
ccheng71@my.smccd.edu
CIS 114 OL
quotes.js
Midterm
October 4
*/
// quotes.js
// This script manages a quote list.

// This function does all the work.
// It is immediately-invoked.
(function(){
	 'use strict';
	// Variable that stores the tasks:
    var quotes = [];

	// Function called when the form is submitted.
	// Function adds a quote to the global array.
    function addQuote() {
        var quote = document.getElementById('quote');
        var output = document.getElementById('output');
        var message = '';

        if (quote.value) {
            quotes.push(quote.value);
            message = '<h2>Quotes</h2><ol>';
            for (var i = 0, count = quotes.length; i < count; i++) {
                message += '<li>' + quotes[i] + '</li>';
            }
            message += '</ol>';
            output.innerHTML = message;
        } // End of quote.value IF.

		quote.value = '';

	    // Return false to prevent submission:
        return false;

    } // End of addTask() function.

    function modifyQuote() {
        var quote = document.getElementById('quote');
		var output = document.getElementById('output');
		var modifyQuote = prompt("Please enter a quote to be changed");
		if(modifyQuote != null) {
			var modifyQuoteIndex = parseInt(modifyQuote);
			if (typeof modifyQuoteIndex != 'number') {
				output.innerHTML = 'Quote must be a number.';
				return;
			}
			modifyQuoteIndex = modifyQuoteIndex - 1;
			
			var modifiedQuote = prompt("Please modify the quote:", quotes[modifyQuoteIndex]);
			
			quotes[modifyQuoteIndex] = modifiedQuote;
						
			displayQuotes();
			} // End of quote.value IF.
        else {
			output.innerHTML = 'Modifyquote is undefined.';
		}
		quote.value = '';

	    // Return false to prevent submission:
        return false;

    } // End of modifyQuote() function.



    function deleteQuote() {
        var quote = document.getElementById('quote');
 	   var output = document.getElementById('output');
	   var deleteQuote = prompt("Please enter a quote to be deleted");
		if(deleteQuote != null) {
			var deleteQuoteIndex = parseInt(deleteQuote);
			if (typeof deleteQuoteIndex != 'number') {
				output.innerHTML = 'Quote must be a number.';
				return;
			}
			deleteQuoteIndex = deleteQuoteIndex - 1;
            quotes.splice(deleteQuoteIndex, 1);
			displayQuotes();
			} // End of quote.value IF.
        else {
			output.innerHTML = 'Deletequote is undefined.';
		}
		quote.value = '';

	    // Return false to prevent submission:
        return false;

    } // End of deleteQuote() function.

	function displayQuotes(){
        var output = document.getElementById('output');
        var message = '';
            message = '<h2>Quotes</h2><ol>';
            for (var i = 0; i < quotes.length; i++) {
                message += '<li>' + quotes[i] + '</li>';
            }
            message += '</ol>';
            output.innerHTML = message;
	}

    // Initial setup:
    function init() {
		quotes.push("Virtue is its own reward.");
		quotes.push("Mistakes are a natural part of life.");
		quotes.push("Even if you fail at something majorly important, don't take it like it's the end of the world for you.");
		displayQuotes();
		document.getElementById('add').onclick = addQuote;
		document.getElementById('delete').onclick = deleteQuote;
		document.getElementById('modify').onclick = modifyQuote;
    } // End of init() function.

    window.onload = init;

})();