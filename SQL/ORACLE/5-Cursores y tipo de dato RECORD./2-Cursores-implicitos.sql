SET SERVEROUTPUT ON;

DECLARE

BEGIN

    UPDATE EMPLEADOS SET ACTUALIZADO = SYSDATE;

    dbms_output.put_line('Campos afectados: ' || SQL%ROWCOUNT); -- Contiene en cursor implicito de la ultima ejecución


    COMMIT; -- El commit guarda definitivamente se ejecuta despues ya que destruye el cursor
    ROLLBACK; -- EL rollback para que nada pase, se ejecuta la query pero no afecta la tabla


    IF( SQL%FOUND) THEN -- Devuelve un booleano TRUE or FALSE -- EL NOTFOUND es lo mismo inverso
        dbms_output.put_line('SE ENCONTRO REGISTROS');
    ELSE
        dbms_output.put_line('NO SE ENCONTRARON REGISTROS :C');
    END IF;

END;
/