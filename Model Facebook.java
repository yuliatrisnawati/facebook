package Model;

import java.util.ArrayList;

public class Facebook {
    public String user;
    public String foto;
    public String caption;
    public int like = 0;
    public ArrayList komen = new ArrayList();


    public Facebook(){
    }

    public Facebook(String userPost, String fotoPost, String captionPost, int likePost, ArrayList komenPost){
        this.user = userPost;
        this.foto = fotoPost;
        this.caption = captionPost;
        this.like = likePost;
        this.komen = komenPost;
    }

    public void post(){
        System.out.println();
        System.out.println(this.user);
        System.out.println("-------------------");
        System.out.println(this.foto);
        System.out.println("-------------------");
        System.out.println(this.caption);
        System.out.println("[1]Like: " + this.like + "  [2]Comment: " + this.komen.size() + "  [3]Show Comment" + "  [4]Copy Link");
        System.out.println();
    }
    public void postingan(){
        System.out.println();
        System.out.println(this.user);
        System.out.println("-------------------");
        System.out.println(this.foto);
        System.out.println("-------------------");
        System.out.println(this.caption);
        System.out.println("[1]Like: " + this.like + "  [2]Comment: " + this.komen.size() + "  [3]Show Comment" + "  [4]Copy Link");
        System.out.println("[0]Pilih Postingan Lain");
        System.out.println();
    }

    public int like(int suka){
        like = like + 1;
        return like;
    }

    public ArrayList Comments(String komentar){
        for (int i = 0; i < 1; i++){
            komen.add(komentar);
        }
        return komen;
    }

    public void showComment(){
        for (int i = 0; i < komen.size(); i++)
            System.out.println(komen.get(i));
    }
}

