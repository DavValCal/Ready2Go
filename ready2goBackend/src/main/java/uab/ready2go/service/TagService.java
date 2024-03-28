package uab.ready2go.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uab.ready2go.model.Tag;
import uab.ready2go.repository.TagRepository;

import java.util.NoSuchElementException;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

}
