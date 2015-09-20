// employee.js #2
// This script creates an object using form data.

// Function called when the form is submitted.
// Function creates a new object.

var employees =[];

function process() {
    'use strict';

    // Get form references:
    var firstName = $('firstName');
    var lastName = $('lastName');
    var department = $('department');

    // Reference to where the output goes:
    var output = document.getElementById('output');

    // Create a new object:
    var employee = {
        firstName: firstName,
        lastName: lastName,
        department: department,
        getName: function() {
            return this.lastName + ', ' + this.firstName;
        },
        hireDate: new Date()
        //hireDate2 = hireDate.toString();
    }; // Don't forget the semicolon!

    employees.push(employee);
        
    var message = '<h2>Employees</h2><ol>';
    for (var i = 0, count = employees.length; i < count; i++) {
        
        var temp = '<h2>Employee Added</h2>Name: ' + employees[i].getName() + '<br>';
        temp += 'Department: ' + employees[i].department + '<br>';
        temp += 'Hire Date: ' + employees[i].hireDate.toDateString();
    
        message += '<li>' + temp + '</li>';
    }
    message += '</ol>';
   
    // Display the employee object:
    output.innerHTML = message;

    // Return false:
    return false;

} // End of process() function.


function $(elementId){
	'use strict';
	if(typeof elementId != 'undefined'){
		return document.getElementById(elementId).value;
	}
}


// Initial setup:
function init() {
    'use strict';
    document.getElementById('theForm').onsubmit = process;
} // End of init() function.
window.onload = init;