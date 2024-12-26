package com.example.migration;

import com.example.migration.entity.Text;
import com.example.migration.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ExampleService {
    @Autowired
    private TextRepository textRepository;
    @Autowired
    private UserRepository userRepository;


    @Transactional
    public void createUser() {
        User user = new User();
        user.setName("111111");
        userRepository.saveAndFlush(user);
    }

    public void createText() {
        Text text = new Text();
        text.setText("Text111");
        textRepository.save(text);
    }

}
