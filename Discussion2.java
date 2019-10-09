import java.util.*;

class Class{
    int class_strength = 0;
    public void set_class_strength(int cs){
        class_strength = cs;
    }
    public int get_class_strength(){
        return class_strength;
    }
}
class Discussion2 extends Class{
    String github_url;
    public void set_github_url(String url){
        github_url = url;
    }
}
class Lecture extends Class{
    String lecture_slides;

    public void set_lecture_slides(String slides){
        lecture_slides = slides;
    }

}