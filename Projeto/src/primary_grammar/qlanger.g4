grammar qlanger;

// Parser rules

program: stmt* EOF;

stmt: questionDef ';'
    | questionAssign ';'
    | executeStatement ';'
    | exportStatement ';'
    | typeDecl ';'
    ;

questionDef: questionType questionID 'is' statementBlock 'end';

questionID: questionID '.' questionID #subtype
            | ID                      #IDtype
            ;

questionAssign: var ':=' 'new' questionID;

executeStatement: var ':=' 'execute' var
           | 'execute' var
           ;

exportStatement: 'export' 'result' 'to' STRING;

typeDecl: var ':' type;

var: ID;

// Lexer rules

questionType: 'hole' | 'open' | 'code-hole' | 'code-open' | 'code-output' | 'multi-choice';

type: 'question' | 'fraction';
    
statementBlock: (statement)+;

statement: hole_printlnStatement
         | open_printlnStatement
         | usesStatement
         ;

hole_printlnStatement: 'println' STRING 'ans->' STRING anwser;

open_printlnStatement: 'println' STRING';';

anwser: STRING;

usesStatement: 'uses' 'code' 'from' STRING 'end'';';

// Tokens

ID: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: '"' ('\\"' | ~["\r\n])* '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;
