/* Connor Cheng
ccheng71@my.smccd.edu
CIS 114 OL
tests.js
Assignment 5
October 23
*/

// tests.js
// This script runs some tests against the utilities library from Chapter 8.

//Chapter 12 Bulliet List question 5
// Define the tests:
var myTests = function() {
	'use strict';

	// Test that $() returns an element when provided with a valid ID:
	function testGetElement() {
		jsUnity.assertions.assertNotNull(U.$('output'));
	}

	// Test that $() returns null when provided with an invalid ID:
	function testGetInvalidElement() {
		jsUnity.assertions.assertNull(U.$('doesNotExist'));
	}

	// Test that setText() returns true when provided with a valid ID:
	function testSetText() {
		jsUnity.assertions.assertTrue(U.setText('output', 'test'));
	}

	// Test that setText() returns false when provided with an invalid ID:
	function testCannotSetText() {
		jsUnity.assertions.assertFalse(U.setText('doesNotExist', 'test'));
	}

}; // End of myTests anonymous function.

// Define the logging function:
jsUnity.log = function(message) {
	U.$('results').innerHTML += '<p>' + message + '</p>';
};

// Run the tests:
jsUnity.run(myTests);