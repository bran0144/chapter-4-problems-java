// At the bottom of Section 4.3.3, we use a switch statement to determine the location of 
// various area codes in New York state. Write an equivalent fragment of code using if-else 
// statements instead.

String location = "";
int code;

if( code == 917 ) {
    location = "Cellular: New York City";
}
else if( code == 212 ) {
    location = "Cellular: New York City";
}
else if( code == 347 ) {
    location = "Cellular: New York City";
}
else if( code == 648 ) {
    location = "Cellular: New York City";
}
else if( code == 718 ) {
    location = "New York City";
}
else if( code == 315 ) {
    location = "Syracuse";
}
else if( code == 516 ) {
    location = "Nassau County";
}
else if( code == 518 ) {
    location = "Albany";
}   
else if( code == 585 ) {
    location = "Rochester";
}
else if( code == 607 ) {
    location = "South Central New York";
}    
else if( code == 631 ) {
    location = "Suffolk County";
}
else if( code == 716 ) {
    location = "Buffalo";
}
else if( code == 845 ) {
    location = "Lower Hudson Valley";
}
else if( code == 718 ) {
    location = "Westchester County";
}
else {
    location = "Unknown Area Code";
}

