/* Connor Cheng
ccheng71@my.smccd.edu
CIS 114 OL
auction.js
Chapter 6 and 7
Assignment 3
September 17
*/

// auction.js
// This script validates two dates and calculates the number of days between them.
 function getInterval(startDate, endDate, showDays){

	var secondsInterval = Math.abs(endDate - startDate) / 1000;

	var days = Math.floor(secondsInterval / 86400);
	secondsInterval -= days * 86400;

	var hours = Math.floor(secondsInterval / 3600) % 24;
	secondsInterval -= hours * 3600;

	var minutes = Math.floor(secondsInterval / 60) % 60;
	secondsInterval -= minutes * 60;

	var seconds = Math.round(secondsInterval % 60);

	if (showDays){
		return 'The time remaing until auction starts is ' + days +  ' day(s) ' + hours + ' hour(s) ' + minutes + ' minute(s) ' + seconds + ' second(s).';
	}
	else{
		return 'The time remaing until auction starts is ' + hours + ' hour(s) ' + minutes + ' minute(s) ' + seconds + ' second(s).';
	}
  }

// Function called when the form is submitted.
// Function processes the dates and returns false.

function process() {
    'use strict';

    // Get a reference to the form elements:
    var start = document.getElementById('start');
    var end = document.getElementById('end');

    // Get a reference to the paragraph:
    var output = document.getElementById('output');

    // For the output:
    var message = '';
    var interval = '';
    var day = 1000 * 60 * 60 *24;

    // Validate that start and end are good!

    // Try to create a start and end date:
    var startDate = new Date(start.value);
    var endDate = new Date(end.value);

    // Get a reference to the paragraph:
    var output = document.getElementById('output');

    // For the output:
    var message = '';
    var interval = '';
    var day = 1000 * 60 * 60 *24;

   if ( startDate.getTime() && endDate.getTime() ) {

        // Make sure the start date comes first:
        if (startDate < endDate) {
			if (startDate > Date.now()){
            	// Get the interval:
            	var diff = endDate - startDate;

            	// Determine the interval:
            	if (diff <= day) {
					interval = getInterval(Date.now(), startDate, false);
            	} else {
            	    interval = getInterval(Date.now(), startDate, true);
            	}

            	// Build the message:
            	message = 'The event has been scheduled starting on ' + startDate.toLocaleString();
            	message += ' and ending on ' + endDate.toLocaleString() + '. ';
            	message += interval;
			}

			else{
				message = 'The start date must be in the future!';
			}
        } else { // The start date doesn't come first!
            message = 'The start date must come before the end date!';
        }

    } else { // One or both dates are invalid!
        message = 'Please enter valid start and end dates in the format MM/DD/YYYY HH:MM.';
    }

    // Update the paragraph:
	if (output.textContent !== undefined) {
		output.textContent = message;
	} else {
		output.innerText = message;
	}

    // Return false to prevent submission:
    return false;

} // End of process() function.

// Initial setup:
function init() {
    'use strict';
    document.getElementById('theForm').onsubmit = process;
}  // End of init() function.
window.onload = init;