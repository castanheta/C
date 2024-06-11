grammar StrLang;

program: stat* EOF;

stat: assign    #StatAssign
    | print     #StatPrint
    ;

assign: ID ':' expr;

expr: 'input(' STRING ')'   #ExprInput
    |   STRING              #ExprString
    ;

print:  'print ' (STRING | ID);

ID: [a-zA-Z0-9_]+;
STRING: '"' .*? '"';
WS: [ \t\n\r]+ -> skip;
Comment: '//' .*? '\n' -> skip;