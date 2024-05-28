grammar Qlang;

// Parser rules

program: (stmt ';')* EOF;

stmt: question           #QuestionStmt
    | assign             #AssignStmt
    | execute            #ExecuteStmt
    | export             #ExportStmt
    | declare            #DeclareStmt
    ;

question: (holeQuestion | openQuestion | codeHoleQuestion | codeOpenQuestion);

holeQuestion: 'hole' questionID 'is' holeQuestionBlock 'end';
openQuestion: 'open' questionID 'is' questionBlock 'end';
codeHoleQuestion: 'code-hole' questionID 'is' codeQuestionBlock 'end';
codeOpenQuestion: 'code-open' questionID 'is' codeQuestionBlock 'end';

questionBlock: printStatement ';' (printStatement ';')+
            | printStatement
            ;
holeQuestionBlock: (printStatement ';')+ holePrintStatement ';'
            | holePrintStatement
            ;
codeQuestionBlock: (printStatement ';')* usesStatement ';' (printStatement ';')*;

holePrintStatement: printStatement ' ans->' anwser STRING;
printStatement: ('print' | 'println') STRING;
usesStatement: 'uses' 'code' 'from' STRING 'end';
anwser: STRING;

assign: var ':=' ('new' questionID | execute);

execute: 'execute' var;

export: 'export' 'result' 'to' STRING;

declare: var ':' type;

var: ID;

questionID: questionID '.' questionID #subtype
            | ID                      #IDtype
            ;

type: 'question' | 'fraction';



// Lexer Rules

ID: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: '"' ('\\"' | ~["\r\n])* '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;
