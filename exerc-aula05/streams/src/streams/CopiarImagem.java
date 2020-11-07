package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarImagem {
    public static void main(String[] args) throws IOException {

        FileInputStream origem = null;
        FileOutputStream destino = null;


        try {
            //Arquivo a ser copiado
            origem = new FileInputStream("E:\\Users\\Soma Gestao\\Pictures\\Prints\\07-11-2020.screenshot (11).jpg");
            //Local da onde será copiado e Renomeando o nome da Imagem
            destino = new FileOutputStream("E:\\foto01.png");

            //Variavel auxiliarr
            int aux;

            while ((aux = origem.read()) != -1) {
                destino.write(aux);
            }
        }
        catch (FileNotFoundException err) {
            System.err.println("Arquivo não encontrado!!!");
        }
        catch (IOException err){
            err.printStackTrace();
        }
        finally {
            if (origem != null) {
                origem.close();
            }
            if (destino != null) {
                destino.close();
            }
            System.out.println("Arquivo criado com sucesso!!!");
        }
    }
}