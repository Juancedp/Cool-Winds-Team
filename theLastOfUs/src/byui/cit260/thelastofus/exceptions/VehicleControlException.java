/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thelastofus.exceptions;

/**
 *
 * @author Karl
 */
public class VehicleControlException extends Exception {

    public VehicleControlException() {
    }

    public VehicleControlException(String message) {
        super(message);
    }

    public VehicleControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public VehicleControlException(Throwable cause) {
        super(cause);
    }

    public VehicleControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
