/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Jennifer
 */
public class IllegalFullNameException extends IllegalArgumentException {
// nees to have all the constructiors of the superclass
    
    private static final String ERR_MSG = "SOrry full name must consiste of first name and lastName";
    
    
    public IllegalFullNameException() {
         super(ERR_MSG);
    }

    public IllegalFullNameException(String s) {
        super(ERR_MSG);
    }

    public IllegalFullNameException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public IllegalFullNameException(Throwable cause) {
        super(cause);
    }
    
    
}
