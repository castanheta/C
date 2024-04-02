grammar Hello;
statements: (greetings | bye)+ EOF;
greetings : 'hello' name;
bye: 'bye' name;
name: ID+ ;
ID : [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;
