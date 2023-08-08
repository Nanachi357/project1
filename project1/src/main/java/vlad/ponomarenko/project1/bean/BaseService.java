package vlad.ponomarenko.project1.bean;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BaseService {

    public LocalDateTime currentTime() {
        return LocalDateTime.now();
    }
}
