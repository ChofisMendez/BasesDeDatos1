grammar GramaticaSQL;

CREATE : 'create' | 'CREATE' | 'Create' ;
DATABASE: 'database' |'DATABASE' | 'Database' ;
DATABASES : 'databases' | 'DATABASES' |'Databases' ;
ALTER : 'alter' |'ALTER'| 'Alter' ;
DROP: 'drop' | 'DROP'| 'Drop' ;
SHOW : 'show' | 'SHOW' | 'Show' ;
USE : 'use' | 'USE' | 'Use' ;
CHECK : 'check' | 'CHECK' | 'Check' ;
CONSTRAINT : 'constraint' | 'CONSTRAINT' | 'Constraint' ;
PRIMARY : 'primary' | 'PRIMARY' | 'Primary' ;
FOREIGN : 'foreign' | 'FOREIGN' | 'Foreign' ;
KEY : 'key'| 'KEY' | 'Key' ;
REFERENCES : 'references' | 'REFERENCES' | 'References' ;
INT : 'int' |'INT' | 'Int' ;
FLOAT : 'float' | 'FLOAT' | 'Float' ;
DATE : 'date' | 'DATE' | 'Date' ;
CHAR : 'char' | 'CHAR' | 'Char' ;
AND : 'and' |'AND' | 'And' ;
OR : 'or' |'OR' | 'Or' ;
NOT : 'not' | 'NOT' |'Not' ;
TABLE : 'table' |'TABLE' | 'Table' ;
TABLES : 'tables' | 'TABLES' | 'Tables' ;
RENAME : 'rename' | 'RENAME' | 'Rename' ;
TO : 'to' | 'TO' | 'To' ;
ADD : 'add' | 'ADD' | 'Add' ;
COLUMN : 'column' | 'COLUMN' | 'Column' ;
COLUMNS : 'columns' | 'COLUMNS' | 'Columns' ;
INSERT : 'insert' | 'INSERT' | 'Insert' ;
INTO : 'into' | 'INTO' | 'Into' ;
VALUES : 'values' | 'VALUES' | 'Values' ;
NULL : 'null' | 'NULL' | 'Null' ;
UPDATE : 'update' | 'UPDATE' | 'Update' ;
SET : 'set' | 'SET' | 'Set' ;
WHERE : 'where' | 'WHERE' | 'Where' ;
DELETE : 'delete' | 'DELETE' | 'Delete' ;
SELECT : 'select' | 'SELECT' | 'Select' ;
FROM : 'from' | 'FROM' | 'From' ;
ORDER : 'order' | 'ORDER' |'Order' ;
BY : 'by' | 'BY' | 'By' ;
ASC : 'asc' | 'ASC' | 'Asc' ;
DESC : 'desc' | 'DESC' | 'Desc';
NUM : Digit(Digit)* ;
ID : Letter (Letter | Digit)* ;
LOGICAL : Relational ;  

COMMENTS: '//' ~('\r' | '\n' )* -> channel(HIDDEN) ;
WS: [ \t\r\n\f]+  -> channel(HIDDEN);

fragment Letter : ('a'..'z' | 'A'..'Z') ;
fragment Digit : '0'..'9' ;
fragment Any : '!' | '@' | '#' | '$' | '%' | '^' | '*' | '(' | ')' | '{' | '}' ;
fragment Operator : '+' | '-' | '*' | '/' ;
fragment Relational : '<' | '<=' | '>' | '>=' | '<>' | '=' ;
fragment Special :  '\t' | '\n' | '\'' | '\"' | '?' | ',' | '.' ;

principal
:	statements (';' statements)* (';')?
;

statements
:	statementDatabase 		#stmtPrincipalDB
|	statementTable			#stmtPrincipalTable
|	statementData			#stmtPrincipalData
;

/*************************DDL*************************/

statementDatabase
:	createDatabase		#stmtCreateDB
|	alterDatabase		#stmtAlterDB
|	dropDatabase		#stmtDropDB
|	useDatabase			#stmtUseDB
|	showDatabases		#stmtShowDB
;

createDatabase
:	CREATE DATABASE ID
;

alterDatabase
:	ALTER DATABASE ID renameDatabase
;

renameDatabase
:	RENAME TO ID
;

dropDatabase
:	DROP DATABASE ID
;

showDatabases
:	SHOW DATABASES ID
;

useDatabase
:	USE DATABASE ID
;

createTable
:	CREATE TABLE ID '(' (ID tipoId ',')* ID tipoId CONSTRAINT cKey 
;

tipoId
:	INT										#tipoIdInt
|	FLOAT									#tipoIdFloat
|	DATE									#tipoIdDate
|	CHAR '(' NUM ')'						#tipoIdChar
;

cKey
:	ID PRIMARY KEY '(' (ID ',')* ID ')'											#cKeyPK
|	ID FOREIGN KEY '(' (ID ',')* ID ')' REFERENCES ID '(' (ID ',')* ID ')'		#cKeyFK
|	ID CHECK '(' atom ')'														#cKeyCHK
;
 
booleanExpression
:	or
;

or
:	and (OR and)*
;

and
:	not (AND not)*
;

not
:	NOT atom		#notNotAtom
|	atom			#notAtom
;

atom
:	ID								#atomID
|	'(' booleanExpression ')'		#atomExp
;
 
statementTable
:	alterTable			#stmtAlterTable
|	renameTable			#stmtRenameTable
|	actionTable			#stmtActionTable
|	showTables			#stmtShowTables
|	dropTable			#stmtDropTable
|	showColumnsFrom		#stmtShowColsFrom
;

alterTable
:	ALTER TABLE ID renameTable							#alterTableRename
|	ALTER TABLE ID (actionTable ','* actionTable)		#alterTableAction
;

renameTable
:	RENAME TO ID
;

actionTable
:	addColumn tipoId (cKey ',')* cKey		#actTableAddCol
|	addConstraint cKey						#actTableAddCnst
|	dropColumn								#actTableDropCol
|	dropConstraint							#actTableDropCnst
;

addColumn
:	ADD COLUMN ID
;

addConstraint
:	ADD CONSTRAINT ID
;

dropColumn
:	DROP COLUMN ID
;

dropConstraint
:	DROP CONSTRAINT ID '_' ID
;

showTables
:	SHOW TABLES ID
;

dropTable
:	DROP TABLE ID
;

showColumnsFrom
:	SHOW COLUMNS FROM ID
;

/*************************DML*************************/

statementData
:	insert
|	update
|	delete
|	select
;

insert
:	INSERT INTO ID '(' ID (',' ID)* ')' VALUES '(' tipoId (',' tipoId)* ')'
;

update
:	UPDATE ID SET ID '=' tipoId (',' tipoId)* (WHERE condicion)? 
;

delete
:	DELETE FROM ID (WHERE condicion)? 
;

select
:	SELECT ('*' | ID (',' ID)* ) FROM ID (WHERE condicion)? (ORDER BY ID (ASC | DESC) ( ',' ID (ASC | DESC))*)?
;

condicion
:	ID AND ID
|	ID OR ID
|	NOT ID
|	ID LOGICAL ID 
;

extra
:	(AND condicion)+ (OR condicion)+
;
