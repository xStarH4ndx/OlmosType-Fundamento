import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            // Leer el archivo de entrada
            String inputFile = "src/test.olmos"; // Asegúrate de que este archivo esté en tu carpeta de proyecto
            String input = new String(Files.readAllBytes(Paths.get(inputFile)));

            // Crear el Lexer
            OlmosSimpleLexer lexer = new OlmosSimpleLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Crear el Parser
            OlmosSimpleParser parser = new OlmosSimpleParser(tokens);

            // Analizar el archivo y construir el árbol
            ParseTree tree = parser.program();

            // Usar un Visitor personalizado para interpretar el código
            OlmosCustomSimpleVisitor visitor = new OlmosCustomSimpleVisitor();
            visitor.visit(tree);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
