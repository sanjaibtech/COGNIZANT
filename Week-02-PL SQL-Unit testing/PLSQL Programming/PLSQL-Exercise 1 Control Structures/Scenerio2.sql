BEGIN
  FOR i IN (SELECT CustomerID, Balance FROM Customers) LOOP
    IF i.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP = 'Y'
      WHERE CustomerID = i.CustomerID;
    END IF;
  END LOOP;
END;
/
