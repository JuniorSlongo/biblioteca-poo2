package com.ifc.library.factory;

import com.ifc.library.entity.Teacher;
import com.ifc.library.entity.User;
import org.springframework.stereotype.Component;

@Component
public class TeacherFactory implements UserFactory{
  @Override
  public User createUser() {
    return new Teacher();
  }

  public Teacher createTeacher(String departament) {
    Teacher teacher = new Teacher();
    teacher.setDepartment(departament);
    return teacher;
  }
}
