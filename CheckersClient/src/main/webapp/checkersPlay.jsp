<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<head><title>Checkers Game - Play!</title></head>
<style>
canvas 
{
    border: 1px solid #d3d3d3;
    background-color: #f1f1f1;
}
</style>
</head>
<h1>Welcome to Checkers!</h1>
<body onload="startGame()">
<script>

function startGame() 
{
    myGameArea.start();
    }
var myGameArea = 
	 {
		  canvas : document.createElement("canvas"),
		  start : function() 
		  {
        this.canvas.width = 400;
        this.canvas.height = 400;
        this.context = this.canvas.getContext("2d");
        this.context.fillStyle = "#FF0000";
        this.context.fillRect(0,0,50,50);
        this.context.fillRect(100,0,50,50);
        this.context.fillRect(200,0,50,50);
        this.context.fillRect(300,0,50,50);
        this.context.fillRect(50,50,50,50);
        this.context.fillRect(150,50,50,50);
        this.context.fillRect(250,50,50,50);
        this.context.fillRect(350,50,50,50);
        this.context.fillRect(0,100,50,50);
        this.context.fillRect(100,100,50,50);
        this.context.fillRect(200,100,50,50);
        this.context.fillRect(300,100,50,50);
        this.context.fillRect(50,150,50,50);
        this.context.fillRect(150,150,50,50);
        this.context.fillRect(250,150,50,50);
        this.context.fillRect(350,150,50,50);
        this.context.fillRect(0,200,50,50);
        this.context.fillRect(100,200,50,50);
        this.context.fillRect(200,200,50,50);
        this.context.fillRect(300,200,50,50);
        this.context.fillRect(50,250,50,50);
        this.context.fillRect(150,250,50,50);
        this.context.fillRect(250,250,50,50);
        this.context.fillRect(350,250,50,50);
        this.context.fillRect(0,300,50,50);
        this.context.fillRect(100,300,50,50);
        this.context.fillRect(200,300,50,50);
        this.context.fillRect(300,300,50,50);
        this.context.fillRect(50,350,50,50);
        this.context.fillRect(150,350,50,50);
        this.context.fillRect(250,350,50,50);
        this.context.fillRect(350,350,50,50);
        this.context.fillStyle = "#000000";
        this.context.fillRect(50,0,50,50);
        this.context.fillRect(150,0,50,50);
        this.context.fillRect(250,0,50,50);
        this.context.fillRect(350,0,50,50);
        this.context.fillRect(0,50,50,50);
        this.context.fillRect(100,50,50,50);
        this.context.fillRect(200,50,50,50);
        this.context.fillRect(300,50,50,50);
        this.context.fillRect(50,100,50,50);
        this.context.fillRect(150,100,50,50);
        this.context.fillRect(250,100,50,50);
        this.context.fillRect(350,100,50,50);
        this.context.fillRect(00,150,50,50);
        this.context.fillRect(100,150,50,50);
        this.context.fillRect(200,150,50,50);
        this.context.fillRect(300,150,50,50);
        this.context.fillRect(50,200,50,50);
        this.context.fillRect(150,200,50,50);
        this.context.fillRect(250,200,50,50);
        this.context.fillRect(350,200,50,50);
        this.context.fillRect(0,250,50,50);
        this.context.fillRect(100,250,50,50);
        this.context.fillRect(200,250,50,50);
        this.context.fillRect(300,250,50,50);
        this.context.fillRect(50,300,50,50);
        this.context.fillRect(150,300,50,50);
        this.context.fillRect(250,300,50,50);
        this.context.fillRect(350,300,50,50);
        this.context.fillRect(0,350,50,50);
        this.context.fillRect(100,350,50,50);
        this.context.fillRect(200,350,50,50);
        this.context.fillRect(300,350,50,50);
        var playerOne1x = <%=request.getAttribute("playerOne1x")%>
        var playerOne1y = <%=request.getAttribute("playerOne1y")%>
        var playerOne2x = <%=request.getAttribute("playerOne2x")%>
        var playerOne2y = <%=request.getAttribute("playerOne2y")%>
        var playerOne3x = <%=request.getAttribute("playerOne3x")%>
        var playerOne3y = <%=request.getAttribute("playerOne3y")%>
        var playerOne4x = <%=request.getAttribute("playerOne4x")%>
        var playerOne4y = <%=request.getAttribute("playerOne4y")%>
        
        var playerOne5x = <%=request.getAttribute("playerOne5x")%>
        var playerOne5y = <%=request.getAttribute("playerOne5y")%>
        var playerOne6x = <%=request.getAttribute("playerOne6x")%>
        var playerOne6y = <%=request.getAttribute("playerOne6y")%>
        var playerOne7x = <%=request.getAttribute("playerOne7x")%>
        var playerOne7y = <%=request.getAttribute("playerOne7y")%>
        var playerOne8x = <%=request.getAttribute("playerOne8x")%>
        var playerOne8y = <%=request.getAttribute("playerOne8y")%>
        
        var playerOne9x = <%=request.getAttribute("playerOne9x")%>
        var playerOne9y = <%=request.getAttribute("playerOne9y")%>
        var playerOne10x = <%=request.getAttribute("playerOne10x")%>
        var playerOne10y = <%=request.getAttribute("playerOne10y")%>
        var playerOne11x = <%=request.getAttribute("playerOne11x")%>
        var playerOne11y = <%=request.getAttribute("playerOne11y")%>
        var playerOne12x = <%=request.getAttribute("playerOne12x")%>
        var playerOne12y = <%=request.getAttribute("playerOne12y")%>
        
        var playerTwo1x = <%=request.getAttribute("playerTwo1x")%>
        var playerTwo1y = <%=request.getAttribute("playerTwo1y")%>
        var playerTwo2x = <%=request.getAttribute("playerTwo2x")%>
        var playerTwo2y = <%=request.getAttribute("playerTwo2y")%>
        var playerTwo3x = <%=request.getAttribute("playerTwo3x")%>
        var playerTwo3y = <%=request.getAttribute("playerTwo3y")%>
        var playerTwo4x = <%=request.getAttribute("playerTwo4x")%>
        var playerTwo4y = <%=request.getAttribute("playerTwo4y")%>
        
        var playerTwo5x = <%=request.getAttribute("playerTwo5x")%>
        var playerTwo5y = <%=request.getAttribute("playerTwo5y")%>
        var playerTwo6x = <%=request.getAttribute("playerTwo6x")%>
        var playerTwo6y = <%=request.getAttribute("playerTwo6y")%>
        var playerTwo7x = <%=request.getAttribute("playerTwo7x")%>
        var playerTwo7y = <%=request.getAttribute("playerTwo7y")%>
        var playerTwo8x = <%=request.getAttribute("playerTwo8x")%>
        var playerTwo8y = <%=request.getAttribute("playerTwo8y")%>
        
        var playerTwo9x = <%=request.getAttribute("playerTwo9x")%>
        var playerTwo9y = <%=request.getAttribute("playerTwo9y")%>
        var playerTwo10x = <%=request.getAttribute("playerTwo10x")%>
        var playerTwo10y = <%=request.getAttribute("playerTwo10y")%>
        var playerTwo11x = <%=request.getAttribute("playerTwo11x")%>
        var playerTwo11y = <%=request.getAttribute("playerTwo11y")%>
        var playerTwo12x = <%=request.getAttribute("playerTwo12x")%>
        var playerTwo12y = <%=request.getAttribute("playerTwo12y")%>
        var radius = 25;
        var pi2 = 2 * Math.PI;
        this.context.beginPath();
        this.context.arc(playerOne1x, playerOne1y, radius, 0, pi2, false);
        this.context.arc(playerOne2x, playerOne2y, radius, 0, pi2, false);
        this.context.arc(playerOne3x, playerOne3y, radius, 0, pi2, false);
        this.context.arc(playerOne4x, playerOne4y, radius, 0, pi2, false);
        this.context.fillStyle = 'blue';
        this.context.fill();
        this.context.closePath();
        
        this.context.beginPath();
        this.context.arc(playerOne5x, playerOne5y, radius, 0, pi2, false);
        this.context.arc(playerOne6x, playerOne6y, radius, 0, pi2, false);
        this.context.arc(playerOne7x, playerOne7y, radius, 0, pi2, false);
        this.context.arc(playerOne8x, playerOne8y, radius, 0, pi2, false);
        this.context.fillStyle = 'blue';
        this.context.fill();
        this.context.closePath();
        
        this.context.beginPath();
        this.context.arc(playerOne9x, playerOne9y, radius, 0, pi2, false);
        this.context.arc(playerOne10x, playerOne10y, radius, 0, pi2, false);
        this.context.arc(playerOne11x, playerOne11y, radius, 0, pi2, false);
        this.context.arc(playerOne12x, playerOne12y, radius, 0, pi2, false);
        this.context.fillStyle = 'blue';
        this.context.fill();
        this.context.closePath();
        
        this.context.beginPath();
        this.context.arc(playerTwo1x, playerTwo1y, radius, 0, pi2, false);
        this.context.arc(playerTwo2x, playerTwo2y, radius, 0, pi2, false);
        this.context.arc(playerTwo3x, playerTwo3y, radius, 0, pi2, false);
        this.context.arc(playerTwo4x, playerTwo4y, radius, 0, pi2, false);
        this.context.fillStyle = 'white';
        this.context.fill();
        this.context.closePath();
        
        this.context.beginPath();
        this.context.arc(playerTwo5x, playerTwo5y, radius, 0, pi2, false);
        this.context.arc(playerTwo6x, playerTwo6y, radius, 0, pi2, false);
        this.context.arc(playerTwo7x, playerTwo7y, radius, 0, pi2, false);
        this.context.arc(playerTwo8x, playerTwo8y, radius, 0, pi2, false);
        this.context.fillStyle = 'white';
        this.context.fill();
        this.context.closePath();
        
        this.context.beginPath();
        this.context.arc(playerTwo9x, playerTwo9y, radius, 0, pi2, false);
        this.context.arc(playerTwo10x, playerTwo10y, radius, 0, pi2, false);
        this.context.arc(playerTwo11x, playerTwo11y, radius, 0, pi2, false);
        this.context.arc(playerTwo12x, playerTwo12y, radius, 0, pi2, false);
        this.context.fillStyle = 'white';
        this.context.fill();
        this.context.closePath();
        
        document.body.insertBefore(this.canvas, document.body.childNodes[0]);
        
        }
}

</script>

</body></html>
