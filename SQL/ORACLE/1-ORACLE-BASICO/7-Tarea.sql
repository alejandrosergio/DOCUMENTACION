SET SERVEROUTPUT ON;

DECLARE

    numeroCamisetas CONSTANT number := 5;
    montoCamiseta CONSTANT number := 19.99;

    subtotal number;
    inpuestoVentas number;
    totalPagar number;

BEGIN

    dbms_output.put_line('Numero Camisetas: ' || numeroCamisetas);
    dbms_output.put_line('Monto por Camiseta: ' || montoCamiseta);

    subtotal := numeroCamisetas * montoCamiseta;

    dbms_output.put_line('Sub Total: ' || NVL(subtotal,0));

    inpuestoVentas := subtotal * 0.15;

    dbms_output.put_line('Inpuesto Sobre Venta: ' || NVL(inpuestoVentas,0));

    totalPagar := subtotal + inpuestoVentas;

    dbms_output.put_line('Total a pagar: ' || NVL(totalPagar,0));

END;
/