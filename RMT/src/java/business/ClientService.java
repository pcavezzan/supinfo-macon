/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import domain.Client;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author patrice
 */
@Remote
public interface ClientService {
    
    Client addClient(Client client);
    
    List<Client> getAll();
    
    Client getById(Long id);
    
}
