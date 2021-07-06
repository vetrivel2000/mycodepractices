/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package employee;
public class ConstructorOverloading {
    public int employeeId,salary;
    public String employeeName;
    public ConstructorOverloading(String name)
    {
        employeeName=name;
    }
    public ConstructorOverloading(String name,int stipend)
    {
        employeeName=name;
        salary=stipend;
    }
    public ConstructorOverloading(String name,int stipend,int id)
    {
        employeeName=name;
        salary=stipend;
        employeeId=id;
    }
}
