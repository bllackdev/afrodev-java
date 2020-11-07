package excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Questoes {
    // Questoes:
    // https://docs.oracle.com/javase/tutorial/essential/exceptions/QandE/questions.html

    /**
     * 01.
     * Sim, o Catch é opcional.
     */
    // ==========================================
    /**
     * 02.
     * Os três tipos de Exceções:
     * Checked, Error e Runtime
     * Mas
     */
    // ==========================================
    /**
     * 03.
     * try {
     *
     * } catch (Exception e) {
     *
     * } catch (ArithmeticException a) {
     *
     * }
     * No bloco não irá Compilar, deixar o tratamento do
     * mais amplo acima do mais especifico. Nesse caso, o compilador
     * nunca entraria no ArithmeticException
     * No caso deveria deixar o ArithmeticException primeiro
     * e por ultimo a Exception
     */
    // ==========================================
    /**
     * 04.
     * 1 --> B
     * 2 --> D
     * 3 --> A
     * 4 --> C
     */
    // ==========================================



    public static void main(String[] args) throws IOException {
        /**
         * 02. Exercicio Prático
         * @param file
         * @throws IOException
         */

        /**
         * //Versão no exercicio:
         * public static void cat(File file) {
         *     RandomAccessFile input = null;
         *     String line = null;
         *
         *     try {
         *         input = new RandomAccessFile(file, "r");
         *         while ((line = input.readLine()) != null) {
         *             System.out.println(line);
         *         }
         *         return;
         *     } finally {
         *         if (input != null) {
         *             input.close();
         *         }
         *     }
         * }
         */

        String file;
        public static void cat(File file) throws IOException {
            RandomAccessFile input = null;
            String line = null;

            try {
                input = new RandomAccessFile(file, "r");
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                }
                return;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (input != null) {
                    input.close();
                }
            }
        }
    }


}
