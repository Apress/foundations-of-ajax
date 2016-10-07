/** 
 * @fileoverview This file is an example of how JSDoc can be used to document
 * JavaScript. 
 *
 * @author Ryan Asleson
 * @version 1.0 
 */

/**
 * Construct a new Person class.
 * @class This class represents an instance of a Person.
 * @constructor 
 * @param {String} name The name of the Person.
 * @return A new instance of a Person.
*/
function Person(name) {
    /** 
     * The Person's name
     * @type String
    */
    this.name = name;

    /**
     * Return the Person's name. This function is assigned in the class
     * constructor rather than using the prototype keyword.
     * @returns The Person's name
     * @type String 
    */
    this.getName = function() {
        return name;
    }
}


/**
 * Construct a new Employee class.
 * @extends Person
 * @class This class represents an instance of an Employee.
 * @constructor 
 * @return A new instance of a Person.
*/
function Employee(name, title, salary) {
    this.name = name;

    /** 
     * The Employee's title
     * @type String
    */
    this.title = title;

    /** 
     * The Employee's salary
     * @type int
    */
    this.salary = salary;
}

/* Employee extends Person */
Employee.prototype = new Person();

/**
 * An example of function assignment using the prototype keyword. 
 * This method returns a String representation of the Employee's data.
 * @returns The Employee's name, title, and salary 
 * @type String
*/
Employee.prototype.getDescription = function() {
    return this.name + " - " 
        + this.title + " - "
        + "$" + this.salary;
}