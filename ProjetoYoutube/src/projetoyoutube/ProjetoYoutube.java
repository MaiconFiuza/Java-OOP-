
package projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
       
       //Criar filmes
       Video v[] = new Video[3];
       v[0] = new Video("Sasuke x Gaara ao som de link park");
       v[1] = new Video("Meninas super poderosas");
       v[2] = new Video("Gols final corinthians x boca 2012");
       
       
       //Criar usuário
       Usuario user[]=new Usuario[3];
       user[0] = new Usuario("Maicon Fiuza",24,"M","maiclove07");
       user[1] = new Usuario("Euclides",23,"M","ClidsTatoo");
       user[2] = new Usuario("Gabriel",23, "M","Medeiros");
       
       //Mostrar os filmes criados
       for(int i=0;i<v.length;i++)
       {
           System.out.println(v[i].toString());
       }
       
       //Mostrar os usuário criados
       for(int i=0;i<user.length;i++)
       {
           System.out.println(user[i].toString());
       }
       
       
       /*Fazendo a junção das duas tabelas ou seja fazendo os usários assisterem
       os vídeos */
       Visualizacao vis[]=new Visualizacao[5];
       
       vis[0]= new Visualizacao(user[0],v[2]);;
       vis[0].avaliar(10);
       
       vis[1]= new Visualizacao(user[0],v[0]);;
       vis[1].avaliar();
       
       vis[2]= new Visualizacao(user[2],v[1]);;
       vis[2].avaliar(6);
       
       vis[3]= new Visualizacao(user[0],v[2]);;
       vis[3].avaliar(9);
       
       vis[4]= new Visualizacao(user[2],v[2]);;
       vis[4].avaliar(10);
       
       //Mostrar quem assistiu o que e a avaliação dos mesmos
       for(int i=0;i<vis.length;i++){
           System.out.println(vis[i].toString());
       }
       
       
       
       
       
    }
    
}
