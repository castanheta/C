
import org.antlr.v4.runtime.tree.*;


@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitStatements(HelloParser.StatementsContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      System.out.print("Olá");
      visit(ctx.name());
      return null;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      System.out.print("Adeus");
      visit(ctx.name());
      return null;
   }

   @Override public String visitName(HelloParser.NameContext ctx) {
      for(TerminalNode n: ctx.ID())
         System.out.print(" " + n.getText());
      return null;
   }
}
