import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {

   HashMap<String,String> map = new HashMap<>();
   Scanner sc = new Scanner(System.in); 

   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatAssign(StrLangParser.StatAssignContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatPrint(StrLangParser.StatPrintContext ctx) {
      System.out.println(visit(ctx.print()));
      return null;
   }

   @Override public String visitAssign(StrLangParser.AssignContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      map.put(ctx.ID().getText(), visit(ctx.expr()));
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      return ctx.ID().getText();
   }
}
