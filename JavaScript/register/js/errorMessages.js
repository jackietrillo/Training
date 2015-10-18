// Script 10.1 - errorMessages.js
// This script defines functions for adding and removing error messages.

// This function adds the error message.
// It takes two arguments: the form element ID and the message.

/*
Chapter 10 bullet list question 2
var elem = document.getElementById(label);
var msg = document.getElemntById(label);
*/

function addErrorMessage(id, msg) {
   	'use strict';

    // Get the form element reference:
    var elem = document.getElementById(id);

    // Define the new span's ID value:
    var newId = id + 'Error';  

    // Check for the existence of the span:
    var span = document.getElementById(newId); //firstNameError
    if (span) {        
        span.firstChild.value = msg; // Update                             
    } else { // Create new.

        // Create the span:
        span = document.createElement('span');
        span.id = newId;
		span.className = 'error'
        span.appendChild(document.createTextNode(msg));

        // Add the span to the parent:
        elem.parentNode.appendChild(span);
                
      //  console.log(elem.previousSibling);
        elem.previousSibling.className += ' error';

    } // End of main IF-ELSE.

} // End of addErrorMessage() function.

// This function removes the error message.
// It takes one argument: the form element ID.
function removeErrorMessage(id) {
   	'use strict';

    // Get a reference to the span:
    var span = document.getElementById(id + 'Error');
	if (span) { 
	    // Remove the class from the label:
	   // span.previousSibling.previousSibling.className.slice(span.previousSibling.previousSibling.className.lastIndexOf(' '), span.previousSibling.previousSibling.className.length - 1);
        span.previousSibling.previousSibling.className = span.previousSibling.previousSibling.className.replace(' error', ''); 
	    // Remove the span:
	    span.parentNode.removeChild(span);

	} // End of IF.

} // End of removeErrorMessage() function.