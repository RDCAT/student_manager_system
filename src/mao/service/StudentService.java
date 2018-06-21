package mao.service;

import mao.dao.StudentDao;
import mao.model.Student;
import mao.view.addview.AddView;

import javax.swing.*;

/**
 * @author 豪
 * @date 2018/6/21 14:34
 */
public class StudentService {
    public static void addStudent(Student student) {
        if (!(StudentDao.isStudent(student.getName(), student.getSno()))) {
            StudentDao.add(student);
            JOptionPane.showMessageDialog(null,"数据库录入成功");
        } else {
            JOptionPane.showMessageDialog(null,"数据库已经存在该学生信息，数据录入失败");
        }
    }

    public static void updateStudent(Student student) {
        if (StudentDao.isStudent(student.getName(), student.getSno())) {
            StudentDao.update(student);
            JOptionPane.showMessageDialog(null, "数据库更新成功");
        } else {
            JOptionPane.showMessageDialog(null,"数据库不存在该学生信息，数据更新失败");
        }
    }

    public static void deleteStudent(String name, String sno) {
        if (StudentDao.isStudent(name, sno)) {
            StudentDao.delete(name,sno);
            JOptionPane.showMessageDialog(null, "数据删除成功");
        } else {
            JOptionPane.showMessageDialog(null,"数据库不存在该学生信息，数据删除失败");
        }
    }
}
