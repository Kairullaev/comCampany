package service.impl;

import db.Database;
import model.Group;
import service.GroupService;

import java.util.List;

public class GroupServiceImpl implements GroupService {

    Database database = new Database();

    @Override
    public String addNewGroup(Group group) {
        database.getGroups().add(group);
        System.out.println(group);
        return " gruppa saktaldy ";
    }

    @Override
    public String getGroupById(int id) {
     database.getGroups().stream().filter(group -> id==id);
        System.out.println(id);
        return " okey ";
    }

    @Override
    public List<Group> getAllGroups() {
        database.getGroups().forEach(System.out::println);
        return null;
    }

    @Override
    public String updateGroupName(int id, String groupName) {
     database.getGroups().stream().toList();
        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }
}
