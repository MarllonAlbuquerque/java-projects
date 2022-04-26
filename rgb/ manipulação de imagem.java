package fg;
import javax.imageio.ImageIO;
import javax.swing.;
import java.awt.;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class main {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub



        // TODO Auto-generated method stub

         File arquivo = new File("C:\\\\Users\\\\aluno\\\\Downloads\\\\exe.png");
              BufferedImage imagem = ImageIO.read(arquivo);
              BufferedImage imagemSaida =  bandaR(imagem);
              //ImageIO.write(imagem, "png",new File("src\\\\lena2.png"));

              //exibindo a img
              JLabel mylabel = new JLabel(new ImageIcon(imagemSaida));
              JPanel mypanel = new JPanel();
              mypanel.add(mylabel);
              JFrame myframe = new JFrame();
              myframe.setSize(new Dimension(imagem.getWidth(),imagem.getHeight()));
              myframe.add(mypanel);
              myframe.setVisible(true);

          }



          public static BufferedImage bandaR (BufferedImage img){
              int largura = img.getWidth();
              int altura = img.getHeight();
              BufferedImage imgSaida = new BufferedImage(largura,altura,BufferedImage.TYPE_INT_RGB);

              //8bits = 1 byte --> [0,255]
              for(int linha=0; linha < altura; linha++){
                  for(int coluna = 0; coluna < largura; coluna++){
                      //realizando em cada pixel da imagem
                      int rgb =  img.getRGB(coluna,linha);
                      Color cor = new Color(rgb);
                      int red =  cor.getRed();
                      int green = cor.getGreen();
                      int blue = cor.getBlue();
                      Color novaCor = new Color(red,0,0);
                      imgSaida.setRGB(coluna,linha,novaCor.getRGB());
                  }
              }
              return imgSaida;
          }




          public static BufferedImage bandaG (BufferedImage img){
              int largura = img.getWidth();
              int altura = img.getHeight();
              BufferedImage imgSaida = new BufferedImage(largura,altura,BufferedImage.TYPE_INT_RGB);

              //8bits = 1 byte --> [0,255]
              for(int linha=0; linha < altura; linha++){
                  for(int coluna = 0; coluna < largura; coluna++){
                      //realizando em cada pixel da imagem
                      int rgb =  img.getRGB(coluna,linha);
                      Color cor = new Color(rgb);
                      int red =  cor.getRed();
                      int green = cor.getGreen();
                      int blue = cor.getBlue();
                      Color novaCor = new Color(0,green,0);
                      imgSaida.setRGB(coluna,linha,novaCor.getRGB());
                  }
              }
              return imgSaida;
          }



          public static BufferedImage bandaB (BufferedImage img){
              int largura = img.getWidth();
              int altura = img.getHeight();
              BufferedImage imgSaida = new BufferedImage(largura,altura,BufferedImage.TYPE_INT_RGB);

              //8bits = 1 byte --> [0,255]
              for(int linha=0; linha < altura; linha++){
                  for(int coluna = 0; coluna < largura; coluna++){
                      //realizando em cada pixel da imagem
                      int rgb =  img.getRGB(coluna,linha);
                      Color cor = new Color(rgb);
                      int red =  cor.getRed();
                      int green = cor.getGreen();
                      int blue = cor.getBlue();
                      System.out.println(red + ","+green+","+blue);
                      Color novaCor = new Color(0,0,blue);

                      imgSaida.setRGB(coluna,linha,novaCor.getRGB());
                  }
              }
              return imgSaida;
          }



          //banda = 0 --> Red  | banda = 1 --> Green | banda = 2 --> Blue
          public static BufferedImage aumentoDeTonalidade (BufferedImage img, int banda, int aumento){

              int largura = img.getWidth();
              int altura = img.getHeight();
              BufferedImage imgSaida = new BufferedImage(largura,altura,BufferedImage.TYPE_INT_RGB);

              for(int linha=0; linha < altura; linha++){
                  for(int coluna = 0; coluna < largura; coluna++){
                      //realizando em cada pixel da imagem
                      int rgb =  img.getRGB(coluna,linha);
                      Color cor = new Color(rgb);
                      int red =  cor.getRed();
                      int green = cor.getGreen();
                      int blue = cor.getBlue();

                      if(banda == 0) { //red
                          red += aumento;
                          if(red>255)
                              red = 255;
                      }
                      if(banda == 1) { //green
                          green += aumento;
                          if(green>255)
                              green = 255;
                      }
                      if(banda == 2) { //blue
                          blue += aumento;
                          if(blue>255)
                              blue = 255;
                      }

                      Color novaCor = new Color(red,green,blue);
                      imgSaida.setRGB(coluna,linha,novaCor.getRGB());
                  }
              }
              return imgSaida;
          }
          public static BufferedImage grayscaleBanda (BufferedImage img, int banda){
              int largura = img.getWidth();
              int altura = img.getHeight();
              BufferedImage imgSaida = new BufferedImage(largura,altura,BufferedImage.TYPE_INT_RGB);

              //8bits = 1 byte --> [0,255]
              for(int linha=0; linha < altura; linha++){
                  for(int coluna = 0; coluna < largura; coluna++){
                      //realizando em cada pixel da imagem
                      int rgb =  img.getRGB(coluna,linha);
                      Color cor = new Color(rgb);
                      int red =  cor.getRed();
                      int green = cor.getGreen();
                      int blue = cor.getBlue();

                      if(banda == 0) { //red
                        red = green = blue;
                          if(red>255)
                              red = 255;
                      }
                      if(banda == 1) { //green
                        green = blue = red;
                          if(green>255)
                              green = 255;
                      }
                      if(banda == 2) { //blue
                        blue = red = green ;
                          if(blue>255)
                              blue = 255;
                      }
                      Color novaCor = new Color(red,green,blue);
                      imgSaida.setRGB(coluna,linha,novaCor.getRGB());
                  }
              }
              return imgSaida;
          }
          public static BufferedImage grayscaleMedia (BufferedImage img){
              int largura = img.getWidth();
              int altura = img.getHeight();
              BufferedImage imgSaida = new BufferedImage(largura,altura,BufferedImage.TYPE_INT_RGB);

              //8bits = 1 byte --> [0,255]
              for(int linha=0; linha < altura; linha++){
                  for(int coluna = 0; coluna < largura; coluna++){
                      //realizando em cada pixel da imagem
                      int rgb =  img.getRGB(coluna,linha);
                      Color cor = new Color(rgb);
                      int red =  cor.getRed();
                      int green = cor.getGreen();
                      int blue = cor.getBlue();
                      int v = 1;
                      if(v == 1) {
                        int a = (red + green + blue)/3;
                        red = a;
                        green = a;
                        blue = a;

                      }


                      Color novaCor = new Color(red,green,blue);
                      imgSaida.setRGB(coluna,linha,novaCor.getRGB());
                  }
              }
              return imgSaida;

      }


          public static BufferedImage Negativo (BufferedImage img){
              int largura = img.getWidth();
              int altura = img.getHeight();
              BufferedImage imgSaida = new BufferedImage(largura,altura,BufferedImage.TYPE_INT_RGB);

              //8bits = 1 byte --> [0,255]
              for(int linha=0; linha < altura; linha++){
                  for(int coluna = 0; coluna < largura; coluna++){
                      //realizando em cada pixel da imagem
                      int rgb =  img.getRGB(coluna,linha);
                      Color cor = new Color(rgb);
                      int red =  cor.getRed();
                      int green = cor.getGreen();
                      int blue = cor.getBlue();
                      int v = 1;
                      if(v == 1) {
                        red = 255-red;
                        blue = 255-blue;
                        green = 255-green;
                        }
                       Color novaCor = new Color(red,green,blue);
                      imgSaida.setRGB(coluna,linha,novaCor.getRGB());


                      }
                    }






              return imgSaida;

      }



      }
