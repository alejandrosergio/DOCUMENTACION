/* FUNCION CALCULA EDAD */

CREATE OR REPLACE FUNCTION calcula_edad ( agno_nacimiento IN DATE )

RETURN NUMBER

IS

agno_actual date := sysdate;
edad number(3) := 0;

BEGIN

    edad := to_char(agno_actual,'YYYY') - to_char(agno_nacimiento,'YYYY');

    RETURN edad;

END;
/

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

SET SERVEROUTPUT ON;

DECLARE

    edad number := calcula_edad('24-FEB-2000');

BEGIN

    dbms_output.put_line('Su edad es de: ' || edad || ' años'); 

END;
/