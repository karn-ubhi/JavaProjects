/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author Karndeep Ubhi
 */
public interface IBaseRate {
    // write a methods that returns a base rate
    default double getBaseRate()
    {
        return 2.5;
    }
    
}
