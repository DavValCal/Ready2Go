package uab.ready2go.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uab.ready2go.model.Permission;
import uab.ready2go.repository.PermissionRepository;

import java.util.NoSuchElementException;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

}
