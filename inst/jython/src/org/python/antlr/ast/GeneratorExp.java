// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class GeneratorExp extends exprType {
    public exprType elt;
    public comprehensionType[] generators;

    public static final String[] _fields = new String[] {"elt","generators"};

    public GeneratorExp(Token token, exprType elt, comprehensionType[]
    generators) {
        super(token);
        this.elt = elt;
        addChild(elt);
        this.generators = generators;
        if (generators != null) {
            for(int igenerators=0;igenerators<generators.length;igenerators++) {
                addChild(generators[igenerators]);
            }
        }
    }

    public GeneratorExp(int ttype, Token token, exprType elt,
    comprehensionType[] generators) {
        super(ttype, token);
        this.elt = elt;
        addChild(elt);
        this.generators = generators;
        if (generators != null) {
            for(int igenerators=0;igenerators<generators.length;igenerators++) {
                addChild(generators[igenerators]);
            }
        }
    }

    public GeneratorExp(PythonTree tree, exprType elt, comprehensionType[]
    generators) {
        super(tree);
        this.elt = elt;
        addChild(elt);
        this.generators = generators;
        if (generators != null) {
            for(int igenerators=0;igenerators<generators.length;igenerators++) {
                addChild(generators[igenerators]);
            }
        }
    }

    public String toString() {
        return "GeneratorExp";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("GeneratorExp(");
        sb.append("elt=");
        sb.append(dumpThis(elt));
        sb.append(",");
        sb.append("generators=");
        sb.append(dumpThis(generators));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitGeneratorExp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (elt != null)
            elt.accept(visitor);
        if (generators != null) {
            for (int i = 0; i < generators.length; i++) {
                if (generators[i] != null)
                    generators[i].accept(visitor);
            }
        }
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}