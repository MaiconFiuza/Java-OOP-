package projetoyoutube;


public class Visualizacao {
    
    private Usuario user;
    private Video video;

    public Visualizacao(Usuario user, Video video) {
        this.user = user;
        this.video = video;
        this.user.setTotAssistindo(this.user.getTotAssistindo()+1);
        this.video.setViews(this.video.getViews()+1);
    }
    
    public void avaliar(){
        this.video.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.video.setAvaliacao(nota);
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "user=" + user + ", video=" + video + '}';
    }
    
    
    
}
