package com.unal.lizzard.service;
import com.unal.lizzard.model.*;
import com.unal.lizzard.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

public interface UserService {
    User save (UserRegistrationDto userRegistrationDto);
}
