/* Constructor function for the Vehicle object */
function Vehicle() { }

/* Standard properties of a Vehicle */
Vehicle.prototype.wheelCount = 4;
Vehicle.prototype.curbWeightInPounds = 4000;

/* Function for refueling a Vehicle */
Vehicle.prototype.refuel = function() {
    return "Refueling Vehicle with regular 87 octane gasoline";
}

/* Function for performing the main tasks of a Vehicle */
Vehicle.prototype.mainTasks = function() {
    return "Driving to work, school, and the grocery store";
}


/* Constructor function for the SportsCar object */
function SportsCar() { }

/* SportsCar extends Vehicle */
SportsCar.prototype = new Vehicle();

/* SportsCar is lighter than Vehicle */
SportsCar.prototype.curbWeightInPounds = 3000;

/* SportsCar requires premium fuel */
SportsCar.prototype.refuel = function() {
    return "Refueling SportsCar with premium 94 octane gasoline";
}

/* Function for performing the main tasks of a SportsCar */
SportsCar.prototype.mainTasks = function() {
    return "Spirited driving, looking good, driving to the beach";
}


/* Constructor function for the CementTruck object */
function CementTruck() { }

/* CementTruck extends Vehicle */
CementTruck.prototype = new Vehicle();

/* CementTruck has 10 wheels and weighs 12,000 pounds*/
CementTruck.prototype.wheelCount = 10;
CementTruck.prototype.curbWeightInPounds = 12000;

/* CementTruck refuels with diesel fuel */
CementTruck.prototype.refuel = function() {
    return "Refueling CementTruck with diesel fuel";
}

/* Function for performing the main tasks of a SportsCar */
CementTruck.prototype.mainTasks = function() {
    return "Arrive at construction site, extend boom, deliver cement";
}
