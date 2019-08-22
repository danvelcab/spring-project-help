package com.danvelcab.project.help.projecthelp.seed;

import com.danvelcab.project.help.projecthelp.repository.IProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DBSeed implements ApplicationListener<ApplicationReadyEvent> {
    @Value("${spring.database.seed}")
    private Boolean seed;

    @Autowired
    private IProject projectRepository;
    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        if(this.seed) {
            this.projectRepository.deleteAll();
            ProjectSeed projectSeed = new ProjectSeed();
            projectSeed.seedProjectTable(this.projectRepository);
        }
    }
}
