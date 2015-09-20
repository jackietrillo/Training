// words.js
// This script defines a function for sorting words in a case-insenstive manner.

// Shortcut function:
function $(id) {
    'use strict';
    if (typeof id != 'undefined') {
        return document.getElementById(id);
    }
} // End of $ function.

// Function for setting text of an element:
function setText(elementId, message) {
    'use strict';
    if ( (typeof elementId == 'string')
    && (typeof message == 'string') ) {
        var output = $(elementId);
		if (output.textContent !== undefined) {
			output.textContent = numbers;
		} else {
			output.innerText = numbers;
		}
    } // End of main IF.
} // End of setText() function.

// This function sorts a list of words.
// The function takes one argument, a string.
function sortWords(max) {
    'use strict';

    // Get the words:
    var words = $('words').value;

    // Convert the string to an array:
    words = words.split(' ');

    // Sort the words:
    var sorted = words.map(function(value) {
        return value.toLowerCase();
    }).sort();
    /*
if (!Array.prototype.map)
{
   Array.prototype.map = function(value) //,thisp)
   {
      var len = this.length;

      if (typeof fun != "function")
      throw new TypeError();

      var res = new Array(len);
      var thisp = arguments[1];

      for (var i = 0; i < len; i++)
      {
         if (i in this)
         res[i] = fun.call(thisp, this[i], i, this);
      }
      return res;
   };
} */
    // Send the output to the page:
    setText('output', sorted.join(', '));

    // Return false to prevent submission:
    return false;

} // End of sortWords() function.

function init() {
    'use strict';
    $('theForm').onsubmit = sortWords;
} // End of init() function.
window.onload = init;