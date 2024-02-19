

public class StudentDatabase {

    String[] List;
    boolean elevenrolled = false;

    public StudentDatabase(String[] List) {
        this.List = List;
    }

    public boolean IsStudentEnrolled(String navn) {
        for (int i = 0; i <= List.length - 1; i++) {
            if (List[i].equals(navn)) {
                elevenrolled = true;
            }

        }
        return elevenrolled;
    }

    public String[] addNames(String ekstra1) {
        String[] names = new String[List.length + 1];
        names[List.length] = ekstra1;
        System.arraycopy(List, 0, names, 0, List.length);
        this.List = names;
        return names;

    }

    public void getNewStudentList(){

        for(String i : this.List)
        System.out.println(i);
    }


}

