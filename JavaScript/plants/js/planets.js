

function displayPlanet(e) {
    'use strict';
    var planets = e.target;

    if (planets.selectedIndex != -1 || planets.selectedIndex != planets.options.length - 1)
    {
        //set the title 
        //set the image
        //set the info                         
    }
    if (planets.selectedIndex == planets.options.length - 1)
    {
       updateMenu();         
    }
    
}

function displayGalaxy(e) {
   alert('displayPlanet');
   
    var galaxies = e.target;

    if (galaxies.selectedIndex != -1)
    {
        //set the title 
        //set the image
        //set the info                         
    }
}

function reset() {
    //clear title
    //clear image
    //clear info        
}

function updateMenu() {
    'use strict';
    
    //hide plantes
    //show galaxies             
}



function init() {
    'use strict';
    U.addEvent(U.$('planets'), 'change', displayPlanet);
    U.addEvent(U.$('galaxies'), 'change', displayGalaxy);        
} 

window.onload = init;