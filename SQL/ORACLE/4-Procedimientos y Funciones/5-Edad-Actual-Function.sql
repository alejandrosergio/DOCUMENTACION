CREATE OR REPLACE FUNCTION edad_actual( fecha_naci  IN DATE  )

RETURN NUMBER 

IS
    edad number(3):=0;

BEGIN

    edad:=  trunc( ( to_number( to_char(sysdate,'yyyymmdd') ) - to_number( to_char( fecha_naci,'yyyymmdd' ) ) ) / 10000 );
    
    return edad;
    
    EXCEPTION WHEN OTHERS THEN
    edad:=0;
    
    RETURN  edad;    

END;
/


--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

SELECT fechanaci, edad_actual( fechanaci ), sysdate FROM EMPLEADOS
WHERE edad_actual( fechanaci ) >= 35;