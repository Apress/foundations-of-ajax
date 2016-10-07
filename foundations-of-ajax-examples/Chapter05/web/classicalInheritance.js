
function Vehicle() {
    var wheelCount = 4;
    var curbWeightInPounds = 4000;

    this.getWheelCount = function() {
        return wheelCount;
    }

    this.setWheelCount = function(count) {
        wheelCount = count;
    }

    this.getCurbWeightInPounds = function() {
        return curbWeightInPounds;
    }

    this.setCurbWeightInPounds = function(weight) {
        curbWeightInPounds = weight;
    }

    this.refuel = function() {
        return "Refueling Vehicle with regular 87 octane gasoline";
    }

    this.mainTasks = function() {
        return "Driving to work, school, and the grocery store";
    }
}

function SportsCar() {
    this.refuel = function() {
        return "Refueling SportsCar with premium 94 octane gasoline";
    }

    this.mainTasks = function() {
        return "Spirited driving, looking good, driving to the beach";
    }
}

function CementTruck() {
    this.refuel = function() {
        return "Refueling CementTruck with diesel fuel";
    }

    this.mainTasks = function() {
        return "Arrive at construction site, extend boom, deliver cement";
    }
}
