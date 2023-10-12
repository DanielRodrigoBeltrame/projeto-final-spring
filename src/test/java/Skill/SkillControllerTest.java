package Skill;

import com.example.projeto.domains.skill.SkillController;
import com.example.projeto.domains.skill.SkillRepository;
import com.example.projeto.domains.skill.SkillServiceImpl;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(SkillController.class)
class SkillControllerTest {

    @MockBean
    private SkillServiceImpl skillService;

    @Autowired
    private MockMvc mockMvc;


}
