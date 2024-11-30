grammar CAL;

// Fragments for case-insensitive matching of letters
fragment A: 'a' | 'A';
fragment B: 'b' | 'B';
fragment C: 'c' | 'C';
fragment D: 'd' | 'D';
fragment E: 'e' | 'E';
fragment F: 'f' | 'F';
fragment G: 'g' | 'G';
fragment H: 'h' | 'H';
fragment I: 'i' | 'I';
fragment J: 'j' | 'J';
fragment K: 'k' | 'K';
fragment L: 'l' | 'L';
fragment M: 'm' | 'M';
fragment N: 'n' | 'N';
fragment O: 'o' | 'O';
fragment P: 'p' | 'P';
fragment Q: 'q' | 'Q';
fragment R: 'r' | 'R';
fragment S: 's' | 'S';
fragment T: 't' | 'T';
fragment U: 'u' | 'U';
fragment V: 'v' | 'V';
fragment W: 'w' | 'W';
fragment X: 'x' | 'X';
fragment Y: 'y' | 'Y';
fragment Z: 'z';

// Keywords
RETURN: R E T U R N;
MAIN: M A I N;
VARIABLE: V A R I A B L E;
IS: I S;
BEGIN: B E G I N;
END: E N D;
INTEGER: I N T E G E R;
VOID: V O I D;
WHILE: W H I L E;
IF: I F;
ELSE: E L S E;

// Operators and punctuation
ASSIGN: ':=';
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';

// Identifiers and numbers
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;

// Comments and whitespace
Comment: '/*' (Comment | ~[*/])*? '*/' -> skip;
CommentLine: '//' ~[\n\r]* -> skip;
WS: [ \t\n\r]+ -> skip;

// Grammar rules
program: (function_decl | main_block)+;

function_decl: type ID LPAREN param_list? RPAREN IS decl_list BEGIN stmt_list (RETURN expr? SEMICOLON)? END;

main_block: MAIN BEGIN decl_list stmt_list END;

type: INTEGER | VOID;

param_list: param (COMMA param)*;
param: ID COLON type;

decl_list: (var_decl)*;
var_decl: VARIABLE ID COLON type SEMICOLON;

stmt_list: (stmt)*;
stmt: assign_stmt
    | func_call_stmt
    | return_stmt
    | if_stmt
    | while_stmt
    | block;

block: BEGIN stmt_list END;

if_stmt: IF LPAREN condition RPAREN stmt (ELSE stmt)?;

while_stmt: WHILE LPAREN condition RPAREN block;

condition: expr rel_op expr;

rel_op: '>' | '<' | '>=' | '<=' | '=' | '!=';

assign_stmt: ID ASSIGN expr SEMICOLON;

func_call_stmt: (ID ASSIGN)? ID LPAREN arg_list? RPAREN SEMICOLON;

return_stmt: RETURN expr? SEMICOLON;

arg_list: expr (COMMA expr)*;

expr: expr (PLUS | MINUS | MUL | DIV) expr
    | LPAREN expr RPAREN
    | ID
    | NUMBER;