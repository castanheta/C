grammar qlanger;

// Parser rules

program: stmt* EOF;

stmt: questionDef ';'
    | questionAssign ';'
    | executeStatement ';'
    | exportStatement ';'
    | typeDecl ';'
    ;

questionDef: holeDef | openDef;

holeDef: 'hole' questionID 'is' holeStatementBlock 'end';

openDef: questionType questionID 'is' statementBlock 'end';

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

questionType: 'open' | 'code-hole' | 'code-open' | 'code-output' | 'multi-choice';

type: 'question' | 'fraction';

holeStatementBlock: 'println' STRING ' ans->' STRING anwser;
    
statementBlock: singleStatement | (multipleStatement)+;

singleStatement: open_printlnStatement;

multipleStatement: (open_printlnStatement ';' |  usesStatement ';');

open_printlnStatement: 'println' STRING;

usesStatement: 'uses' 'code' 'from' STRING 'end';

anwser: STRING;

// Tokens

ID: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: '"' ('\\"' | ~["\r\n])* '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;
