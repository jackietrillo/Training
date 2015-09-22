// Student Information
// Connor Cheng
// ccheng71@my.smccd.edu
// CIS 114 OL
// zodiac.js
// Chapter 5
// Assignment 2
// September 9
// zodiac.js
//
// This script calculates the zodiac sign.
// Function called when the form is submitted.
// Function performs the calculation and returns false.

'use strict';

function findSign()

	var remainder = 0;
	var years = document.getElementById('years').value;
	var month = document.getElementById('month').value;
	var sign = document.getElementById('sign');
	var zodiacimage = document.getElementById('zodiacimage');

	if (years <= 1000 || years >= 9999) {  //Check for valid years
		document.getElementById('years').value = 'Please enter a year from 1000-9999.';
		return false;
	}

	if(month === 'January') {  //January is the previous lunar year per our algorithm
		years -= 1;
	}

	remainder = years % 12;    //Get remainder to determine zodiac sign

	switch (remainder) {
		case 0:
			document.getElementById('zodiacimage').src = "css/rat.jpg";
			document.getElementById('sign').value = 'Rat';
		break;

		case 1:
			document.getElementById('zodiacimage').src = "css/ox.jpg";
			document.getElementById('sign').value = 'Ox';
		break;

		case 2:
			document.getElementById('zodiacimage').src = "css/tiger.jpg";
			document.getElementById('sign').value = 'Tiger';
		break;

		case 3:
			document.getElementById('zodiacimage').src = "css/rabbit.jpg";
			document.getElementById('sign').value = 'Rabbit';
		break;

		case 4:
			document.getElementById('zodiacimage').src = "css/dragon.jpg";
			document.getElementById('sign').value = 'Dragon';
		break;

		case 5:
			document.getElementById('zodiacimage').src = "zodiaccss/snake.jpg";
			document.getElementById('sign').value = 'Snake';
		break;

		case 6:
			document.getElementById('zodiacimage').src = "css/horse.jpg";
			document.getElementById('sign').value = 'Horse';
		break;

		case 7:
			document.getElementById('zodiacimage').src = "css/goat.jpg";
			document.getElementById('sign').value = 'Goat';
		break;

		case 8:
			document.getElementById('zodiacimage').src = "css/monkey.jpg";
			document.getElementById('sign').value = 'Monkey';
		break;

		case 9:
			document.getElementById('zodiacimage').src = "css/rooster.jpg";
			document.getElementById('sign').value = 'Rooster';
		break;

		case 10:
			document.getElementById('zodiacimage').src = "css/dog.jpg";
			document.getElementById('sign').value = 'Dog';
		break;

		case 11:
			document.getElementById('zodiacimage').src = "css/boar.jpg";
			document.getElementById('sign').value = 'Pig';
		break;

  } 
  return false;
}  

function init()
{
  document.getElementById('theForm').onsubmit = findSign;
}  

window.onload = init;