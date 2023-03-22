declare 
a integer;
b integer;
c integer;

begin
a:=&a;
b:=&b;
c:=&c;
if((a> b) and (a>c)) then 
   dbms_output.put_line(a);
elsif((b>c) and (b>a)) then 
   dbms_output.put_line(b);
else 
    dbms_output.put_line(c);
end if;
end;
  /