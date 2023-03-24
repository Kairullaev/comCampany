import model.Group;
import service.impl.GroupServiceImpl;

public class Main {
    public static void main(String[] args) {

        GroupServiceImpl groupService = new GroupServiceImpl();
        groupService.addNewGroup(new Group(1,"Java","java sila",2023));
        groupService.addNewGroup(new Group(2,"js","java super",2022));
        groupService.addNewGroup(new Group(3,"python","js sila",2021));

        System.out.println("------------------------------");
        groupService.getAllGroups(); //baardyk grupany chygarat\
        System.out.println("-------------------------------");
        groupService.getGroupById(2);
//        System.out.println(groupService);


    }
}