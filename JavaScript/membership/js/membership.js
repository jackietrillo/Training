/* Student Information
// Connor Cheng 
// ccheng71@my.smccd.edu 
// CIS 114 OL 
// membership.js
// Chapter 5 
// Assignment 2 
// September 9

*/
// membership.js
//
// This script calculates the cost of a membership.
// Function called when the form is submitted.
// Function performs the calculation and returns false.

function calculate() {

  // Be strict:
  'use strict';

  // Variable to store the total cost:
  var cost;

  // Get a reference to the form elements:
  var type = document.getElementById('type');
  var years = document.getElementById('years');

  // Convert the year to a number:
  if (years && years.value) {
    years = parseInt(years.value, 10);
  }

  // Check for valid data:
  if (type && type.value && years && (years > 0)) {
    // Determine the base cost:
   switch (type.value) {
     case 'basic':
       cost = 10.00;
     break;

     case 'premium':
       cost = 15.00;
     break;

     case 'gold':
       cost = 20.00;
     break;

     case 'platinum':
       cost = 25.00;
     break;

   } // End of switch.

        // Factor in the number of years:
        cost *= years;

  // Discount multiple years:
  if (years == 1)
    cost *= .95           //  5% Discount
  else if (years == 2 || years == 3)
      cost *= .90        // 10% Discount
  else if (years == 4)
        cost *= .85     // 15% Discount
  else
      cost *= .80;  // 20% Discount
/*
              if (years > 1) {
	              cost *= .80; // 80%
        }
*/
	  // Show the total amount:
      document.getElementById('cost').value = '$' + cost.toFixed(2);
  }

  else { // Show an error:
          document.getElementById('cost').value = 'Please enter valid values.';
    }


  //Determine if textContent is supported by browser
  //References <span id="output">
  if (output.textContent !== undefined) {
    output.textContent = '$' + cost.toString();
  } else {
   output.innerText = '$' + cost.toString();
  }
  return false;
}  // End of calculate() function.

//console.log("output is " + cost.toString());
// Initial setup:
function init()
{
  'use strict';
  document.getElementById('theForm').onsubmit = calculate;
}  // End of init() function.

window.onload = init;
