package uab.ready2go.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import uab.ready2go.service.TagService;

@Api(tags = "")
@Validated
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

}
