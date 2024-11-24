import java.nio.file.Files;
import java.nio.file.Paths;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //cambiar la ruta según el codigo que se desea ejecutar (parsear)
        String filePath = "src/olmosTypes/calculadora.olmos";

        String code = new String(Files.readAllBytes(Paths.get(filePath)));

        OlmosTypesLexer lexer = new OlmosTypesLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OlmosTypesParser parser = new OlmosTypesParser(tokens);

        ParseTree tree = parser.program(); // Cambia 'program' si tu regla inicial es diferente

        System.out.println("Árbol Sintáctico: ");
        System.out.println(tree.toStringTree(parser));

        OlmosTypesCustomVisitor visitor = new OlmosTypesCustomVisitor();
        visitor.visit(tree);
    }
}
