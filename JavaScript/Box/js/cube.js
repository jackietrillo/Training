// Script 4.5 - sphere.js
// This script calculates the volume of a sphere.
// Function called when the form is submitted.
// Function performs the calculation and returns false.

// Connor Cheng
// ccheng71@my.smccd.edu
// CIS 114 OL
// cube.js
// Chapter 4
// Assignment 5
// October 23

function calculate() {
	'use strict';

// For storing the volume:
var volume;

// Get a reference to the form value:
var length = document.getElementById('length').value;
var width = document.getElementById('width').value;
var height = document.getElementById('height').value;

if (length != 'number' || width != 'number' || height != 'number')
alert("Error! please enter a numeric value!");
	
//Chapter 12 Bulliet List question 4 - checking if it's postiive
// Make sure it's positive:
if (length > 0 && width > 0 && height > 0)
// Perform the calculation:
volume = length * width * height;
else
alert("Error! Please enter a positive value.");

// Format the volume:
volume = volume.toFixed(2);

// Display the volume:
document.getElementById('volume').value = volume;

// Return false to prevent submission:
return false;
}
// End of calculate() function.
// Function called when the window has been loaded.
// Function needs to add an event listener to the form.

function init() {

'use strict';

document.getElementById('theForm').onsubmit = calculate;
}
// End of init() function.

window.onload = init;