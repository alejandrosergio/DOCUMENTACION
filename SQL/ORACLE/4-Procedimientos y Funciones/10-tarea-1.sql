CREATE OR REPLACE FUNCTION promedio_notas ( n1 IN NUMBER, n2 IN NUMBER, n3 IN NUMBER, n4 IN NUMBER )

RETURN NUMBER

IS

    promedio number(5,2) := 0;

BEGIN

    promedio := (n1 + n2 + n3 + n4) / 4;

    RETURN promedio;

END;
/

----------------------------------------------------------
----------------------------------------------------------

SELECT A.*,promedio_notas(NOTA1,NOTA2,NOTA3,NOTA4) AS promedio FROM NOTAS A;