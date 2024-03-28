package uab.ready2go.service.user;

import uab.ready2go.model.User;
import uab.ready2go.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Integer id);

    User save(User user);
    void delete(Integer id);

    UserDTO convertToDTO(User user);
    User convertToEntity(UserDTO userDTO);
}
