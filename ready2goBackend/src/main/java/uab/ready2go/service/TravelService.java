package uab.ready2go.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uab.ready2go.model.Travel;
import uab.ready2go.repository.TravelRepository;

import java.util.NoSuchElementException;

@Service
public class TravelService {

    @Autowired
    private TravelRepository travelRepository;

}
