package uab.ready2go.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import uab.ready2go.Ready2goApplication;
import uab.ready2go.logger.LogType;
import uab.ready2go.logger.UtilLogger;
import uab.ready2go.model.User;
import uab.ready2go.model.dto.UserDTO;
import uab.ready2go.service.user.UserService;

import java.util.List;

@Api(tags = "")
@Validated
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> findAllApplications() {
        UtilLogger.registerInfo(Ready2goApplication.class, LogType.INFO, "/findAll");
        return new ResponseEntity<>(userService.findAll(), HttpStatus.valueOf(200));
    }

    @PostMapping(value="/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> findById(@RequestBody UserDTO userDto) {
        UtilLogger.registerInfo(Ready2goApplication.class, LogType.INFO, "register/" + userDto.toString());
        User user = userService.convertToEntity(userDto);
        user = userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.valueOf(200));
    }

    @DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Boolean> deleteFileContract(@RequestParam Integer id) {
        UtilLogger.registerInfo(Ready2goApplication.class, LogType.INFO, "/delete?id=" + id);
        User user = userService.findById(id);
        if (user != null) {
            userService.delete(id);
            return new ResponseEntity<>(true, HttpStatus.valueOf(200));
        } else {
            return new ResponseEntity<>(false, HttpStatus.valueOf(200));
        }
    }


}
