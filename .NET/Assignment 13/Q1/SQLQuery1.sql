CREATE PROCEDURE addCustomer
	@cname NVARCHAR(Max),
	@caddress NVARCHAR(Max),
	@cmobno NCHAR(10)

AS
	BEGIN
	INSERT INTO dbo.Customer(Name, Address, MobileNumber) VALUES (@cname, @caddress, @cmobno)
	END