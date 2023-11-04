CREATE PROCEDURE deleteCustomer
	@cid INT
	
AS
	BEGIN
		DELETE FROM dbo.Customer WHERE Id=@cid
	END