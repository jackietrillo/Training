// employee.js #2
// This script creates an object using form data.

// Function called when the form is submitted.
// Function creates a new object.

var employees =[];

function employeeObject(firstName, lastName, department) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.department = department;
	this.hireDate = new Date();
	this.getName = function() {
            return this.lastName + ', ' + this.firstName;
     };       
}

function process() {
    'use strict';

    // Get form references:
    var firstName = $('firstName');
    var lastName = $('lastName');
    var department = $('department');

	var employee = new employeeObject(firstName, lastName, department);

    // Reference to where the output goes:
    var output = document.getElementById('output');

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