grammar CAL;

// Case-insensitive fragments for letters
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

// Keywords, symbols, and operators
Variable: V A R I A B L E;
Constant: C O N S T A N T;
Return: R E T U R N;
IntType: I N T | I N T E G E R;
BoolType: B O O L | B O O L E A N;
VoidType: V O I D;
Main: M A I N;
If: I F;
Else: E L S E;
True: T R U E;
False: F A L S E;
While: W H I L E;
Begin: B E G I N;
End: E N D;
Is: I S;
Skip: S K I P;

// Symbols for operations and delimiters
Assign: ':=';
Plus: '+';
Minus: '-';
Neg: '~';
Or: '|';
And: '&';
Equals: '=';
NotEquals: '!=';
Less: '<';
LessOrEquals: '<=';
Greater: '>';
GreaterOrEquals: '>=';
Comma: ',';
Colon: ':';
Semicolon: ';';
LBR: '(';
RBR: ')';

// Literals
Number: ('-')? [1-9][0-9]* | '0';
ID: [a-zA-Z] [a-zA-Z0-9_]*;

// Starting point for the program
program: decl_list function_list main EOF;

// Declarations
decl_list: (decl Semicolon)*;
decl: var_decl | const_decl;

// Variable declaration
var_decl: Variable ID Colon type;

// Constant declaration
const_decl: Constant ID Colon type Assign expr;

// Functions
function_list: function*;
function: type ID LBR parameter_list? RBR Is decl_list Begin statement_block Return LBR expr? RBR Semicolon End;

// Types
type: IntType | BoolType | VoidType;

// Parameters
parameter_list: nemp_parameter_list?;
nemp_parameter_list: ID Colon type (Comma ID Colon type)*;

// Main program block
main: Main Begin decl_list statement_block End;

// Statements
statement_block: (statement)*;
statement: assign
         | ID LBR arg_list? RBR Semicolon       // function call
         | Begin statement_block End
         | If condition Begin statement_block End (Else Begin statement_block End)?
         | While condition Begin statement_block End
         | Return LBR expr? RBR Semicolon
         | Skip Semicolon;

// New assignment rule
assign: ID Assign expr Semicolon;

// Expressions
expr: expr binary_arith_op expr
    | LBR expr RBR
    | ID LBR arg_list? RBR
    | frag;

binary_arith_op: Plus | Minus | '*' | '%';

frag: ID
    | Minus ID
    | Number
    | True
    | False
    | LBR expr RBR;

// Conditions
condition: Neg condition
         | LBR condition RBR
         | expr comp_op expr
         | condition (Or | And) condition;

comp_op: Equals | NotEquals | Less | LessOrEquals | Greater | GreaterOrEquals;

// Arguments
arg_list: nemp_arg_list?;
nemp_arg_list: expr (Comma expr)*;

// Comments and whitespace
Comment: '/*' (Comment | ~[*/])*? '*/' -> skip;
CommentLine: '//' ~[\n\r]* -> skip;
WS: [ \t\n\r]+ -> skip;
